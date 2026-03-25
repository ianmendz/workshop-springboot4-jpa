package com.portfolio.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
