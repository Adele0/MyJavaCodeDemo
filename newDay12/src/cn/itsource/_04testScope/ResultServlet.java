package cn.itsource._04testScope;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/result")
public class ResultServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		Integer num_req = (Integer)request.getAttribute("Num-In-Request");
		response.getWriter().write("request："+num_req+"个");

		
//		------------------------------------------------------------------
		
		Integer num_session = (Integer)request.getSession().getAttribute("Num-In-Session");
		response.getWriter().write("<br />session："+num_session+"个");
		
//		------------------------------------------------------------------
		
		Integer num_application = (Integer)request.getServletContext().getAttribute("Num-In-Application");
		response.getWriter().write("<br />application："+num_application+"个");
	}
}
