package com.reservasDeAmbientes.Repository;

import org.springframework.stereotype.Repository;
import com.reservasDeAmbientes.Entity.Ambiente;

@Repository
public interface AmbienteRepository  extends BaseRepository <Ambiente, Long> {

}
