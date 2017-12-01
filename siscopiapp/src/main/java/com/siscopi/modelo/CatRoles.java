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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "CAT_ROLES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatRoles.findAll", query = "SELECT c FROM CatRoles c")
    , @NamedQuery(name = "CatRoles.findByIdRol", query = "SELECT c FROM CatRoles c WHERE c.idRol = :idRol")
    , @NamedQuery(name = "CatRoles.findByRol", query = "SELECT c FROM CatRoles c WHERE c.rol = :rol")})
public class CatRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ROL")
    private Integer idRol;
    @Basic(optional = false)
    @Column(name = "ROL")
    private String rol;
    @OneToMany(mappedBy = "idRol")
    private List<RolesUsuarios> rolesUsuariosList;
    @OneToMany(mappedBy = "idRol")
    private List<RolesMenus> rolesMenusList;

    public CatRoles() {
    }

    public CatRoles(Integer idRol) {
        this.idRol = idRol;
    }

    public CatRoles(Integer idRol, String rol) {
        this.idRol = idRol;
        this.rol = rol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlTransient
    public List<RolesUsuarios> getRolesUsuariosList() {
        return rolesUsuariosList;
    }

    public void setRolesUsuariosList(List<RolesUsuarios> rolesUsuariosList) {
        this.rolesUsuariosList = rolesUsuariosList;
    }

    @XmlTransient
    public List<RolesMenus> getRolesMenusList() {
        return rolesMenusList;
    }

    public void setRolesMenusList(List<RolesMenus> rolesMenusList) {
        this.rolesMenusList = rolesMenusList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRol != null ? idRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatRoles)) {
            return false;
        }
        CatRoles other = (CatRoles) object;
        if ((this.idRol == null && other.idRol != null) || (this.idRol != null && !this.idRol.equals(other.idRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.CatRoles[ idRol=" + idRol + " ]";
    }
    
}
