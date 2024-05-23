package org.serratec.backend.esbocoAPI.controller;
	
	import java.util.List;

import org.serratec.backend.esbocoAPI.model.Postagem;
import org.serratec.backend.esbocoAPI.service.PostagemService;
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
	@RequestMapping("/posts")
	public class PostagemController {

	    @Autowired
	    private PostagemService postagemService;

	    @GetMapping
	    public List<Postagem> getAllPostagens() {
	        return postagemService.getAllPosts();
	    }

	    @GetMapping("/{id}")
	    public Postagem getPostById(@PathVariable Long id) {
	        return postagemService.getPostById(id);
	    }

	    @PostMapping
	    public ResponseEntity<Postagem> createPost(@RequestBody Postagem postagem) {
	        return new ResponseEntity<>(postagemService.savePost(postagem), HttpStatus.CREATED);
	    }
	}


