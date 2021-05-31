package com.jeonghwa.moment.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	boolean existsById(String id);

}
