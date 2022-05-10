package com.cdd.scheduler.category;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/schedule/categories")
public class CategoryController {
   
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getCategories(){
        return this.categoryService.fetchCategories();
    }

}
