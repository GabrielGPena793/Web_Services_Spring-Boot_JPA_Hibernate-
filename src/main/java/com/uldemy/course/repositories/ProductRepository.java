package com.uldemy.course.repositories;

import com.uldemy.course.entities.Category;
import com.uldemy.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
