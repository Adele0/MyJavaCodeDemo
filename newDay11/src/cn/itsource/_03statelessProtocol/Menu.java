package cn.itsource._03statelessProtocol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/menu")
public class Menu extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Weclome to the menu page!");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username+", 在绝望之前，看到这个页面！");
		writer.write("<hr />");
		writer.write("你还有<a href='desperationList?username="+username+"' >10种</a>不同的绝望待领取");
	}
}
