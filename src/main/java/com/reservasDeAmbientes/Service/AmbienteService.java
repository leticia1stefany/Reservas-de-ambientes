package com.reservasDeAmbientes.Service;

import org.springframework.stereotype.Service;
import com.reservasDeAmbientes.Repository.AmbienteRepository;
import com.reservasDeAmbientes.DTO.AmbienteDTO;
import com.reservasDeAmbientes.Entity.Ambiente;

@Service
public class AmbienteService extends BaseService<Ambiente, AmbienteDTO> {
    
    private AmbienteRepository repository;

    protected AmbienteService(AmbienteRepository repository){
    super(repository);
    this.repository = repository;

    }
}
