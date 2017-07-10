/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.beans.propuestas;

import com.siscopi.beans.genericos.Persona;

/**
 *
 * @author Mary
 */
public class ResponsablePropuesta extends Persona {
    private String cargo;
    private String adscripcion;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getAdscripcion() {
        return adscripcion;
    }

    public void setAdscripcion(String adscripcion) {
        this.adscripcion = adscripcion;
    }
}
