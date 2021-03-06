package com.epam;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc")
public class AppRunner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String counter = (String) getServletContext().getAttribute("counter");
		if (counter == null) {
			getServletContext().setAttribute("counter", counter = new String("0"));
		}
		int data = Integer.valueOf(req.getParameter("data"));
		int ctr = Integer.valueOf(counter) + data;
		getServletContext().setAttribute("counter", String.valueOf(ctr));
		doGet(req, resp);
	}
}
