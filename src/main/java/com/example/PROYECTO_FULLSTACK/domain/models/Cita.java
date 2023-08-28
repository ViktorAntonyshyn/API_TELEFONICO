package com.example.PROYECTO_FULLSTACK.domain.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
@Entity
@Table

public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameCita;
    private String nameUser;
    private String fecha;
    private Integer hora;

    public Cita() {
    }

    public Cita(Integer id, String nameCita, String nameUser, String fecha, Integer hora) {
        this.id = id;
        this.nameCita = nameCita;
        this.nameUser = nameUser;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Cita(String nameCita, String nameUser, String fecha, Integer hora) {
        this.nameCita = nameCita;
        this.nameUser = nameUser;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCita() {
        return nameCita;
    }

    public void setNameCita(String nameCita) {
        this.nameCita = nameCita;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }
}
