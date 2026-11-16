package com.claris.productapi.api;

import com.claris.productapi.api.request.UpdateProductRequest;
import com.claris.productapi.api.request.ProductRequest;
import com.claris.productapi.api.response.ProductResponse;
import com.claris.productapi.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductResponse save(@RequestBody ProductRequest request) {
        return productService.save(request);
    }

    @GetMapping("/{id}")
    public ProductResponse find(@PathVariable Long id) {
        return productService.find(id);
    }

    @GetMapping
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }


    @PutMapping("/{id}")
    public ProductResponse update(
            @PathVariable Long id,
            @RequestBody UpdateProductRequest request) {

        return productService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
