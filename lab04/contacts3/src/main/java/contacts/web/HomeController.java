package contacts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import contacts.Contact;
import contacts.data.ContactsRepository;


@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired
	ContactsRepository _repo;
	
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("contacts", _repo.findContacts(100, 30));
		return "home";
		}
  
}
