package cn.itsource._04testScope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/count")
public class CountServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* 只是为了演示将数据放入servlet作用域对象，演示本身不具有意义
		  	获取个数，如果先开始为null，表示第一次，放入一个值：1
			不为null，取出值+1放回去
		 */
		
//		request
		Integer num_req = (Integer)request.getAttribute("Num-In-Request");
		
		if (num_req == null) {
			request.setAttribute("Num-In-Request", 1);
		}else {
			request.setAttribute("Num-In-Request", num_req+1);
		}
				
		System.out.println("每次刷新地址栏，都是一次新的请求，request的数量不累加，都是1");
		System.out.println("---------------------------------------");
		
//		session
		Integer num_session = (Integer)request.getSession().getAttribute("Num-In-Session");
		
		if (num_session == null) {
			request.getSession().setAttribute("Num-In-Session", 1);
		}else {
			request.getSession().setAttribute("Num-In-Session", num_session+1);
		}
		System.out.println("每次刷新地址栏，session的数量都累加；关闭浏览器重启一次才重头计数");
		System.out.println("---------------------------------------");
		
		
//		application
		Integer num_application = (Integer)request.getServletContext().getAttribute("Num-In-Application");
		
		if (num_application == null) {
			request.getServletContext().setAttribute("Num-In-Application", 1);
		}else {
			request.getServletContext().setAttribute("Num-In-Application", num_application+1);
		}
		System.out.println("不管刷新地址栏，关闭浏览器application的数量都累加；直到关闭Tomcat");
		System.out.println("---------------------------------------");
		
		
		
		request.getRequestDispatcher("/result").forward(request, response);
		
	}
}
