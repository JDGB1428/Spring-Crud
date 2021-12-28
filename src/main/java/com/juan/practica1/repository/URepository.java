package com.juan.practica1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.juan.practica1.entity.Usuario;

@Repository
public interface URepository extends CrudRepository<Usuario, Integer>  {

}
