package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one() {
	System.out.println("this is one handller");
	//prefix redirect
	return "redirect:/enjoy";
	}
	@RequestMapping("/two")
	public RedirectView two() {
		System.out.println("this is second handller");
		RedirectView redirectView=new RedirectView();
        redirectView.setUrl("one");
		return redirectView;
	}
	
}
