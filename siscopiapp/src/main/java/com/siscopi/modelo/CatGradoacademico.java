/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Mary
 */
@Entity
@Table(name = "CAT_GRADOACADEMICO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatGradoacademico.findAll", query = "SELECT c FROM CatGradoacademico c")
    , @NamedQuery(name = "CatGradoacademico.findByTipoGrado", query = "SELECT c FROM CatGradoacademico c WHERE c.tipoGrado = :tipoGrado")
    , @NamedQuery(name = "CatGradoacademico.findByGrado", query = "SELECT c FROM CatGradoacademico c WHERE c.grado = :grado")})
public class CatGradoacademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIPO_GRADO")
    private Integer tipoGrado;
    @Basic(optional = false)
    @Column(name = "GRADO")
    private String grado;
    @OneToMany(mappedBy = "tipoGrado")
    private List<Usuarios> usuariosList;

    public CatGradoacademico() {
    }

    public CatGradoacademico(Integer tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

    public CatGradoacademico(Integer tipoGrado, String grado) {
        this.tipoGrado = tipoGrado;
        this.grado = grado;
    }

    public Integer getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(Integer tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoGrado != null ? tipoGrado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatGradoacademico)) {
            return false;
        }
        CatGradoacademico other = (CatGradoacademico) object;
        if ((this.tipoGrado == null && other.tipoGrado != null) || (this.tipoGrado != null && !this.tipoGrado.equals(other.tipoGrado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.CatGradoacademico[ tipoGrado=" + tipoGrado + " ]";
    }
    
}
