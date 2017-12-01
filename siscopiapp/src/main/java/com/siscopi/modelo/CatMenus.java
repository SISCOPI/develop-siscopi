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
@Table(name = "CAT_MENUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CatMenus.findAll", query = "SELECT c FROM CatMenus c")
    , @NamedQuery(name = "CatMenus.findByIdCategoria", query = "SELECT c FROM CatMenus c WHERE c.idCategoria = :idCategoria")
    , @NamedQuery(name = "CatMenus.findByNombre", query = "SELECT c FROM CatMenus c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "CatMenus.findByNiveles", query = "SELECT c FROM CatMenus c WHERE c.niveles = :niveles")
    , @NamedQuery(name = "CatMenus.findByNivelPadre", query = "SELECT c FROM CatMenus c WHERE c.nivelPadre = :nivelPadre")
    , @NamedQuery(name = "CatMenus.findByVisible", query = "SELECT c FROM CatMenus c WHERE c.visible = :visible")
    , @NamedQuery(name = "CatMenus.findByImg", query = "SELECT c FROM CatMenus c WHERE c.img = :img")})
public class CatMenus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CATEGORIA")
    private Integer idCategoria;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "NIVELES")
    private String niveles;
    @Column(name = "NIVEL_PADRE")
    private Integer nivelPadre;
    @Basic(optional = false)
    @Column(name = "VISIBLE")
    private boolean visible;
    @Column(name = "IMG")
    private String img;
    @OneToMany(mappedBy = "idCategoria")
    private List<RolesMenus> rolesMenusList;

    public CatMenus() {
    }

    public CatMenus(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public CatMenus(Integer idCategoria, String nombre, boolean visible) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.visible = visible;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNiveles() {
        return niveles;
    }

    public void setNiveles(String niveles) {
        this.niveles = niveles;
    }

    public Integer getNivelPadre() {
        return nivelPadre;
    }

    public void setNivelPadre(Integer nivelPadre) {
        this.nivelPadre = nivelPadre;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatMenus)) {
            return false;
        }
        CatMenus other = (CatMenus) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.CatMenus[ idCategoria=" + idCategoria + " ]";
    }
    
}
