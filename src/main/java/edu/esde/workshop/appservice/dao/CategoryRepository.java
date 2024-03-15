package edu.esde.workshop.appservice.dao;

import edu.esde.workshop.appservice.model.entity.CategoryEntity;

public interface CategoryRepository {

    CategoryEntity findById(Long id);
}
