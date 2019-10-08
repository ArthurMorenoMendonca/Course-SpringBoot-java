package com.morenoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morenoweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
