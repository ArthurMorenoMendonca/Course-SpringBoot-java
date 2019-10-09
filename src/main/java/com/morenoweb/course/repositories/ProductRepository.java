package com.morenoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morenoweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
