package org.serratec.backend.esbocoAPI.service;
	
import org.serratec.backend.esbocoAPI.model.Relacionamento;
import org.serratec.backend.esbocoAPI.repository.RelacionamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

	@Service
	public class RelacionamentoService {

	    @Autowired
	    private RelacionamentoRepository relacionamentoRepository;

	    public List<Relacionamento> getAllRelacionamento() {
	        return relacionamentoRepository.findAll();
	    }

	    public Relacionamento getRelacionamentoById(Long id) {
	        return relacionamentoRepository.findById(id).orElse(null);
	    }

	    public Relacionamento saveRelacionamento(Relacionamento relacionamento) {
	        return relacionamentoRepository.save(relacionamento);
	    }
	}


