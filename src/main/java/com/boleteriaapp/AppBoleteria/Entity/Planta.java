package com.boleteriaapp.AppBoleteria.Entity;

import javax.persistence.*;

@Entity
@Table(name = "plantas")

public class Planta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idplanta;

    @Column
    private String nombreplanta;

    @ManyToOne()
    @JoinColumn(name = "idestado" , referencedColumnName = "idestado")
    private Estado idestado;

    public long getIdplanta() {
        return idplanta;
    }

    public void setIdplanta(long idplanta) {
        this.idplanta = idplanta;
    }

    public String getNombreplanta() {
        return nombreplanta;
    }

    public void setNombreplanta(String nombreplanta) {
        this.nombreplanta = nombreplanta;
    }

    public Estado getIdestado() {
        return idestado;
    }

    public void setIdestado(Estado idestado) {
        this.idestado = idestado;
    }
}
