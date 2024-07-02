package com.blogapp.blog.exceptions;

import lombok.Getter;
import lombok.Setter;

//This exceptions will be raised when db dont contains userId. will throw a exception
@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{

	
	String ResourceName;
	String fieldName;
	long fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		ResourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	
}
