package com.sample.controller;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.servlet.ModelAndView;  

import com.sample.domain.UserRegister;

@Controller
@RequestMapping("/hotel")
public class HotelPageController {
	
	
	 public String validateData() {
		 System.out.println("inside controller");
		return "hello";  
	
 
	 }  

}
