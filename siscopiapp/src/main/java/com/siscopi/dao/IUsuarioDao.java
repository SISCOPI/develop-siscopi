/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.dao;

import com.siscopi.beans.negocio.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author Mary
 */
public interface IUsuarioDao {
    
    public void addUser(Usuarios usuario);
    public Usuarios validaContrasena(Usuarios usuario);
    
    
    
}
