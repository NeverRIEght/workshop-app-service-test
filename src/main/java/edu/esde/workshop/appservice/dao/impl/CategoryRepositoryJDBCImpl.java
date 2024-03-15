package edu.esde.workshop.appservice.dao.impl;

import edu.esde.workshop.appservice.dao.CategoryRepository;
import edu.esde.workshop.appservice.dao.mapper.CategoryRowMapper;
import edu.esde.workshop.appservice.model.entity.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryRepositoryJDBCImpl implements CategoryRepository {

    private static final String FIND_BY_ID_SQL = "SELECT * FROM CATEGORY WHERE ID = :id";

    private final NamedParameterJdbcTemplate jdbcTemplate;
    private final CategoryRowMapper rowMapper;
    @Override
    public CategoryEntity findById(Long id) {
        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("id", id);
        return jdbcTemplate.queryForObject(FIND_BY_ID_SQL, parameterSource, rowMapper);
    }
}
