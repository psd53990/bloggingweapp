package com.blogapp.blog.services;

import java.util.List;

import com.blogapp.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto category, Integer categoryId);
	
	//get
	CategoryDto getCategory(Integer categoryId);
	
	
	
	//delete
	void deleteCategory(Integer categoryId);
	
	
	//getall
	List<CategoryDto> getCategories();

}
