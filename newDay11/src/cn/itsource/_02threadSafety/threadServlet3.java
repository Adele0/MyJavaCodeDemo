package cn.itsource._02threadSafety;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("deprecation")
@WebServlet("/thread3")
public class threadServlet3 extends HttpServlet implements SingleThreadModel{

	private static final long serialVersionUID = 1L;
	
	private String salary;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("解决线程安全问题方案2：实现SingleThreadModel接口");
		System.out.println("此servlet.SingleThreadModel接口已过时，不推荐使用，在此只做演示");
		
		salary = request.getParameter("salary");
		
		System.out.println("注意：Struts1与springmvc是线程不安全的，Struts2是线程安全的");
		System.out.println("为了演示servlet的线程安全问题，故意设置sleep，在浏览器中开两个不同salary的页面，在页面响应时打印，因为有中文要设置编码");
		
		response.setContentType("text/html; charset=utf-8");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.getWriter().write("你看到的工资是："+salary+"元");

	}
}
