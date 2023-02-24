package springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
@Controller
public class ContactController {
//for using single thing in multiple pages
	@ModelAttribute
	public void compulsory(Model model) {
		model.addAttribute("Header","Learn Java With Me!");
		model.addAttribute("desc","Are you ready to code with us.");
	}
	
	@RequestMapping("/")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping("/processform")
     public String formContact(@ModelAttribute User user,Model model)
	{

		System.out.println(user); 
	   return "success";
     }
	/*
	 * 
	 *defining requestParam annotation rule
	 public String formContact(@RequestParam("email") String email,
    		 @RequestParam("name" ) String name,
        @RequestParam("password") String password,Model model)
	{

		 User user=new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		
		System.out.println(user);
		model.addAttribute("user",user);
		
		//model.addAttribute("email",email); 
		  //  model.addAttribute("name",name);
		    //model.addAttribute("password",password);
		    
	  //  System.out.println("User Email"+email);
       // System.out.println("User Name"+name);
	    //System.out.println("User Password"+password);
	   return "success";
     } */

	No Comment
}

