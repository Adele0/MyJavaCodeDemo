package cn.itsource._02servletExtends;

import java.io.IOException;

import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsingServlet extends MyHttpServlet {

/*【一】
 	"Servlet里的方法最主要是用service()其他的方法每次都出现会产生干扰"
 	"所以选择继承的方式就能只覆写service()一个方法"
 	
 	关于web.xml的全限定名：
 							1.在java文件中，选中UsingServlet，右键Copy Qualified Name：
 																	cn.itsource._02servletExtends.UsingServlet
 							 2.（错误！！）在package explorer点击UsingServlet.java右键Copy Qualified Name：
 							 								/NewDay11_servlet/src/cn/itsource/_02servletExtends/UsingServlet.java
 							 3.点开UsingServlet.java的三角，出现绿色C标记后，右键Copy Qualified Name：
 							 								cn.itsource._02servletExtends.UsingServlet


		@Override
		public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
//			super.service(arg0, arg1);  这句话是调用父类的service,因为父类自动生成，可以不用
//			配置好web.xml之后，调用ServletConfig对象
			
/*			ServletConfig config = super.getServletConfig();//三种方式都可以，但是第一种很好的展示是从父类中调用get方法
			ServletConfig config1 = this.getServletConfig();
			ServletConfig config2 = this.getServletConfig();
			System.out.println(config.getServletName()) 	;//using
			System.out.println(config1.getInitParameter("encoding"));		//GB2312
			System.out.println(config2.getInitParameter("email"));		//438296186@qq.com
 			System.out.println("要测试，先启动Tomcat，之后在网页打开，完成初始化");
*/			
			
/*			【二】
 			System.out.println("如果出现Hot Code Replace Failed，首先先关闭服务器再修改代码");
			System.out.println("将config调用方法在父类中封装好，就能直接调用");
			
			System.out.println(super.getInitParameter("encoding"));		//GB2312
			
			【三】
			由此可以想到，将config下的所有方法都封装到父类中。既然这样，不如直接在通用类里再多实现一个config的接口
			System.out.println("会执行");	
			System.out.println(super.getInitParameter("encoding"));	

		}
*/		
		
/*		【四】
 		由于调用init（）方法可能在无意中删掉super.init(config);就会导致没有得到config
 		之后所有通过config的方法就将失效，所以使用《钩！子！方！法！》
 		虽然我们调用的init（）无参方法，但是Tomcat会默认找有参的覆写方法，
 		由于有参的覆写方法中又调用了无参的init（）,结果是2个方法都执行
 */	
		@Override
			public void init() throws ServletException {
//				System.out.println("由于无参init（）方法下没有代码，在using中覆写无参init（），super.init(config)可以删除");
//				System.out.println("验证钩子方法，没有了super.init(config)，那覆写的service会不会执行？");
			}
		
/*		【五】
 		service(ServletRequest arg0, ServletResponse arg1)是所有servlet中最常用的方法，而我们绝大多数的请求都是http请求
 		需要把请求Request与相应Response对象强制转化为http对象
 		思路：跟【四】中的init（）方法一样，运用钩子方法
 		单独将HttpServlet成类以后，using就继承HttpServlet而不是MyGenericServlet

		@Override
		public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//			super.service(req, resp);在using中直接调用service（http）就行，这句super可以不要，不影响调用
			System.out.println("虽然利用钩子方法解决了将ServletRequest，强转为HttpServletRequest");
			System.out.println("也确实大部分时候我们调用HttpServletRequest，但是其他不需要HttpServlet的情况也被强转了");
			System.out.println("所以，我们将这个方法单独放到类里面");
		}
*/
		
/*		【六】
 		在httpServlet中根据不同的提交方法GET和POST做出不同的操作
 */
		@Override
			public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				super.service(req, resp);
			}
}
