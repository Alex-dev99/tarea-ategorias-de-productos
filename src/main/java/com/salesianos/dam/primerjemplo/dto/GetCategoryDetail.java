package com.salesianos.dam.primerjemplo.dto;

import com.salesianos.dam.primerjemplo.model.Category;

public record GetCategoryDetail(Long id, String name) {

    public static GetCategoryDetail of(Category category) {
        return new GetCategoryDetail(category.getId(), category.getName());
    }
}
