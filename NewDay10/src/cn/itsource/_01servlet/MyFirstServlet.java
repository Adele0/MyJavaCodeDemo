package cn.itsource._01servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFirstServlet implements Servlet {
	
	public MyFirstServlet(){
		System.out.println("构造servlet对象");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		System.out.println("Servlet最重要的是service()方法");	
		System.out.println("让Tomcat知道我新建了一个《MyFirstServlet》的类--》配置web.xml");	
		System.out.println("web.xml--》<servlet>--》<servlet-name>自己随便的取的名字，<servlet-class>自己写的servlet的全限定名");	
		System.out.println("web.xml--》<servlet>--》<init-param>--》<param-name>,<param-value>成对出现，可以有多对");	
		System.out.println("web.xml--》<servlet-mapping(映射)>--》<servlet-name>和上面的<servlet-name>的名字一样，<url-pattern>向外暴露的访问路径");	
		System.out.println("注意：web.xml、server.xml修改以后都需要重启Tomcat");
	}
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("启动Tomcat后，初始化是在网页调用时完成（仅一次),arg0参数名可以任意改，如：conf");
		System.out.println("----------------------------以下测试初始化方法---------------------------------------");
		
		System.out.println("String getServletName（）获取web.xml中servlet-name");
		System.out.println(arg0.getServletName());
		System.out.println("----------------------------");
		
		System.out.println("String getInitParameter()通过参数名获得对应的值");
		System.out.println(arg0.getInitParameter("encoding"));
		System.out.println("----------------------------");
		
		System.out.println("Enumeration getInitParameterNames()获得所有初始化参数的名字");
		Enumeration<String> names = arg0.getInitParameterNames();
		while(names.hasMoreElements()){
			System.out.println(names.nextElement());
		}
		System.out.println("----------------------------");
		
		System.out.println("通过hasMoreElements()的判断，循环打印nextElement()的名字，再通过名字获得值");
		Enumeration<String> names1 = arg0.getInitParameterNames();
		while(names1.hasMoreElements()){
			System.out.println(arg0.getInitParameter(names1.nextElement()));
		}
		System.out.println("----------------------------");
		
		System.out.println("ServletContext getServletContext()的getContextPath()获得server.xml的Context中path的值");
		ServletContext context = arg0.getServletContext();
		System.out.println(context.getContextPath());
		System.out.println("----------------------------");
	}
	
	@Override
	public void destroy() {
		System.out.println("销毁，通过正常关闭才会调用");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

}
