package cn.itsource._02threadSafety;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 	配置注释应写在类上面
 	servlet的线程安全问题演示：
 			1.从前台页面传入参数
 			2.servlet中定义成员变量（保存传来的参数）
 			3.servlet中使用request对象来获得参数，并放到2.
 			4.输出
 */

@WebServlet("/thread")
public class threadServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private String salary;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("为了方便可以直接在地址栏输入localhost/thread?salary=xxxx");
		salary = request.getParameter("salary");
		System.out.println("工资为："+salary);//单线程下，正确无误
		
		System.out.println("为了演示servlet的线程安全问题，故意设置sleep，在浏览器中开两个不同salary的页面，在页面响应时打印，因为有中文要设置编码");
		
		response.setContentType("text/html; charset=utf-8");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		response.getWriter().write("你看到的工资是："+salary+"元");
		
		System.out.println("线程安全问题的原因： 创建了一个servlet对象，第一次访问的值被第二次访问的值覆盖");
		System.out.println("解决方案：1.将salary放到service方法里，从成员变量变成局部变量");
		System.out.println("解决方案：2.实现servlet.SingleThreadModel接口：同时只能有一个线程访问，其他的等待（不推荐）");
		
	}
}
