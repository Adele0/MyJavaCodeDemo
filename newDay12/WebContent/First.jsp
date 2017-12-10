<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My first JSP</title>
</head>
<body>
			首先修改JSP的编码，window-preferences-jsp file-utf-8<br>
			Java Server Page应该建立在WebContent文件夹下<br>
			JSP也可以使用java代码（例如生成日期）：<br>
			<%=new java.util.Date() %><br>
			
			-------------------------------------------<br>
			1. 一个JSP其实就是一个servlet，在work文件夹下对应路径下，JSP文件被自动翻译成一个java文件，该文件继承http<br>
			2.从访问方式看：<br>
				html:通过Tomcat和直接访问（拖到浏览器）的效果是一样的；<br>
				JSP文件需要通过Tomcat在浏览器中访问才能显示正常内容，直接拖到浏览器显示为源码<br>	
			3.JSP运行在服务器（例如Tomcat）<br>
			
			-------------------------------------------<br>
			JSP语法：<br>
			<!-- 这是html注释，在页面查看源码，会显示 --><br>
			<%-- 两个百分号是JSP注释，用户在页面看不到 --%>
			
			<%="百分号=后面的值，被放到自动翻译出来的java文件里 out.write（）输出下" %><br>
			<%
					int i = 6;
					System.out.println("百分号不带等号，中间放纯java代码，int变量i的值="+i);
					System.out.println("syso会打印到控制台");
			%>
			
			<%!
					String str="定义成员方法:";
					void testMethod(){
						System.out.println(str+"百分号感叹号");
					}
			%>
			-------------------------------------------<br>
			总结：<br>
			在JSP中尽量不要写java代码
			在servlet中尽量不要写HTML代码
			
</body>
</html>