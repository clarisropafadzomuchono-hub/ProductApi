package com.claris.productapi.service;

import java.util.List;
import java.util.stream.Collectors;
import com.claris.productapi.api.request.ProductRequest;
import com.claris.productapi.api.response.ProductResponse;
import com.claris.productapi.domain.Product;
import com.claris.productapi.repository.ProductRepository;
import com.claris.productapi.support.ProductMapper;
import com.claris.productapi.support.exception.ProductExceptionSupplier;
import com.claris.productapi.api.request.UpdateProductRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper = new ProductMapper();

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse save(ProductRequest request) {

        Product product = mapper.map(request);

        Product savedProduct = repository.save(product);

        return mapper.map(savedProduct);
    }

    public ProductResponse find(Long id) {

        Product product = repository.findById(id).orElse(null);

        if (product == null) {
            throw ProductExceptionSupplier.get().get();
        }

        return mapper.map(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest request) {

        Product product = repository.findById(id).orElse(null);

        if (product == null) {
            throw ProductExceptionSupplier.get().get();
        }

        product.setName(request.getName());

        Product updatedProduct = repository.save(product);

        return mapper.map(updatedProduct);
    }

    public List<ProductResponse> findAll() {

        return repository.findAll()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public void delete(Long id) {

        Product product = repository.findById(id).orElse(null);

        if (product == null) {
            throw ProductExceptionSupplier.get().get();
        }

        repository.deleteById(id);
    }

}
