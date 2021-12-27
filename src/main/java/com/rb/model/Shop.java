package com.rb.model;

import com.rb.exceptions.NoProductFoundException;

import java.util.HashMap;
import java.util.List;

public class Shop {

    private static Shop instance;
    private HashMap<Product, Integer> warehouse;

    private Shop() {
        this.warehouse = new HashMap<>();
    }

    public static Shop getInstance() {
        if (Shop.instance != null) {
            return Shop.instance;
        } else {
            Shop.instance = new Shop();
            return Shop.instance;
        }
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

    public void delete(Product product, int quantity) throws Exception {
        Integer quantityOld = warehouse.get(product);

        if (quantityOld < quantity) {
            throw new Exception("Error store does not have enough items");
        }

        int quantityNew = quantityOld - quantity;
        warehouse.put(product, quantityNew);

        if (quantityNew < 1) {
            warehouse.remove(product);
        }
    }
}
