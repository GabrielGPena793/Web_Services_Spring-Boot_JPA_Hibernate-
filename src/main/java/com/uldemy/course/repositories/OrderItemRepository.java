package com.uldemy.course.repositories;

import com.uldemy.course.entities.OrderItem;
import com.uldemy.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
