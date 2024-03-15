package edu.esde.workshop.appservice.dao.mapper;

import edu.esde.workshop.appservice.model.entity.CategoryEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CategoryRowMapper implements RowMapper<CategoryEntity> {

    @Override
    public CategoryEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return CategoryEntity.builder()
                .id(rs.getLong("ID"))
                .name(rs.getNString("NAME"))
                .parentID(rs.getLong("PARENT_ID")).build();
    }
}
