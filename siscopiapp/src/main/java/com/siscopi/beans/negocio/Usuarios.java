package com.siscopi.beans.negocio;
// Generated 7/11/2017 12:29:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuario;
     private CatGradoacademico catGradoacademico;
     private String contrasena;
     private String nombre;
     private String email;
     private String apPaterno;
     private String apMaterno;
     private Set<RolesUsuarios> rolesUsuarioses = new HashSet<RolesUsuarios>(0);

    public Usuarios() {
    }

	
    public Usuarios(String contrasena, String nombre, String email, String apPaterno, String apMaterno) {
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.email = email;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }
    public Usuarios(CatGradoacademico catGradoacademico, String contrasena, String nombre, String email, String apPaterno, String apMaterno, Set<RolesUsuarios> rolesUsuarioses) {
       this.catGradoacademico = catGradoacademico;
       this.contrasena = contrasena;
       this.nombre = nombre;
       this.email = email;
       this.apPaterno = apPaterno;
       this.apMaterno = apMaterno;
       this.rolesUsuarioses = rolesUsuarioses;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public CatGradoacademico getCatGradoacademico() {
        return this.catGradoacademico;
    }
    
    public void setCatGradoacademico(CatGradoacademico catGradoacademico) {
        this.catGradoacademico = catGradoacademico;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApPaterno() {
        return this.apPaterno;
    }
    
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    public String getApMaterno() {
        return this.apMaterno;
    }
    
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    public Set<RolesUsuarios> getRolesUsuarioses() {
        return this.rolesUsuarioses;
    }
    
    public void setRolesUsuarioses(Set<RolesUsuarios> rolesUsuarioses) {
        this.rolesUsuarioses = rolesUsuarioses;
    }




}


