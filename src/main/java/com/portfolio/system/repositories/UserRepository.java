package com.portfolio.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
