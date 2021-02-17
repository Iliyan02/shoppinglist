package com.softuni.demo.service;

import com.softuni.demo.models.entity.CategoryEnum;
import com.softuni.demo.models.service.ProductServiceModel;
import com.softuni.demo.models.view.ProductViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel map);
    BigDecimal getTotalSum();
    
    List<ProductViewModel> findAllProductsByCategory(CategoryEnum categoryEnum);

    void buyById(String id);

    void buyAll();

}
