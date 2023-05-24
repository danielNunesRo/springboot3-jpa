package com.danieln.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danieln.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
