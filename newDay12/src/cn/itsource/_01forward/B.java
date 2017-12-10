package cn.itsource._01forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/b")
public class B extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("--------------------------------------");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("Welcome to part B");
		
		System.out.println("This is part B, the name is：" +request.getParameter("name"));
		
		response.getWriter().write("This is responsed by part b. And only the last response will be showed by browser.");
	}
}
