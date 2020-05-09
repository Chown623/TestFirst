package com.zcy.Servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求体里面的文字编码。get方式，用这行没用
//		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("name = " + username + "-- " + "password = " + password);
		exchangeToChinese(username, password);
		
	}

	//处理post请求的中文乱码问题
	private void exchangeToChinese(String username, String password) throws UnsupportedEncodingException {
//		经过解码
		
//		username = new String(username.getBytes("ISO-8859-1"),"utf-8");
		System.out.println("name = " + username + "-- " + "password = " + password);
		//乱码问题，直接在tomcat里面
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("来了一个post请求");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
