package com.example.PROYECTO_FULLSTACK.apiControllers;

import com.example.PROYECTO_FULLSTACK.domain.models.Cita;
import com.example.PROYECTO_FULLSTACK.domain.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping(path = "/api/v1/citas")
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
    @GetMapping("/{id}")
    public ResponseEntity<Cita> getCitaPorId(@PathVariable Integer id) {
        // Lógica para obtener la cita por ID y devolverla en la respuesta ResponseEntity
        Cita cita = citaService.citaById(id);
        if (cita != null ) {
            return ResponseEntity.ok(cita);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void createPedido(@RequestBody Cita cita){
    citaService.newPedido(cita);
    }

    @PutMapping("/{id}")
    public void updatePedido(@PathVariable Integer id, @RequestBody Cita cita){
         citaService.update(id, cita);
    }

    @DeleteMapping("/{id}")
    public void  deletePedido(@PathVariable Integer id, Cita cita){
    citaService.delete(id, cita);
    }
}
