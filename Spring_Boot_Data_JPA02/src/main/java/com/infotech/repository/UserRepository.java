package com.infotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infotech.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
