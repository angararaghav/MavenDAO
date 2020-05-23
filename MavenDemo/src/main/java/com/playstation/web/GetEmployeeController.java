package com.playstation.web;
import com.playstation.web.model.*;

import com.playstation.dao.*;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.playstation.dao.EmployeeDao;

/**
 * Servlet implementation class GetEmployeeController
 */
public class GetEmployeeController extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		int emp_id = Integer.parseInt(request.getParameter("empid"));
		
		EmployeeDao eDao = new EmployeeDao();
		Employee empInfo = new Employee();
		
		try {
			empInfo = eDao.GetEmployee(emp_id);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Employee", empInfo);
		RequestDispatcher rd = request.getRequestDispatcher("ShowEmployee.jsp");
		rd.forward(request, response);
	}



}
