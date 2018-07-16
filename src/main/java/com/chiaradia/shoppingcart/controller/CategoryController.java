package com.chiaradia.shoppingcart.controller;

import com.chiaradia.shoppingcart.domain.Category;
import com.chiaradia.shoppingcart.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController
{
    private final CategoryService categoryService;


    @Autowired
    public CategoryController(final CategoryService categoryService)
    {
        this.categoryService = categoryService;
    }


    @GetMapping("/{id}")
    public Category findCategory(@PathVariable("id") Integer id)
    {
        return this.categoryService.findCategory(id);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category createCategory(@RequestBody Category category)
    {
        category.setId(null);
        return this.categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable("id") Integer id, @RequestBody Category category)
    {
        category.setId(id);
        return this.categoryService.updateCategory(category);
    }


}
