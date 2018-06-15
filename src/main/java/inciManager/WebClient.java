package inciManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import inciManager.entities.Agente;

@Controller
public class WebClient {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String logInGet() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String logInPost(@ModelAttribute Agente agente, Model modelo, @RequestParam String operation) {
		modelo.addAttribute("agente", agente);
		
		if(operation.equals("add"))
				return "incidence/add";
		if(operation.equals("view"))
			return "incidence/get";
		else
			return "error";
	}	

}
