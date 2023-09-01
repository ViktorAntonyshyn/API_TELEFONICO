package com.example.PROYECTO_FULLSTACK.infra.repositories;

import com.example.PROYECTO_FULLSTACK.domain.models.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CitaRepository extends JpaRepository<Cita, Integer> {



}
