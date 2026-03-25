package com.portfolio.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
