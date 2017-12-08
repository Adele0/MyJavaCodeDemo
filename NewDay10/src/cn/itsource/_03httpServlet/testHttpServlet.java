package cn.itsource._03httpServlet;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testHttpServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
/*常用方法：
   	String getContextPath();
   	String geHeader(String headName);
   	String getRequestURI();
   	StringBuffer getRequestURL();
   	String getRemoteAddr()
 */
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.service(arg0, arg1); 由于平时不区分get post为了避免相互调用产生错误，尽量不保留
		
/*		System.out.println("得到提交网页的上下文路径ContextPath："+ req.getContextPath());// /xx
		System.out.println("通过请求头名称得到提交网页的对应的值："+ req.getHeader("Referer"));// null
		System.out.println("通过请求头名称得到提交网页的对应的值："+ req.getHeader("User-Agent"));// Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Mobile Safari/537.36
		System.out.println("统一资源标识符Uniform Resource Identifier(URI)："+ req.getRequestURI());//  /xx/html
		System.out.println("统一资源定位器Uniform Resource Locator(URL)："+ req.getRequestURL());//  http://localhost/xx/html
		System.out.println("获得客户端的ip地址RemoteAddr："+ req.getRemoteAddr()); //0:0:0:0:0:0:0:1
*/
		String name = req.getParameter("name");//实际中最常用的方法
		System.out.println("从后台拿到前端页面输入的名字：" + name);
		System.out.println("注意：ServletConfig中的getInitParameter获取的是web.xml中的配置的初始化参数");		
		System.out.println(" 			而HttpServletRequest中getParameter获取的是用户提交的信息");		
		
		String[] values = req.getParameterValues("hobbys");
		System.out.println("从后台拿到前端页面输入兴趣集合：" + Arrays.toString(values));
		
		Enumeration<String> parameterNames = req.getParameterNames();
		while (parameterNames.hasMoreElements()) {			
			System.out.println("从后台拿到前端页面有的参数名："+parameterNames.nextElement());
		}
		
		Map<String, String[]> parameterMap = req.getParameterMap();
		System.out.println("从后台拿到前端页面所有的键值对Map："+parameterMap);
		
	}
	
}
