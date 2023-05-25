package com.danieln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieln.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
