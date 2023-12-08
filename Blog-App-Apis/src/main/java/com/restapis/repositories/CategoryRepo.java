package com.restapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapis.entities.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer> {

}