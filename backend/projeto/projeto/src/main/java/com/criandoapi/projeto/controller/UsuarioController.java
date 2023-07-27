package com.criandoapi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criandoapi.projeto.dao.IUsuario;
import com.criandoapi.projeto.model.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuario dao;
	
	//Método para retornar todos os usuário do banco de dados
	@GetMapping("/usuarios")
	public List<Usuario> findAll() {

		return (List<Usuario>) dao.findAll();
	}

}
