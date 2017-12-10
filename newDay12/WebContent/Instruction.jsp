<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My first JSP</title>
</head>
<body>

			标准指令：设定JSP网页的整体配置信息<br>
			特点：<br>
			1.并不向客户端产生任何输出<br>
			2.指令在JSP整个文档范围有效<br>
			3.为翻译阶段提供了全局信息<br>
			指令格式----尖括号括起来：%@ 指令名称 属性=属性值 属性=属性值% <br>
			------------------------------------------<br>
			page指令：设置当前JSP配置信息<br>
							errorPage="/myerror.jsp"-----如果当前页面有错就跳转到指定页面<br>
							isErrorPage默认false，但是改为true以后，可以直接使用exception<br>
					配置全局错误页面（将常见的错误集中指向某一页面，如：所有404集中跳转）<br>
					在项目的web.xml中配置，其中errorPage下的location需要带上/，配置后重启服务器。<br>
</body>
</html>