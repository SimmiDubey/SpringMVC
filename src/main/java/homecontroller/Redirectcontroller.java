package homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Redirectcontroller {

	 @RequestMapping("/one")
	public RedirectView one() {
		
		System.out.println("This is one handler");
		RedirectView redirectview=new RedirectView();
		redirectview.setUrl("enjoy");
		
		 return redirectview;
	}
	 
	 
	 @RequestMapping("/enjoy")
	 public String enjoy() {
		  System.out.println("This is second handler");
		  
		 return "";
	 }
}
