package com.reservasDeAmbientes.Repository;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;
import com.reservasDeAmbientes.Entity.Reserva;

@Repository
@EnableJpaAuditing

public interface ReservaRepository extends BaseRepository<Reserva, Long> {


}
