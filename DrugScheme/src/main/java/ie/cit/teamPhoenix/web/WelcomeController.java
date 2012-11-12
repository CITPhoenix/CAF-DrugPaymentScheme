package ie.cit.teamPhoenix.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome")
		public String welcome(Model model){
		return "welcome";
	}
	@RequestMapping(value="/public")
	public String publicView(Model model){
		return "public";
	}

}
