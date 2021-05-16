package com.epam;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "result")
public class Result extends HttpServlet {
	String htmlBegin = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n"
			+ "<title></title>\r\n" + "</head>\r\n" + "<body>\r\n" + "<h1>Result</h1>\r\n" + "<p>";
	String htmlEnd = " </p>\r\n" + "</body>\r\n" + "</html>";

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append(htmlBegin).append(getServletContext().getAttribute("counter").toString()).append(htmlEnd);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
