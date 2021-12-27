package com.rb;

import com.rb.controllers.AuthenticationController;
import com.rb.controllers.CartController;
import com.rb.controllers.StoreController;
import com.rb.model.Bread;
import com.rb.model.Cart;

public class App {

    public static void main(String[] args) {

        String login = "login";
        String password = "password";
        AuthenticationController authenticationController = new AuthenticationController();
        authenticationController.register(login, password);
        boolean isLogin = authenticationController.show();

        if (isLogin) {
            Bread breadWhite = new Bread("Bread white", 1000, 5.1);
            Bread breadBlack = new Bread("Bread black", 1001, 6);
            StoreController storeController = new StoreController();
            storeController.addProduct(breadWhite, 1);
            storeController.addProduct(breadBlack, 2);
            storeController.showStore();

            long breadWhiteId = 1000;
            long breadBlackId = 1001;
            CartController cartController = new CartController(new Cart());
            cartController.addProduct(breadWhiteId, 1);
            cartController.addProduct(breadBlackId, 2);
            cartController.showCart();
        }

    }

}
