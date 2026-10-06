package com.salesianos.dam.primerjemplo.utils;

import com.salesianos.dam.primerjemplo.dto.EditProductDto;
import com.salesianos.dam.primerjemplo.model.Category;
import com.salesianos.dam.primerjemplo.service.CategoryService;
import com.salesianos.dam.primerjemplo.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataSeed {

    private final CategoryService categoryService;
    private final ProductService productService;

    @PostConstruct
    public void initData() {
        categoryService.addCategory(Category.builder().name("Alimentación").build());
        categoryService.addCategory(Category.builder().name("Bebidas").build());
        categoryService.addCategory(Category.builder().name("Higiene").build());

        productService.addProduct(new EditProductDto(
                "Pan", 1.0, "Barra de pan"));
        productService.addProduct(new EditProductDto(
                "Agua", 0.75, "Botella de agua"));
    }

}
