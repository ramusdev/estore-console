package com.rb.model;

import java.util.HashMap;
import java.util.List;

public class Shop {

    private HashMap<Product, Integer> warehouse;

    public Shop() {
        this.warehouse = new HashMap<>();
    }

    public HashMap<Product, Integer> getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(HashMap<Product, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public void addProduct(Product product, int quantity) {
        if (warehouse.containsKey(product)) {
            int quantityOld = warehouse.get(product);
            warehouse.put(product, quantityOld + quantity);
        } else {
            warehouse.put(product, quantity);
        }
    }

    public void addProducts(List<ProductWrapper> productWrapperList) {
        for (ProductWrapper productWrapper : productWrapperList) {
            Product product = productWrapper.getProduct();
            Integer quantity = productWrapper.getQuantity();

            if (warehouse.containsKey(product)) {
                int quantityOld = warehouse.get(product);
                warehouse.put(product, quantityOld + quantity);
            } else {
                warehouse.put(product, quantity);
            }
        }
    }
}
