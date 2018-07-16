package com.chiaradia.shoppingcart.service;

import com.chiaradia.shoppingcart.domain.Category;
import com.chiaradia.shoppingcart.exception.EntityNotFoundException;
import com.chiaradia.shoppingcart.repository.CategoryRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService
{
    private final CategoryRepository categoryRepository;


    @Autowired
    public CategoryService(final CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }


    public Category findCategory(Integer id)
    {
        return findCategoryChecked(id);
    }


    public Category createCategory(Category category)
    {

        return this.categoryRepository.save(category);
    }


    public Category updateCategory(Category category)
    {
        findCategoryChecked(category.getId());
        return this.categoryRepository.save(category);
    }


    private Category findCategoryChecked(Integer id)
    {
        return this.categoryRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Could not find entity with id: " + id));
    }


}
