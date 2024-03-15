package edu.esde.workshop.appservice.controller;

import edu.esde.workshop.appservice.model.entity.CategoryEntity;
import edu.esde.workshop.appservice.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/categories/{id}")
    public CategoryEntity findById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

}
