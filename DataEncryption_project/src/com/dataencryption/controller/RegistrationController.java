package com.dataencryption.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dataencryption.DAO.DatabaseConnection;
import com.dataencryption.TO.Registration_details;


/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mail_id = request.getParameter("mail_id");
		String ssn = request.getParameter("ssn");
		String income = request.getParameter("income");
		String address_l1 = request.getParameter("address_l1");
		String address_l2 = request.getParameter("address_l2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String zipcode = request.getParameter("zipcode");
		String pnum = request.getParameter("pnum");
		Registration_details rg = new Registration_details();
		System.out.println(fname+" "+lname);
		rg.setFname(fname);
		rg.setLname(lname);
		rg.setMail_id(mail_id);
		rg.setSsn(ssn);
		rg.setIncome(income);
		rg.setAddress_l1(address_l1);
		rg.setAddress_l2(address_l2);
		rg.setCity(city);
		rg.setState(state);
		rg.setZipcode(zipcode);
		rg.setPnum(pnum);
		DatabaseConnection.insert(rg);		 
		RequestDispatcher rd =request.getRequestDispatcher("success.jsp");
		rd.forward(request, response);
	}
}
