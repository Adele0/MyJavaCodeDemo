package cn.itsource._04testScope;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class TestServletContext extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		一、ServletContext(application)对象的获得4种方式:
		
		ServletContext app1= super.getServletContext(); 
/*		前3中本质是一种方式，为了记住是从父类HttpServlet继承而来，选择使用super
 		ServletContext app11= this.getServletContext();
		ServletContext app12= getServletContext();
*/		ServletContext app2= super.getServletConfig().getServletContext();
		ServletContext app3= request.getServletContext();//这是Tomcat7以后才开始支持的
		ServletContext app4= request.getSession().getServletContext();
		
		System.out.println(app1 ==  app2);
		System.out.println(app3 ==  app4);
		System.out.println(app1 ==  app4);
		
		
//		二、ServletContext(application)对象的方法：
		
		System.out.println("获得上下文路径 servlet.xml的context中的path："+app4.getContextPath());
		
		System.out.println("获得资源的绝对路径（项目的根，即docBase）："+app4.getRealPath(""));
//		用处：用于上传下载（可以加上/，也可以不用，可以多层）
		System.out.println("专门正项目里建一个upload文件夹，找到它的绝对路径"+app4.getRealPath("upload"));
		
		System.out.println("获得指定全局初始化参数："+app4.getInitParameter("encoding"));
		
		System.out.println("获得全局初始化参数，就再也不能使用servletConfig的getInitParameter来获取了");
		System.out.println("只能使用servletContext对象，getInitParameter（String paramName）");
		
		
		System.out.println("---------------------------面试问题------------------------------------");
		System.out.println("1.req.getParameter()和req.getAttribute()的区别：");
		System.out.println("getParameter是从前台页面得到的参数；getAttribute是servlet作用域中set拿到的");
		System.out.println("2.servletConfig的getInitParameter（）与application的getInitParameter的区别：");
		System.out.println("servletConfig的getInitParameter（）只能作用于<servlet>下的初始化参数");
		System.out.println("application的getInitParameter（）是作用于<context-param>下的全局初始化参数");
	}
	
}
