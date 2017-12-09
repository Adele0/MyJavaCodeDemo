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

@WebServlet("/cookie/cookieList")
public class CookieList extends HttpServlet{

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
//						username = cookie.getValue();(解决编码问题,只在cookie取值拿值的时候encode，decode)
					username = URLDecoder.decode(cookie.getValue(), "utf-8");
					
/*				虽然遇到的情况很少，但是是可以改掉cookie里的
 				方法1. 在if语句里修改cookie的username的值
 							cookie.setValue("suibian")【这里不要用中文，除非先解决编码问题】
 							response.addCookie(cookie)
 */			}
			}
		}
/*			
			方法2. 在service方法里新建cookie再设置的username的值
						Cookie cookie = new Cookie("username-in-cookie", URLEncoder.encode("可以中文了", "utf-8")")
						response.addCookie(cookie)
*/	
		
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username);
		writer.write("<hr />");
		for (int i = 1; i <11; i++) {			
			writer.write("领取第<a href='cookieItem' >"+i+"</a>种绝望<br/>");
		}
	}
}
