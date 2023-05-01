package com.Mini_Project.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Mini_Project.model.DAOService;
import com.Mini_Project.model.DAOServiceimpl;
//http:localhost:8080/registartion1/listall
@WebServlet("/listall")
public class ListRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListRegistration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		
		DAOService dao= new DAOServiceimpl();
		dao.connectDB();
		ResultSet result = dao.getAllReg();
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_registrations.jsp");
		rd.forward(request, response);
		
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
