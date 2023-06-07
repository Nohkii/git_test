package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/greet")
public class Greet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("greet");
		String no = req.getParameter("no");
		System.out.println("no:" + no);

		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();

		out.println("<h2>no:" + no + "</h2>");
		out.flush();
	}

}
