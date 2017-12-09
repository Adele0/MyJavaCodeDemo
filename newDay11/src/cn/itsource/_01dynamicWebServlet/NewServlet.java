package cn.itsource._01dynamicWebServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("不同的项目path=“”应该是不同的值；先启动浏览器的F12的ntework,在提交请求，不然404");
		System.out.println("记得生成序列号,记住删掉super; web.xml里的servlet-name，url-pattern（地址栏要输入的）最好名同样的名，servlet-class写全限定名");
		System.out.println("多路径：1.一个servlet-maping下的url-pattern有多个，随意输入其中一个都能找到;2.多个servlet-name相同的servlet-maping下，有不同的url-pattern");
		System.out.println("通配符：1.url-pattern为/*，不管在地址栏输入多少层都能访问到");
		System.out.println("通配符：2.如果要加入权限url-pattern为/system/*，进入system后，不管有多少层都能访问（system可以改为任意名字）");
		System.out.println("通配符：3.*.扩展名，例：*.avi以avi为后缀才能访问当前servle！！！注意：其他的url-pattern都要加/ 但是以！后缀！访问！不能！加！/");
		System.out.println("配置servlet时，不能将servlet-name取名为default（Tomcat中主web.xml规定访问静态资源都得通过default的servlet");
		System.out.println("地址栏只输入localhost，默认找index（Tomcat中主web.xml规定<welcome-file-list>项下有：index.html；index.htm；index.jsp）");
		System.out.println("如果需要在Tomcat启动后就初始化servlet，在web.xml里添加<load-on-startup>跟的数字越小启动越早，>=0");
	}
}
