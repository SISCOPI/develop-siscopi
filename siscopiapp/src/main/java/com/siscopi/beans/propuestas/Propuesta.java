/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.beans.propuestas;

import com.siscopi.beans.genericos.ActividadEntregableC;
import com.siscopi.beans.genericos.Persona;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mary
 */
public class Propuesta {
    private Date fechaSolicitud;
    private String nombre;
    private String objetivo;
    private ActividadEntregableC listaEntregables;
    private Date fechaInicio;
    private Date fechaFin;
    private ArrayList<String> carreras;
    private ResponsablePropuesta responsable;
    private Persona solicitante;
    private ActividadEntregableC listaActividades;

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public ActividadEntregableC getListaEntregables() {
        return listaEntregables;
    }

    public void setListaEntregables(ActividadEntregableC listaEntregables) {
        this.listaEntregables = listaEntregables;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<String> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<String> carreras) {
        this.carreras = carreras;
    }

    public ResponsablePropuesta getResponsable() {
        return responsable;
    }

    public void setResponsable(ResponsablePropuesta responsable) {
        this.responsable = responsable;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public ActividadEntregableC getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ActividadEntregableC listaActividades) {
        this.listaActividades = listaActividades;
    }
    
}
