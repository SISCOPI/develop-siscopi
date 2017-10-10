/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.springapp.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
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
    private String perfilSelect;  
    private List<String> perfiles; 
    private String username;

     public LoginCtrl() {
            perfiles = new ArrayList<String>();
            perfiles.add("Administrador");
            perfiles.add("Profesor");
            perfiles.add("Asesor");
           
    }

     public String loginCtrl(){
         if("admin".equalsIgnoreCase(usuario) && "admin".equalsIgnoreCase(password)) {
            mensaje ="sesion iniciada Admin";
            this.username="Benito Casas";
            return "general/login/loginPerfiles";
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

    public String getPerfilSelect() {
        return perfilSelect;
    }

    public void setPerfilSelect(String perfilSelect) {
        this.perfilSelect = perfilSelect;
    }

    public List<String> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(List<String> perfiles) {
        this.perfiles = perfiles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   
    
}
