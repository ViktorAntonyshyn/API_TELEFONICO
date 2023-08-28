package com.example.PROYECTO_FULLSTACK.apiControllers;

import com.example.PROYECTO_FULLSTACK.domain.models.Cita;
import com.example.PROYECTO_FULLSTACK.domain.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/citas")
public class CitaController {

    private final CitaService citaService;
@Autowired

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }
    @GetMapping
    public List <Cita> getPedidoController(){
    return citaService.getPedido();
    }

    @PostMapping
    public void createPedido(@RequestBody Cita cita){
    citaService.newCita(cita);
    }

    //@PutMapping("/{id}")
    //public void updatePedido(@PathVariable Integer id, @RequestBody Cita cita){
         //citaService.update(id, cita);
    //}



}
