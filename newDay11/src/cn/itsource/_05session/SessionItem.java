package cn.itsource._05session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/sessionItem")
public class SessionItem extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		username参数已经没有了
		String username = "";
//		从session中获得值
		HttpSession session = request.getSession();
		username = (String)session.getAttribute("username-in-session");
				
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username);
		writer.write("<hr />");
		writer.write("你的努力竟然因为方向错了而白费了！！");
	}
}
