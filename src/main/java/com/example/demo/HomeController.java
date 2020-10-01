package com.example.demo;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")
	//@ResponseBody
	public ModelAndView home(@RequestParam("name") String myname) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myname);
		mv.setViewName("home");
		return mv;
	}
}
