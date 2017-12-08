package cn.itsource._02servletExtends;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends MyGenericServlet{
/*		【五】
		为了保证MyGenericServlet的通用性，将需要HttpServlet的service方法的类单独列出
		让HttpServlet继承MyGenericServlet就行
*/
		@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
			HttpServletRequest request = (HttpServletRequest) arg0;
			HttpServletResponse response = (HttpServletResponse) arg1;
			this.service(request, response);
		}
		
		public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			6.1获得页面提交的method
			String method = req.getMethod();
			System.out.println("The method type of this website Request is: " + method);
//			6.2根据不同的页面提交方法，有不同的操作
			if ("GET".equals(method)) {
				this.ifGET(req, resp);
			}else if ("POST".equals(method)) {
				this.ifPOST(req, resp);
			}
//			6.3在webapp文件夹下新建html文件，
		}
		
/*		【六】
 		在httpServlet中根据不同的提交方法GET和POST做出不同的操作
 */
		public void ifGET(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Waring: The method type of this website Request is GET. I don't like. Please change to the other one.");
		}
		
		public void ifPOST(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Waring: The method type of this website Request is POST. I don't like. Please change to the other one.");
		}
	}
