package homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class HomeController {
   
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("hello this is home url");
		
		model.addAttribute("name","Dubey Simmi");
		model.addAttribute("id",123);
		
		return "index";
	}
		@RequestMapping("/help")
		public ModelAndView help()
		{
			System.out.println("this is help controller");
			
			ModelAndView modelandview=new ModelAndView();
			modelandview.addObject("name","Soni dubey");
			modelandview.addObject("id",1234);
			modelandview.setViewName("help");
			
			return modelandview;
		}
	
}
