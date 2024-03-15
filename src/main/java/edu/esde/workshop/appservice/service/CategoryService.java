package edu.esde.workshop.appservice.service;

import edu.esde.workshop.appservice.dao.CategoryRepository;
import edu.esde.workshop.appservice.model.entity.CategoryEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryEntity findById(Long id) {
        log.info("Setting category with id: {}", id);
        return categoryRepository.findById(id);
    }
}
