package cn.itsource._03statelessProtocol;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/desperationList")
public class DesperationList extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username);
		writer.write("<hr />");
		for (int i = 1; i <11; i++) {			
			writer.write("领取第<a href='desperationItem?username="+username+"' >"+i+"</a>种绝望<br/>");
		}
	}
}
