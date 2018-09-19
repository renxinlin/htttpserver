package com.renxl.servlet;

import com.renxl.server.Request;
import com.renxl.server.Response;

public class Controller extends Servlet {

	@Override
	public void doGet(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.print("hi.......");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		//rep.print("controller");
	}

}
