package com.example.PerfectPixelArt.repository;

import com.example.PerfectPixelArt.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
