package com.rb;

import com.rb.controllers.AuthenticationController;
import com.rb.controllers.CartController;
import com.rb.controllers.RequestProductController;
import com.rb.controllers.StoreController;
import com.rb.model.Bread;
import com.rb.model.Cart;
import com.rb.model.Milk;
import com.rb.model.Product;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        String login = "login";
        String password = "password";
        AuthenticationController authenticationController = new AuthenticationController();
        authenticationController.register(login, password);
        boolean isLogin = authenticationController.show();

        if (isLogin) {
            // Add product to estore
            Bread breadWhite = new Bread("Bread white", 1000, 2.1);
            Bread breadBlack = new Bread("Bread black", 1001, 3);
            Milk milk = new Milk("Milk", 2000, 10);

            StoreController storeController = new StoreController();
            storeController.addProduct(breadWhite, 1);
            storeController.addProduct(breadBlack, 2);
            storeController.addProduct(milk, 10);
            storeController.showStore();

            CartController cartController = new CartController(new Cart());

            String productId = null;
            do {
                RequestProductController requestProductController = new RequestProductController();
                productId = requestProductController.request();

                try {
                    cartController.addProduct(Integer.parseInt(productId), 1);
                } catch (NumberFormatException e) {
                }
            } while (!productId.isEmpty());

            cartController.showCart();
        }
    }
}
