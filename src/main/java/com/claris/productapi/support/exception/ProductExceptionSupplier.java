package com.claris.productapi.support.exception;

import java.util.function.Supplier;

public class ProductExceptionSupplier {

    public static Supplier<ProductNotFoundException> get() {
        return () -> new ProductNotFoundException("Product not found");
    }
}