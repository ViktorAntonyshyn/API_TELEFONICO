package com.example.PROYECTO_FULLSTACK.domain.service;

import com.example.PROYECTO_FULLSTACK.domain.models.Cita;
import com.example.PROYECTO_FULLSTACK.infra.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitaService {

    private final CitaRepository citaRepository;
    @Autowired
    public CitaService(CitaRepository citaRepository) {

        this.citaRepository = citaRepository;
    }

    public List<Cita> getPedido(){

        return citaRepository.findAll();
    }

    public void newPedido(Cita cita) {
        citaRepository.save(cita);
    }
    public Cita citaById(Integer id) {
        Optional<Cita> citaByID = (citaRepository.findById(id));
        return citaByID.orElse(null);
    }
    public void update(Integer id, Cita cita) {
        Cita pedidoExistente = citaById(id);

        if (pedidoExistente == null) {
            System.out.println("error");

        }
        pedidoExistente.setNameCita(cita.getNameCita());
        pedidoExistente.setNameUser(cita.getNameUser());
        pedidoExistente.setFecha(cita.getFecha());
        pedidoExistente.setHora(cita.getHora());

        citaRepository.save(pedidoExistente);
    }


    public void delete(Integer id, Cita cita) {
        boolean existe = citaRepository.existsById(id);
        if (existe) {
            citaRepository.delete(cita);
        }
    }
}
