package com.juan.practica1.controller;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.practica1.entity.Usuario;
import com.juan.practica1.service.UsuarioService;

@Controller
@RequestMapping
public class UsuarioController{
	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Usuario>usuarios=service.listar();
		model.addAttribute("usuarios", usuarios);
		return "index";	
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Valid Usuario u, Model model) {
		service.add(u);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model){
		Optional<Usuario>usuarios=service.listarId(id);
		model.addAttribute("usuario", usuarios);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}

}
