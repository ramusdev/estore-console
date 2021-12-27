package com.rb.view;

import com.rb.exceptions.NoProductFoundException;
import com.rb.model.Product;
import com.rb.model.ProductWrapper;

import java.util.List;

public class CartView {
    private List<ProductWrapper> products;
    private double totalPrice;

    public CartView(List<ProductWrapper> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public void show() {
        // System.out.println(products.size());

        System.out.println("|------------------ Cart ---------------------|");
        System.out.println("| product              id    quantity   price |");
        System.out.println("|                                             |");
        for (ProductWrapper productWrapper : products) {
            Product product = productWrapper.getProduct();
            int quantity = productWrapper.getQuantity();

            System.out.format("| %-20s %-9d %-7d %.2f |\n",
                    product.getName(),
                    product.getId(),
                    quantity,
                    product.getPrice());
        }
        System.out.println("|                                             |");
        System.out.format("| Total price                           %.2f |\n", totalPrice);
        System.out.println("|---------------------------------------------|\n");
    }
}
