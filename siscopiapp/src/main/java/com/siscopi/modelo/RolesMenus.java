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
@Table(name = "ROLES_MENUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolesMenus.findAll", query = "SELECT r FROM RolesMenus r")
    , @NamedQuery(name = "RolesMenus.findByIdRolmenu", query = "SELECT r FROM RolesMenus r WHERE r.idRolmenu = :idRolmenu")})
public class RolesMenus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ROLMENU")
    private Integer idRolmenu;
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID_CATEGORIA")
    @ManyToOne
    private CatMenus idCategoria;
    @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL")
    @ManyToOne
    private CatRoles idRol;

    public RolesMenus() {
    }

    public RolesMenus(Integer idRolmenu) {
        this.idRolmenu = idRolmenu;
    }

    public Integer getIdRolmenu() {
        return idRolmenu;
    }

    public void setIdRolmenu(Integer idRolmenu) {
        this.idRolmenu = idRolmenu;
    }

    public CatMenus getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CatMenus idCategoria) {
        this.idCategoria = idCategoria;
    }

    public CatRoles getIdRol() {
        return idRol;
    }

    public void setIdRol(CatRoles idRol) {
        this.idRol = idRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolmenu != null ? idRolmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolesMenus)) {
            return false;
        }
        RolesMenus other = (RolesMenus) object;
        if ((this.idRolmenu == null && other.idRolmenu != null) || (this.idRolmenu != null && !this.idRolmenu.equals(other.idRolmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.RolesMenus[ idRolmenu=" + idRolmenu + " ]";
    }
    
}
