package com.blogapp.blog.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postId;
	
	@Column(name="post_table",length=100,nullable=false)
	private String title;
	
	@Column(length=1000)
	private String content;
	
	
	private String imageName;
	
	
	private Date addDate;

	@ManyToOne
	@JoinColumn(name = "Category_id")
	private Category category;
	
	@ManyToOne
	private User user;
	
}
