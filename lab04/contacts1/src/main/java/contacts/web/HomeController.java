package contacts.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import contacts.models.Model;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
		}
  
}
