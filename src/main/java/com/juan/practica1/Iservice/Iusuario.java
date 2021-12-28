package com.juan.practica1.Iservice;

import java.util.List;
import java.util.Optional;

import com.juan.practica1.entity.Usuario;

public interface Iusuario {
	
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int add(Usuario u);
	public void delete(int id);
	

}
