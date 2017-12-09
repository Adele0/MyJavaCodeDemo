package cn.itsource._04cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/cookieItem")
public class CookieItem extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
//		username参数已经没有了
		String username = "";
/*		从request中获得cookie
 		1.获得指定名称的cookie
 		2.如果有cookie才获得
 */
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			for (Cookie cookie : cookies) {
//				System.out.println(cookie.getName());
//				System.out.println(cookie.getValue());
				if ("username-in-cookie".equals(cookie.getName())) {
//					username = cookie.getValue();(解决编码问题,只在cookie取值拿值的时候encode，decode)
					username = URLDecoder.decode(cookie.getValue(), "utf-8");
				}
			}
		}
				
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username);
		writer.write("<hr />");
		writer.write("你的努力竟然因为方向错了而白费了！！");
	}
	
	/*		cookie的缺陷：
	 * 	1.多人共用电脑，不安全   2.处理中文麻烦   3.一个cookie只能储存简单的类型（不能是对象）
	 																					同时保存多个数据很麻烦
	 * 	4.cookie有大小限制和数量的限制。视浏览器和服务器不同，
	  			cookie大小限制在4KB以内，一台服务器最多20个cookie，一个浏览器最多保存300个cookie
	 */
}
