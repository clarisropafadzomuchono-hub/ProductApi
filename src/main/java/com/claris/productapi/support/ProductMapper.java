package com.claris.productapi.support;

import com.claris.productapi.api.request.ProductRequest;
import com.claris.productapi.api.response.ProductResponse;
import com.claris.productapi.domain.Product;

public class ProductMapper {

    public Product map(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        return product;
    }

    public ProductResponse map(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName()
        );
    }
}