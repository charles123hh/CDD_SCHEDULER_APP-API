package com.cdd.scheduler.category;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/schedule/categories")
public class CategoryController {
   
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public List<CategoryDTO> getCategories(){
        return this.categoryService.fetchCategories()
                .stream()
                .map(category -> this.modelMapper.map(category, CategoryDTO.class))
				.collect(Collectors.toList());
    }

}
