package com.rb.model;

import com.rb.exceptions.NoProductFoundException;

public class ProductWrapper {
    private Product product;
    private int quantity;

    public ProductWrapper(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        // if (product == null) {
            // throw new NoProductFoundException("Error no product inside wrapper");
        // }

        // System.out.println("This throws inside product wrappper");
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
