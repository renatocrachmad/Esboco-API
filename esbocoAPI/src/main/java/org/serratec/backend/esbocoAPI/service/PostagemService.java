package org.serratec.backend.esbocoAPI.service;
	
import java.util.List;

import org.serratec.backend.esbocoAPI.model.Postagem;
import org.serratec.backend.esbocoAPI.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class PostagemService {

	    @Autowired
	    private PostagemRepository postagemRepository;

	    public List<Postagem> getAllPosts() {
	        return postagemRepository.findAll();
	    }

	    public Postagem getPostById(Long id) {
	        return postagemRepository.findById(id).orElse(null);
	    }

	    public Postagem savePost(Postagem post) {
	        return postagemRepository.save(post);
	    }
	}
	


