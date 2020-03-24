package com.mun.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mun.course.entities.Product;

@Repository // Optional, because JpaRepository already use the Repository annotation
public interface ProductRepository extends JpaRepository<Product, Long>{

}
