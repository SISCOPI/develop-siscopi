package com.siscopi.beans.negocio;
// Generated 7/11/2017 12:29:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CatGradoacademico generated by hbm2java
 */
public class CatGradoacademico  implements java.io.Serializable {


     private int tipoGrado;
     private String grado;
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public CatGradoacademico() {
    }

	
    public CatGradoacademico(int tipoGrado, String grado) {
        this.tipoGrado = tipoGrado;
        this.grado = grado;
    }
    public CatGradoacademico(int tipoGrado, String grado, Set<Usuarios> usuarioses) {
       this.tipoGrado = tipoGrado;
       this.grado = grado;
       this.usuarioses = usuarioses;
    }
   
    public int getTipoGrado() {
        return this.tipoGrado;
    }
    
    public void setTipoGrado(int tipoGrado) {
        this.tipoGrado = tipoGrado;
    }
    public String getGrado() {
        return this.grado;
    }
    
    public void setGrado(String grado) {
        this.grado = grado;
    }
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}


