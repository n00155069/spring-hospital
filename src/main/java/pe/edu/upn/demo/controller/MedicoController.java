package pe.edu.upn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upn.demo.model.entity.Medico;
import pe.edu.upn.demo.service.MedicoService;

@Controller
@RequestMapping("/medico")//Para el link de la pagina web

public class MedicoController {
	
	@Autowired //Crea una instancia de un objeto
	private MedicoService medicoService;
	
	@GetMapping
	public String inicio(Model model) {
		try {
			List<Medico> medicos = medicoService.findAll();
			model.addAttribute("medicos",medicos); //Obtiene la lista de medicos
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "/medico/inicio";//Nombre del html en tempaltate
	}
}
