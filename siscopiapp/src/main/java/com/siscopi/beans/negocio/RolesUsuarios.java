package com.siscopi.beans.negocio;
// Generated 7/11/2017 12:29:29 PM by Hibernate Tools 4.3.1



/**
 * RolesUsuarios generated by hbm2java
 */
public class RolesUsuarios  implements java.io.Serializable {


     private Integer idRoluser;
     private CatRoles catRoles;
     private Usuarios usuarios;

    public RolesUsuarios() {
    }

    public RolesUsuarios(CatRoles catRoles, Usuarios usuarios) {
       this.catRoles = catRoles;
       this.usuarios = usuarios;
    }
   
    public Integer getIdRoluser() {
        return this.idRoluser;
    }
    
    public void setIdRoluser(Integer idRoluser) {
        this.idRoluser = idRoluser;
    }
    public CatRoles getCatRoles() {
        return this.catRoles;
    }
    
    public void setCatRoles(CatRoles catRoles) {
        this.catRoles = catRoles;
    }
    public Usuarios getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }




}


