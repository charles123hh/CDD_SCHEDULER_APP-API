package com.cdd.scheduler.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired 
    private CategoryRepository categoryRepository;

    public List<Category> fetchCategories(){
        return this.categoryRepository.findAll();
    }

}
