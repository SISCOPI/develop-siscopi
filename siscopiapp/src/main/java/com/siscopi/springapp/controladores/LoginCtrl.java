/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.springapp.controladores;

import com.siscopi.beans.negocio.Usuarios;
import com.siscopi.dao.UsuarioDao;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.inject.Inject;  

/**
 *
 * @author Mary
 */
@Component
@ManagedBean(name="login")
@SessionScoped


public class LoginCtrl implements Serializable {

    /**
     * Creates a new instance of LoginCtrl
     */
    private static final long serialVersionUID = 1L;
    private String usuario;
    private String password;
    private String mensaje;
    private String perfilSelect;  
    private List<String> perfiles; 
    private String username;
    private Usuarios usuarios;
    
    @Inject
//    private Usuarios usuarios;
    
    private UsuarioDao usuarioDao= new UsuarioDao();
//    @ManagedProperty(value="#{usuarioDao}")
//    UsuarioDao usuarioDao;
//    
    private static final Logger logger = Logger.getLogger(LoginCtrl.class);

     public LoginCtrl() {
            perfiles = new ArrayList<String>();
            perfiles.add("Administrador");
            perfiles.add("Profesor");
            perfiles.add("Asesor");
            usuarios=new Usuarios();

           
    }

     public String loginCtrl(){
         usuarios=new Usuarios();
         usuarios.setEmail(usuario);
         usuarios.setContrasena(password);
         //usuarioDao.validaContrasena(usuarios);
         if(usuarioDao.validaContrasena(usuarios)!=null){
             System.out.println("contrasena correcta");
         }
         else{
             System.out.println("no entro. Validar");
         }
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
            return "inicio";
    	}
     }
     
     public String iniciaSesion() {
         logger.info("perfilSelect:"+perfilSelect);
         System.out.println("perfilSelect:"+perfilSelect);
//         perfilSelect="Administrador";
         if(perfilSelect.equalsIgnoreCase("Administrador")){
             
             return "SesionUsuarioAdmin";
         }
         else if(perfilSelect.equalsIgnoreCase("Profesor")){
             return "SesionUsuarioPami";
         }
         else if(perfilSelect.equalsIgnoreCase("Asesor")){
             return "SesionUsuarioAsesor";
         }
         else{
             return"index"; 
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
    
   
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
    
}
