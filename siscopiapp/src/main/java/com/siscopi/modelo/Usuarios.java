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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios_1.findAll", query = "SELECT u FROM Usuarios_1 u")
    , @NamedQuery(name = "Usuarios_1.findByIdUsuario", query = "SELECT u FROM Usuarios_1 u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuarios_1.findByContrasena", query = "SELECT u FROM Usuarios_1 u WHERE u.contrasena = :contrasena")
    , @NamedQuery(name = "Usuarios_1.findByNombre", query = "SELECT u FROM Usuarios_1 u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuarios_1.findByEmail", query = "SELECT u FROM Usuarios_1 u WHERE u.email = :email")
    , @NamedQuery(name = "Usuarios_1.findByApPaterno", query = "SELECT u FROM Usuarios_1 u WHERE u.apPaterno = :apPaterno")
    , @NamedQuery(name = "Usuarios_1.findByApMaterno", query = "SELECT u FROM Usuarios_1 u WHERE u.apMaterno = :apMaterno")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;
    @Basic(optional = false)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "AP_PATERNO")
    private String apPaterno;
    @Basic(optional = false)
    @Column(name = "AP_MATERNO")
    private String apMaterno;
    @OneToMany(mappedBy = "idUsuario")
    private List<RolesUsuarios> rolesUsuariosList;
    @JoinColumn(name = "TIPO_GRADO", referencedColumnName = "TIPO_GRADO")
    @ManyToOne
    private CatGradoacademico tipoGrado;

    public Usuarios() {
    }

    public Usuarios(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuarios(Integer idUsuario, String contrasena, String nombre, String email, String apPaterno, String apMaterno) {
        this.idUsuario = idUsuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.email = email;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    @XmlTransient
    public List<RolesUsuarios> getRolesUsuariosList() {
        return rolesUsuariosList;
    }

    public void setRolesUsuariosList(List<RolesUsuarios> rolesUsuariosList) {
        this.rolesUsuariosList = rolesUsuariosList;
    }

    public CatGradoacademico getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(CatGradoacademico tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.siscopi.modelo.Usuarios_1[ idUsuario=" + idUsuario + " ]";
    }
    
}
