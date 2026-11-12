package com.claris.productapi.repository;

import com.claris.productapi.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private final Map<Long, Product> products = new HashMap<>();
    private Long id = 1L;

    public Product save(Product product) {
        product.setId(id);
        products.put(id, product);
        id++;
        return product;
    }

    public Product findById(Long id) {
        return products.get(id);
    }
}
