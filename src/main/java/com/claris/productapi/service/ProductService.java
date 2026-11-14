package com.claris.productapi.service;

import com.claris.productapi.api.request.ProductRequest;
import com.claris.productapi.api.response.ProductResponse;
import com.claris.productapi.domain.Product;
import com.claris.productapi.repository.ProductRepository;
import com.claris.productapi.support.ProductMapper;
import com.claris.productapi.support.exception.ProductExceptionSupplier;

public class ProductService {

    private final ProductRepository repository = new ProductRepository();
    private final ProductMapper mapper = new ProductMapper();

    public ProductResponse save(ProductRequest request) {

        Product product = mapper.map(request);

        Product savedProduct = repository.save(product);

        return mapper.map(savedProduct);
    }

    public ProductResponse find(Long id) {

        Product product = repository.findById(id);

        if (product == null) {
            throw ProductExceptionSupplier.get().get();
        }

        return mapper.map(product);
    }
}
