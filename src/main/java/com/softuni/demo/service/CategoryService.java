package com.softuni.demo.service;

import com.softuni.demo.models.entity.Category;
import com.softuni.demo.models.entity.CategoryEnum;

public interface CategoryService {
    void initCategories();

    Category findByName(CategoryEnum categoryEnum);
}
