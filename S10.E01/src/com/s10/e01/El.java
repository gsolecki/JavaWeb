package com.s10.e01;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class El extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User[] users = new User[]{new User(), new SilverUser(), new GoldenUser()};
		request.setAttribute("users", users);
		
		Map<String, User> map = new HashMap<String, User>();
		map.put("u", new User());
		map.put("s", new SilverUser());
		map.put("golden", new GoldenUser());
		request.setAttribute("map", map);
		
		request.getRequestDispatcher("/WEB-INF/views/el.jsp").forward(request, response);
	}

}
