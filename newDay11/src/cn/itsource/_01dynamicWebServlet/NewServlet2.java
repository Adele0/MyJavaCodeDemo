package cn.itsource._01dynamicWebServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/new2")
public class NewServlet2 extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("servlet3.0以后可以通过注解配置servlet");
		System.out.println("通过@WebServlet(''/配置/多层'')，同时通过value='' ''，loadOnStartup=, initParams={@WebInitParam(name='' '', value='' '')}配置不同参数");
		System.out.println("想要使用注解的方式，在web.xml的<web-app>中的metadata-complete='' false''才行，为true时Tomcat只在web.xml中查找配置");
		System.out.println("web.xml没写metadata-complete默认值就是false，但如果是拷贝主web.xml就设置的是true");
		System.out.println("在web.xml（后面用框架集成的时候，只能用xml，更通用）中配置和注解配置（更方便）");
	}
}
