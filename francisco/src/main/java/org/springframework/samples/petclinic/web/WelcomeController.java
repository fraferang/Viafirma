package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.NewPDFService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.Path;
import java.nio.file.Paths;

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
	
	Path path = Paths.get("static/resources/path/VIAFIRMA_PATH.txt");

	
	@GetMapping("/path")
	public String path(Map<String, Object> model) {
	  return "path";
	}
}
