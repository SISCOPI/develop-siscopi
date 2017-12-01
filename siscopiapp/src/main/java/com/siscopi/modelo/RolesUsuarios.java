/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mary
 */
@Entity
@Table(name = "ROLES_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolesUsuarios.findAll", query = "SELECT r FROM RolesUsuarios r")
    , @NamedQuery(name = "RolesUsuarios.findByIdRoluser", query = "SELECT r FROM RolesUsuarios r WHERE r.idRoluser = :idRoluser")})
public class RolesUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ROLUSER")
    private Integer idRoluser;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL")
    @ManyToOne
    private CatRoles idRol;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuarios idUsuario;

    public RolesUsuarios() {
    }

    public RolesUsuarios(Integer idRoluser) {
        this.idRoluser = idRoluser;
    }

    public Integer getIdRoluser() {
        return idRoluser;
    }

    public void setIdRoluser(Integer idRoluser) {
        this.idRoluser = idRoluser;
    }

    public CatRoles getIdRol() {
        return idRol;
    }

    public void setIdRol(CatRoles idRol) {
        this.idRol = idRol;
    }

    public Usuarios getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuarios idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRoluser != null ? idRoluser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesUsuarios)) {
            return false;
        }
        RolesUsuarios other = (RolesUsuarios) object;
        if ((this.idRoluser == null && other.idRoluser != null) || (this.idRoluser != null && !this.idRoluser.equals(other.idRoluser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.RolesUsuarios[ idRoluser=" + idRoluser + " ]";
    }
    
}
