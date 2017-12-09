package cn.itsource._04cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie/menu")
public class CookieMenu extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Weclome to the cookie menu page!");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String username = request.getParameter("username");
		
//		创建一个cookie对象(并解决编码问题,只在cookie取值拿值的时候encode，decode)
		Cookie cookie = new Cookie("username-in-cookie", URLEncoder.encode(username, "utf-8"));
		
/*			cookie的生命周期
			缺省情况下，关闭浏览器cookie就丢失了
			通过cookie.setMaxAge(10)的设置存活时间(单位 秒)
			second<0关闭浏览器cookie就丢失（默认情况）
			second=0删除cookie
 */
		
/*			cookie的路径
			通过cookie.setPath()设置
			不设置，使用的存放cookieServlet资源名的相对路径
			例：LoginServlet(/cookie/login) cookie创建在这里
				  ListServlet（/list）访问不到
				  要想ListServlet携带cookie： cookie.setPath("/cookie")
				  要想所有页面都共享cookie： cookie.setPath("/")				  
*/
		
/*		设置cookie域
	  	不同响应/主机之间共享cookie；很多网站都有二级域名（配置虚拟主机）【百度（一级域名）百度百科，贴吧，文库，音乐，翻译（二级域名）】
				cookie.setPath("/");
				cookie.setDomain(".baidu.com");
*/
		
//		把cookie对象传给浏览器
		response.addCookie(cookie);
		
		PrintWriter writer = response.getWriter();
		writer.write("欢迎你："+username+", 在绝望之前，看到这个页面！");
		writer.write("<hr />");
		writer.write("你还有<a href='cookieList' >10种</a>不同的绝望待领取");
	}
}
