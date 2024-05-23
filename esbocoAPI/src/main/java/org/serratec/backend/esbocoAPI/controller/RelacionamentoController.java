package org.serratec.backend.esbocoAPI.controller;

import java.util.List;

import org.serratec.backend.esbocoAPI.model.Relacionamento;
import org.serratec.backend.esbocoAPI.service.RelacionamentoService;
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
@RequestMapping("/relacionamentos")
public class RelacionamentoController {

	@Autowired
	private RelacionamentoService relacionamentoService;

	@GetMapping
	public List<Relacionamento> getAllRelacionamento() {
		return relacionamentoService.getAllRelacionamento();
	}

	@GetMapping("/{id}")
	public Relacionamento getRelacionametoById(@PathVariable Long id) {
		return relacionamentoService.getRelacionamentoById(id);
	}

	@PostMapping
	public ResponseEntity<Relacionamento> createRelacionamento(@RequestBody Relacionamento relacionamento) {
		return new ResponseEntity<>(relacionamentoService.saveRelacionamento(relacionamento), HttpStatus.CREATED);
	}

}
