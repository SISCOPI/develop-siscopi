/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.beans.genericos;

import java.util.ArrayList;

/**
 *
 * @author Mary
 */
public class ActividadEntregableC {
    
    private String actividad;
    private ArrayList<ActividadEntregableC> listaActividades;

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public ArrayList<ActividadEntregableC> getListaActividades() {
        return listaActividades;
    }

    public void setListaActividades(ArrayList<ActividadEntregableC> listaActividades) {
        this.listaActividades = listaActividades;
    }
    
}
