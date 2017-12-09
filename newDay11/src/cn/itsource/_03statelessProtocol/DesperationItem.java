package cn.itsource._03statelessProtocol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/desperationItem")
public class DesperationItem extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username);
		writer.write("<hr />");
		writer.write("你的努力竟然因为方向错了而白费了！！");
		writer.write("注意：这种通过超链接的方式传递参数的缺点：<br/>1.跳转的页面过多的话，传值非常麻烦<br/>"
				+ "2.地址栏会显示参数，不安全<br/>3.传值数据有限（地址栏有数据限制）<br/>4.不能传递对象");
	}
}
