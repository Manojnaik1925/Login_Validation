package Validation_controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Validation_dao.User_dao;
import Validation_dto.User_dto;


@WebServlet("/signin")
public class Login_controller extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		 TODO Auto-generated method stub
//		super.doGet(req, resp);
		
	String email=req.getParameter("emailid");
	String pwd=req.getParameter("pwd");
	int fpwd=Integer.parseInt(pwd);
	
	//to call the method we have created the object for dao class
	User_dao dao=new User_dao();
	User_dto e1=dao.login(email);

		if (e1!=null)
		{
			if(e1.getPwd()==fpwd)
			{
				resp.getWriter().print("<h1>Welcome to Home Page");
				resp.sendRedirect("https://r.search.yahoo.com/_ylt=Awr1Sgxr4lhkChIgCGO7HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Ny/RV=2/RE=1683575532/RO=10/RU=http%3a%2f%2fwww.facebook.com%2flogin.php/RK=2/RS=hhdF4IsG9Ja_xJMRKC1jL3V5r3o-");
			}
			else
			{
				resp.getWriter().print("<h1>Enter the proper password</h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("Validation_login.html");
				dispatcher.include(req, resp);
			}
		}
		else
		{
			resp.getWriter().print("<h1>Account not found, Signup First</h1><a href='Validation_login.html'> Click here to signup</a>");
//		resp.sendRedirect("Validation_signup.html");
		}
	
	}
}
