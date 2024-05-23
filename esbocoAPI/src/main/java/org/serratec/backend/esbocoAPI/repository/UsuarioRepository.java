package org.serratec.backend.esbocoAPI.repository;

import org.serratec.backend.esbocoAPI.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
