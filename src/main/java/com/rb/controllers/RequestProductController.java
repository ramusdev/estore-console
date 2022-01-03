package com.rb.controllers;

import com.rb.view.RequestProductView;

public class RequestProductController {
    public String request() {
        RequestProductView requestProductView = new RequestProductView();
        return requestProductView.show();
    }
}
