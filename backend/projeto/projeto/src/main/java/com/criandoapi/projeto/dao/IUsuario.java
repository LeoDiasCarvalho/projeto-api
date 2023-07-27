package com.criandoapi.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import com.criandoapi.projeto.model.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{

}
