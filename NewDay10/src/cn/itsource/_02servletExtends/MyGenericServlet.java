package cn.itsource._02servletExtends;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/* 【一】
    直接实现servlet接口，不用做任何更改
    1.1
        要想在使用中的servlet中调用父类通用config，
 		需要先initial，又因为夸方法，需要将config作为私有字段
		再通过通用接口自带的getServletConfig方法调用
    1.2：要初始化之前记得修改web.xml
 */
	public class MyGenericServlet implements Servlet, ServletConfig{
		
		private ServletConfig config;
		
		@Override
		public void destroy() {
		}
	
		@Override
		public ServletConfig getServletConfig() {
			return this.config;
		}
	
		@Override
		public String getServletInfo() {
			return null;
		}
	
	//	【四】钩子方法：新建无参init（），在@Override中调用它
		@Override
		public void init(ServletConfig config) throws ServletException{
			this.config = config;//Tomcat会默认调用此方法，但这里会调用无参的init（），所以都会执行
			this.init();
		}
		
		public void init() throws ServletException {
		}
	//---------------------------------------------
		
		@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
/*			HttpServletRequest request = (HttpServletRequest) arg0;
			HttpServletResponse response = (HttpServletResponse) arg1;
			this.service(request, response);//将得到的request和response传到service(HttpServletRequest, Response)参数方法中
*/		}
		/*【五】
			 	仿照【四】钩子方法:新建 一个参数为HttpServletRequest和HttpServletResponse的service方法
			 	但是保证MyGenericServlet的通用性单独建HttpServlet类
		 */
/*		public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		}
		
*/		
		
		
//---------------------------------------------	
	/*	【二】
	 	没有@Override的方法，这是自己手动封装调用getInitParameter
	 	为了实现所有的config下的放在在通用类里再多实现一个config的接口（带有@Override）
	
		public String getInitParameter(String name) {
			return this.config.getInitParameter(name);
		}
	*/
		
	/*	【三】
	 	实现ServletConfig接口自动生成的实现config接口的覆写类
		return全部改为this.config.方法名()
	*/
		@Override
		public String getInitParameter(String arg0) {
			return this.config.getInitParameter(arg0);
		}
		
		@Override
		public Enumeration<String> getInitParameterNames() {
			return this.config.getInitParameterNames();
		}
	
		@Override
		public ServletContext getServletContext() {
			return this.config.getServletContext();
		}
	
		@Override
		public String getServletName() {
			return this.config.getServletName();
		}
	
	}
