package com.softuni.demo.models.binding;

import com.softuni.demo.models.entity.CategoryEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.security.DenyAll;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductAddBindingModel {
    @NotBlank(message = "Cannot be empty")
    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters")
    private String name;
    @NotBlank(message = "Cannot be empty")
    @Size(min = 5, message = "Description must be min 5 characters")
    private String description;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @FutureOrPresent(message = "The date cannot be in the past")
    private LocalDateTime neededBefore;
    @DecimalMin(value = "0", message = "Price must be positive")
    private BigDecimal price;
    @NotNull(message = "You must select the category")
    private CategoryEnum category;
}
