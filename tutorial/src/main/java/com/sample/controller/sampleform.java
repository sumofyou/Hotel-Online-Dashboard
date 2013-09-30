package com.sample.controller;


import com.sample.dao.HotelDao;
import com.sample.domain.SignupForm;
import com.sample.domain.UserRegister;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class sampleform {
 
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("form", "signupForm", new SignupForm());
    }
 
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model, SignupForm signupForm, BindingResult result, RedirectAttributes redirectAttributes) {
 boolean fs;
    	HotelDao hotelDao = new HotelDao();
      	 UserRegister userRegister = new UserRegister();
      	fs= hotelDao.validateUser(signupForm.getFirstName());
      	if(fs==true)
      	{
      	 return "show";
      	}
      	
    
      	return "show";

     
    }
 
    @RequestMapping(value = "/security-error", method = RequestMethod.GET)
    public String securityError(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("page_error", "You do have have permission to do that!");
        return "redirect:/";
    }
 
}