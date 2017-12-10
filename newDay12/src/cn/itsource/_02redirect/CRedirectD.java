package cn.itsource._02redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/c")
public class CRedirectD extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("Welcome to part C, and i want to go to part D by redirect method, please help!");
		
		System.out.println("重定向redirect跳转时，是两个请求，地址栏会变到最后一个，所以在使用sendRedirect(要加上servlet.xml的路径/ss/d)");
		response.sendRedirect("/ss/d");
		
		System.out.println("重定向redirect可以跨域访问资源");
//		response.sendRedirect("http://www.baidu.com");
		System.out.println("重定向redirect不可以访问WEB-INF");
		
		
		System.out.println("重定向redirectt跳转时，两个请求不共享数据");
		System.out.println("This is part C, the name is：" +request.getParameter("name"));
				
		System.out.println("重定向redirectt跳转时，跟forward一样，响应由最后一个servlet决定");
		response.getWriter().write("This is responsed by part C.");
		
		
	}
}
