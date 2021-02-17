package com.softuni.demo.repository;

import com.softuni.demo.models.entity.Category;
import com.softuni.demo.models.entity.CategoryEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    Optional<Category> findByName(CategoryEnum name);
}
