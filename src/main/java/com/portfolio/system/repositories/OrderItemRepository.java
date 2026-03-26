package com.portfolio.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.system.entities.OrderItem;
import com.portfolio.system.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
