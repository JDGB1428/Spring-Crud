package com.juan.practica1.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.practica1.Iservice.Iusuario;
import com.juan.practica1.entity.Usuario;
import com.juan.practica1.repository.URepository;

@Service
public class UsuarioService implements Iusuario {
	
	@Autowired
	private URepository repositorio;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>)repositorio.findAll();
	}

	@Override
	public Optional<Usuario> listarId(int id) {
		return repositorio.findById(id);
	}

	@Override
	public int add(Usuario u) {
		int res = 0;
		Usuario usuario = repositorio.save(u);
		if(!usuario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		repositorio.deleteById(id);
		
	}

	
}
