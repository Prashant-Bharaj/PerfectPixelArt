package com.example.PerfectPixelArt.repository;

import com.example.PerfectPixelArt.model.OrderProduct;
import com.example.PerfectPixelArt.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
