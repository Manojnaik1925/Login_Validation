package Validation_controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Validation_dao.User_dao;
import Validation_dto.User_dto;
@WebServlet("/signup")
public class Signup_controller extends HttpServlet {

	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//      TODO Auto-generated method stub
//		super.doGet(req, resp);
	
		String name=req.getParameter("name");
		String email=req.getParameter("emailid");
		String pwd=req.getParameter("password");
		int pwd1=Integer.parseInt(pwd);
		String PhNo=req.getParameter("number");
		int phNo1=Integer.parseInt(PhNo);
		String gender=req.getParameter("gender");
		
		User_dto dto=new User_dto();
		dto.setName(name);
		dto.setEmail(email);
		dto.setPwd(pwd1);
		dto.setPh_no(phNo1);
		dto.setGender(gender);
		
		User_dao dao=new User_dao();
		dao.signup(dto);
		
	}
}
