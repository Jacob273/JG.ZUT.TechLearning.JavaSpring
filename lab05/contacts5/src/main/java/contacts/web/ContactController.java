package contacts.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import contacts.Contact;
import contacts.data.ContactRepository;

@Controller
@RequestMapping("/contact")
public class ContactController {

		@Autowired
		ContactRepository contactRepository;
		
		@RequestMapping(value = "/create", method = RequestMethod.GET)
		public String showRegistrationForm(Model model) {
			model.addAttribute(new Contact());
			return "contactForm";
		}
		
		@RequestMapping(value = "/create", method = RequestMethod.POST)
		public String processContact(Contact contact) {
				contactRepository.insert(contact);
				return "redirect:/";
		}
	  
}
