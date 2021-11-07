package com.rb;

import com.rb.controllers.CartController;

public class App {

    public static void main(String[] args) {

        /*
        String login = "User";
        String password = "Password";
        AuthenticationController authenticationController = new AuthenticationController();
        authenticationController.register(login, password);
        System.out.println(authenticationController.login("User", password));
        */

        /*
        Bread breadWhite = new Bread("Bread white", 1000);
        Bread breadBlack = new Bread("Bread black", 1001);
        StoreController storeController = new StoreController();
        storeController.addProduct(breadWhite, 1);
        storeController.addProduct(breadBlack, 2);
        storeController.showStore();
        */

        long breadWhite = 1000;
        CartController cartController = new CartController();
        cartController.addProduct(productId);
        cartController.showCart();

    }

}
