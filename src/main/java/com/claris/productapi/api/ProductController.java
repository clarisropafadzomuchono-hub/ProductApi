package com.claris.productapi.api;

import com.claris.productapi.api.request.ProductRequest;
import com.claris.productapi.api.response.ProductResponse;
import com.claris.productapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService = new ProductService();

    @PostMapping
    public ProductResponse save(@RequestBody ProductRequest request) {
        return productService.save(request);
    }

    @GetMapping("/{id}")
    public ProductResponse find(@PathVariable Long id) {
        return productService.find(id);
    }
}
