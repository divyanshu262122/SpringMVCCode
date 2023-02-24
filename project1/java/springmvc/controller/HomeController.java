package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{

	@GetMapping("/home")
public String IndexPage(Model model) {
	
		System.out.println("It has been run easily");
		
		model.addAttribute("name","dev");
		model.addAttribute("id",1234);
		
		List<String> friends=new ArrayList<String>();
		friends.add("kjdw");
		friends.add("lsjdj");
		friends.add("slkjdk"); 		friends.add("kwjwdjw");
		model.addAttribute("f",friends);
		
		return "index";
}
@RequestMapping("/help")
public ModelAndView help()
{ 
	System.out.println("It has been run ");
	//creating model and view object
	ModelAndView modelAndView=new ModelAndView();
	
	//setting date and time \
	LocalDateTime now=LocalDateTime.now();
	//setting the data
	modelAndView.addObject("name","Dishu");
	modelAndView.addObject("rno",245454);
	modelAndView.addObject("time",now);
	
	List<Integer> list=new ArrayList<Integer>();
	list.add(832);
	list.add(832);
	list.add(832);
	list.add(832);
	list.add(832);
	list.add(832);
	list.add(832);
	list.add(832);
	modelAndView.addObject("marks",list);
	//for traversing list we will use jstl
	
	
	//setting the view name
	modelAndView.setViewName("help");
	return  modelAndView;
}

}