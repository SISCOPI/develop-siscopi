/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.springapp.controladores;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Mary
 */
@ManagedBean
@RequestScoped
public class LoginCtrl {

    /**
     * Creates a new instance of LoginCtrl
     */
    private String usuario;
    private String password;
    private String mensaje;

     public LoginCtrl() {
         
    }
     public String loginCtrl(){
         if("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(password)) {
            mensaje ="sesion iniciada Admin";
            return "SesionUsuario";
    	}
        else if("profesor".equalsIgnoreCase(usuario) && "profesor".equalsIgnoreCase(password)){
            mensaje ="sesion iniciada Profesor";
            return "SesionUsuario";
             
        }
        else if("asesor".equalsIgnoreCase(usuario) && "asesor".equalsIgnoreCase(password)){
            mensaje ="sesion iniciada Asesor";
            return "SesionUsuario";
             
        }
        else if("alumno".equalsIgnoreCase(usuario) && "alumno".equalsIgnoreCase(password)){
            mensaje ="sesion iniciada Asesor";
            return "SesionUsuario";
             
        }else {
            mensaje ="No existen  credenciales.";
            return "index";
    	}
     }
     
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
   
    
}
