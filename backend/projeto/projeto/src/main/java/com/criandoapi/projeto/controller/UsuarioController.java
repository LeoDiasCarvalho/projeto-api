package com.criandoapi.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criandoapi.projeto.dao.IUsuario;
import com.criandoapi.projeto.model.Usuario;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private IUsuario dao;
	
	//Método para retornar todos os usuário do banco de dados
	@GetMapping
	public List<Usuario> findAll() {

		return (List<Usuario>) dao.findAll();
	}
	
	//Método para salvar um usuário no banco
	@PostMapping
	public Usuario save(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	//Método para alterar um usuário já existente no banco
	@PutMapping
	public Usuario update(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = dao.save(usuario);
		return usuarioNovo;
	}
	
	
	//Método para excluir um usuário do banco
	@DeleteMapping("/{id}")
	public Optional<Usuario> delete(@PathVariable Integer id) {
		Optional<Usuario> usuario = dao.findById(id);
		dao.deleteById(id);
		return usuario;
	}
}
