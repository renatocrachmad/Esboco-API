package org.serratec.backend.esbocoAPI.controller;	
	
import java.util.List;

import org.serratec.backend.esbocoAPI.model.Usuario;
import org.serratec.backend.esbocoAPI.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/usuarios")
	public class UsuarioController {

	    @Autowired
	    private UsuarioService usuarioService;

	    @GetMapping
	    public List<Usuario> getAllUsers() {
	        return usuarioService.getAllUsers();
	    }

	    @GetMapping("/{id}")
	    public Usuario getUserById(@PathVariable Long id) {
	        return usuarioService.getUserById(id);
	    }

	    @PostMapping
	    public ResponseEntity<Usuario> createUser(@RequestBody Usuario usuario) {
	        return new ResponseEntity<>(usuarioService.saveUser(usuario), HttpStatus.CREATED);
	    }
	}


