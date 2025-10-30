package com.reservasDeAmbientes.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.reservasDeAmbientes.DTO.AmbienteDTO;
import com.reservasDeAmbientes.Service.AmbienteService;

@RestController
@RequestMapping("/ambientes")
public class AmbienteController extends BaseController <AmbienteDTO>{
    
    protected AmbienteController(AmbienteService service) {
        super(service);
    }

}
