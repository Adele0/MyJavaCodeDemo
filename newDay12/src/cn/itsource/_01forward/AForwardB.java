package cn.itsource._01forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/a")
public class AForwardB extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		System.out.println("Welcome to part A, and i want to go to part B by forward method, please help!");
		
		System.out.println("This is part A, the name is：" +request.getParameter("name"));
		
		request.getRequestDispatcher("/b").forward(request, response);
		
		response.getWriter().write("This is responsed by part a.");
		
		System.out.println("注意：1. 在forward跳转中的相对路径问题。2.Aservlet里没做完的事跳转到Bservlet中继续执行。");
		System.out.println( "3.使用request.getRequestDispatcher(String path).forward(req,resp)方法。");
		System.out.println( "4.转发过程中，地址栏是a一直未变，只有一个请求，但后台执行了a和b两个servlet。");
		System.out.println( "5.共享同一个请求，在请求中，共享数据（a中的request和response都forward给b了，验证：在a地址栏加上？name=xx，看b是否能拿到name）。");
		System.out.println( "6.响应(不是console的打印)由最后一个servlet决定");
		System.out.println( "7.可以访问WEB-INF中的资源，可以访问当前应用中的资源，不能跨域跳转（某视频官网）");
		System.out.println( "8.从HTML页面跳转到servlet需要先加上，servlet.xml中的path，servlet之间的跳转不需要加");
		System.out.println( "9.为啥WEB-INF能被访问，还很安全呢？---因为只能通过程序提供的路径才能访问，并且在跳转之前可以做权限判断");
	}
}
