package com.mvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homecontroller {
	@RequestMapping("/home")
	public String show() {
		System.out.println("in show method");
		return "show";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("in about method");
		return "indexx";
	}
	
	@RequestMapping("/login")
	public ModelAndView loginagain(HttpServletRequest req,HttpServletResponse res)
	{
		String name=req.getParameter("username");
		String password=req.getParameter("pass");
		ModelAndView mv=new ModelAndView();
		if (password.equals("admin123"))
		{
			String msg="hello"+name+"testing model intrface";    
			mv.setViewName("login");
			mv.addObject("msg", msg);
		}
		else
		{
			String msg="hello"+name+"entred password is wrong";
			mv.setViewName("error");
			mv.addObject("msg", msg);
		}
		return mv;
	}
	
//	@RequestMapping("/loginagain")
//	public String login(HttpServletRequest req,Model m)
//	{
//	String na=req.getParameter("username");
//	String pas=req.getParameter("pass");
//	if (pas.equals("admin123"))
//	{
//		String msg="hello"+na+"testing model intrface";    
//		m.addAttribute("msg", msg);
//		return "login";
//	}
//	else
//	{
//		String msg="hello"+na+"entred password is wrong";
//		m.addAttribute("msg", msg);
//		return "error";
//		
//	}
	
//}
		
	}



