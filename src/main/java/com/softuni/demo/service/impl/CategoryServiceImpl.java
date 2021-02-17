package com.softuni.demo.service.impl;

import com.softuni.demo.models.entity.Category;
import com.softuni.demo.models.entity.CategoryEnum;
import com.softuni.demo.repository.CategoryRepository;
import com.softuni.demo.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if (categoryRepository.count() == 0){
            Arrays.stream(CategoryEnum.values())
                    .forEach(categoryEnum -> {
                        Category category = new Category(categoryEnum,
                                "Description for " + categoryEnum.name());
                        categoryRepository.save(category);
                    });
        }
    }

    @Override
    public Category findByName(CategoryEnum categoryEnum) {
        return categoryRepository.findByName(categoryEnum)
                .orElse(null);
    }
}
