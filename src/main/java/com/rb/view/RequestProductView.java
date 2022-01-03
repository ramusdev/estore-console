package com.rb.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RequestProductView {

    public String show() {
        String productId = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter product id: ");
            productId = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return productId;
    }
}
