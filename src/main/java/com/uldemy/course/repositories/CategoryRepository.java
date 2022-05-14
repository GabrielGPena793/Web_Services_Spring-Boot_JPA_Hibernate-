package com.uldemy.course.repositories;

import com.uldemy.course.entities.Category;
import com.uldemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
