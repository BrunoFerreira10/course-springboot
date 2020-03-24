package com.mun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mun.course.entities.Order;

@Repository // Optional, because JpaRepository already use the Repository annotation
public interface OrderRepository extends JpaRepository<Order, Long>{

}
