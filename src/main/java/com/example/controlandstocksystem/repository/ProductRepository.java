package com.example.controlandstocksystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controlandstocksystem.model.Product;
public interface ProductRepository extends JpaRepository<Product,Integer>{

}
