package com.acme.oop.sales.domain.model.valueobjects;

import java.util.UUID;
/**
 * Represents a unique identifier for a product in the sales domain.
 * This value object is immutable and ensures that the productId is always present.
 * @param productId the unique identifier for the product, it must not be null.
 * @Author Open Source Application Development Team
 * @version 1.0.0
 */
public record ProductId(UUID productId) {
    /**
     * Creates a new ProductId with a random UUID.
     */
    public ProductId(){
        this(UUID.randomUUID());
    }
    /**
     * Validates that the productId is not null.
     * @param productId the unique identifier for the product, it must not be null.
     * @throws IllegalArgumentException if the productId is null.
     */
    public ProductId{
        if(productId==null){
            throw new IllegalArgumentException("ProductId cannot be null");

        }
    }

}
