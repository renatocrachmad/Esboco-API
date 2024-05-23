package org.serratec.backend.esbocoAPI.repository;

import org.serratec.backend.esbocoAPI.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	}

