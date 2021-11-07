package com.rb.controllers;

import com.rb.database.Database;
import com.rb.model.User;
import org.apache.commons.codec.digest.DigestUtils;

public class AuthenticationController {

    public boolean login(String login, String password) {
        Database database = Database.getInstance();

        User user = database.getUser(login);

        if (user == null) {
            return false;
        }

        if (user.getPassword().equals(DigestUtils.md5Hex(password))) {
            return true;
        }

        return false;
    }

    public void register(String login, String password) {
        Database database = Database.getInstance();

        User user = new User(login, DigestUtils.md5Hex(password));
        database.insertUser(user);
    }
}
