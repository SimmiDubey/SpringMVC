package homecontroller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcmodel.User;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String showForm() {
		return "form";
	}

	
	
	@RequestMapping(path = "/saveUser", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		
		model.addAttribute(user);
		
		return "success";
		
	
//	@RequestMapping(path = "/saveUser", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("name") String userName, @RequestParam("age") int userAge,Model model) {
//		
//		System.out.println("user name "+userName);
//	     System.out.println("user age "+userAge);
//	     
//	     model.addAttribute("name",userName);
//	     model.addAttribute("age",userAge);
//		return "success";

	}

}
