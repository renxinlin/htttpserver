package com.renxl.servlet;

import com.renxl.server.Request;
import com.renxl.server.Response;

public class LoginWeb extends Servlet {

    @Override
    public void doGet(Request req, Response rep) throws Exception {
        rep.println("success.....");
    }

    @Override
    public void doPost(Request req, Response rep) throws Exception {
        rep.println("post.....");

    }

}

