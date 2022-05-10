package com.cdd.scheduler.category;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired 
    private CategoryRepository categoryRepository;

    public List<CategoryDTO> fetchCategories(){
        return this.toCategoryDTOList(this.categoryRepository.findAll());
    }

    public CategoryDTO toCategoryDTO(Category category){
		CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.categoryID = category.getCategoryID();
        categoryDTO.description = category.getDescription();
		return categoryDTO;
	}
	public List<CategoryDTO> toCategoryDTOList(List<Category> categories){
		return categories.stream().map(category -> this.toCategoryDTO(category)).collect(Collectors.toList());
	}

	public Category toCategoryEntity(CategoryDTO categoryDTO){
		Category category = new Category();
        category.setCategoryID(categoryDTO.categoryID);
        category.setDescription(categoryDTO.description);
		return category;
	}
	public List<Category> toCategoryEntityList(List<CategoryDTO> categoriesDTO){
		return categoriesDTO.stream().map(category -> this.toCategoryEntity(category)).collect(Collectors.toList());
	}

}
