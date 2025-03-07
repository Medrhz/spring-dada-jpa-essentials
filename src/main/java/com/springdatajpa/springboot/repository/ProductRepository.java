package com.springdatajpa.springboot.repository;

import com.springdatajpa.springboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByDataCreatedBetween (LocalDateTime startDate, LocalDateTime endDate);
}
