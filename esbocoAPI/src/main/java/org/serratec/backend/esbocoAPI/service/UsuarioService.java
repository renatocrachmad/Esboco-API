package org.serratec.backend.esbocoAPI.service;

import java.util.List;

import org.serratec.backend.esbocoAPI.model.Usuario;
import org.serratec.backend.esbocoAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;	

@Service
public class UsuarioService {		


	    @Autowired
	    private UsuarioRepository usuarioRepository;

	    public List<Usuario> getAllUsers() {
	        return usuarioRepository.findAll();
	    }

	    public Usuario getUserById(Long id) {
	        return usuarioRepository.findById(id).orElse(null);
	    }

	    public Usuario saveUser(Usuario usuario) {
	        return usuarioRepository.save(usuario);
	    }
	}



