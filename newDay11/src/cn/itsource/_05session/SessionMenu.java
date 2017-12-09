package cn.itsource._05session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session/menu")
public class SessionMenu extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Weclome to the session menu page!");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");

//		把获得的数据放入session
		HttpSession session = request.getSession();
		session.setAttribute("username-in-session", username);
//		cookie对象存放在浏览器上，session对象存放在服务器上（数量不宜多），session的实现也是通过cookie实现的
//		存入服务器的session会在链接之后的Response Header里出现一项Set-Cookie:username-in-cookie=Zhuzhu
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username+", 在绝望之前，看到这个页面！");
		writer.write("<hr />");
		writer.write("你还有<a href='sessionList' >10种</a>不同的绝望待领取");
//		点击链接后，在request header中出现Cookie:username-in-cookie=Zhuzhu
	}
}
