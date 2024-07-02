package com.blogapp.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	private int categoryId;
	
	@NotBlank
	@Size(min=4, message="Minimun size should be 4")
	private String CategoryTitle;
	
	@NotBlank
	@Size(min=10, message="Minimun size should be 10")
	private String categoryDescription;
	

}
