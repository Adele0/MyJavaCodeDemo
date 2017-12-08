package cn.itsource._03httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testHttpServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("关于在表单中提交中文显示乱码问题:调用req中的setCharacterEncoding(),但是这种方式只支持post不支持get");
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("name");//实际中最常用的方法
		System.out.println(name);
		
		System.out.println("为了解决GET的中文显示问题，需要在server.xml中修改编码为：URIEncoding=&quot;utf-8&quot; 但是这种只支持get,不支持post");
		
//		浏览器做出响应之前，先解决编码问题
/*		resp.setCharacterEncoding("utf-8");//从？？变为不认识的繁体
		resp.setContentType("text/html");//正常显示
		合二为一的方法：
*/		resp.setContentType("text/html;charset=utf-8");
		PrintWriter writer = resp.getWriter();
				writer.write("好晚了，好想睡觉啊，不想猝死啊。");
	}
	
}
