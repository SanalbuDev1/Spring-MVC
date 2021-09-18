package com.spring.mvc.root.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author salvarez
 * Componenete Spring tipo controlador
 * Se encarga de controlar los datos que entran de la parte del cliente MVC 
 *
 */

@Controller 
@RequestMapping("/app")
public class IndexController {

	/**
	 * @RequestMapping expone el servicio al navegador
	 * @return String
	 */
	
	//@RequestMapping(value= "/index", method = RequestMethod.GET)
	@GetMapping(value= {"/index",""})
	public String index(Model model) {
		Map<String,String> datos = new HashMap<String, String>();
		datos.put("titulo", "SpringMVC");	
		model.addAllAttributes(datos);
		return "index.xhtml";
	}
	
}
