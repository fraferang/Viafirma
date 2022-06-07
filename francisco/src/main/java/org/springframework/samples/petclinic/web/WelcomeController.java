package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.samples.petclinic.service.NewPDFService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.samples.petclinic.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class WelcomeController {
	
	@Autowired
	private NewPDFService newPDFService;
	
	
	@GetMapping({"/","/welcome"})
	public String welcome(Map<String, Object> model) {	    

	  return "welcome";
	}
	  
	@GetMapping("/newPDF")
	public String newPDF(Map<String, Object> model) {
	  this.newPDFService.newPDF();
	  return "newPDF";
	}
}
