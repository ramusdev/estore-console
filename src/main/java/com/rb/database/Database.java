package com.rb.database;

import com.rb.exceptions.NoProductFoundException;
import com.rb.model.Product;
import com.rb.model.ProductWrapper;
import com.rb.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database {
    private static Database instance;
    private HashMap<Long, ProductWrapper> products;
    private List<User> users;

    private Database() {
        this.products = new HashMap<>();
        this.users = new ArrayList<>();
    }

    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }

        return Database.instance;
    }

    public void insert(long id, ProductWrapper productWrapper) {
        products.put(id, productWrapper);
    }

    public ProductWrapper getProduct(long id) {

        // System.out.println("From get product");
        // System.out.println(products.get(id));

        // if (products.get(id) == null) {
            // throw new NoProductFoundException("Error product found exception");
        // }

        return products.get(id);
    }

    public List<ProductWrapper> getProducts() {
        List<ProductWrapper> products = new ArrayList<>(this.products.values());
        return products;
    }

    public void insertUser(User user) {
        users.add(user);
    }

    public User getUser(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }

    // public void update(Product product, int quantity) {
        // products.put(product, quantity);
    // }

    public void delete(Product product) {
        products.remove(product);
    }

    // public HashMap<Product, Integer> getWarehouse() {
        // return products;
    // }

    public void setWarehouse(HashMap<Product, Integer> warehouse) {
        this.products = products;
    }

    // public HashMap<Product, Integer> getProducts() {
        // return products;
    // }
}
