package com.rb;

import com.rb.controllers.ShoppingCartController;
import com.rb.model.*;
import com.rb.view.ShopView;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Bread bread = new Bread("Bread", 2000);
        Bread breadSecond = new Bread("Bread", 2000);
        Bread breadBlack = new Bread("Bread black", 2001);
        Milk milkWhite = new Milk("Milk white", 1021);
        Milk milkBlack = new Milk("Milk black", 1022);

        // Init shop
        List<ProductWrapper> productWrapperList = new ArrayList<>();
        productWrapperList.add(new ProductWrapper(bread, 1));

        List<ProductWrapper> productWrapperListSecond = new ArrayList<>();
        productWrapperList.add(new ProductWrapper(milkWhite, 50));

        Shop shop = Shop.getInstance();
        shop.addProducts(productWrapperList);
        // shop.addProducts(productWrapperListSecond);
        // shop.addProduct(milkWhite, 1);

        Shop shop2 = Shop.getInstance();
        shop2.addProducts(productWrapperListSecond);

        ShopView shopView = new ShopView(shop);
        shopView.show();

        ShoppingCart shoppingCart = new ShoppingCart();
        ShoppingCartController shoppingCartController = new ShoppingCartController(shoppingCart, shop);
        shoppingCartController.addProductToCart(breadSecond, 1);

        shopView.show();


        // shoppingCartController.addProductToCart(bread, 5);
        // shoppingCartController.addProductToCart(milkWhite, 1021);
        // shoppingCartController.printShoppingCart(shoppingCart);
    }

}
