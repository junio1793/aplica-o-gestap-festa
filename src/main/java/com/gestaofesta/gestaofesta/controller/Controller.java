package com.gestaofesta.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestaofesta.gestaofesta.model.Convidado;
import com.gestaofesta.gestaofesta.repository.Repository;

@org.springframework.stereotype.Controller
@RequestMapping("/convidados")
public class Controller {
	
	@Autowired
	private Repository repositorio;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView mdv = new ModelAndView("ListaConvidados");
		mdv.addObject("convidado",repositorio.findAll());
		mdv.addObject(new Convidado());
		return mdv;
	}
	
	@PostMapping
	public String salvar(Convidado convidado) {
		this.repositorio.save(convidado);
		return "redirect:/convidados";
	}
}
