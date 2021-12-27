package com.rb.view;

import com.rb.controllers.AuthenticationController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthentificationView {
    private AuthenticationController authenticationController;

    public AuthentificationView(AuthenticationController authenticationController) {
        this.authenticationController = authenticationController;
    }

    public boolean show() {
        System.out.println("-------------------------------");

        return requestForLogin();
    }

    public boolean requestForLogin() {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 3; ++i) {
                System.out.println("Please enter your login: ");
                String login = bufferedReader.readLine();

                System.out.println("Please enter your password: ");
                String password = bufferedReader.readLine();

                boolean isLogin = authenticationController.login(login, password);
                // System.out.println(isLogin);

                if (isLogin) {
                    System.out.println("You are login success");
                    return true;
                } else {
                    System.out.println("Try again your login or password is incorrect");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
