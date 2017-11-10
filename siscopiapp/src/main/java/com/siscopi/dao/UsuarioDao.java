/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.dao;

import com.siscopi.beans.negocio.RolesUsuarios;
import com.siscopi.beans.negocio.Usuarios;
import com.siscopi.modelo.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mary
 */
public class UsuarioDao extends HibernateDaoSupport implements IUsuarioDao, Serializable{

    public void addUser(Usuarios usuario) {
        getHibernateTemplate().saveOrUpdate(usuario);
    }

    public ArrayList<Usuarios> buscarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean validaContrasena(Usuarios usuario){
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{
      
            session.beginTransaction();
            Usuarios result = (Usuarios)session.createQuery("from Usuarios where EMAIL="+usuario.getEmail()+"and contrasena="+usuario.getContrasena()).uniqueResult();
            if(result!=null){
                return false;
            }
            else{
                //buscar roles de usuario
                System.out.println("usuario"+result.toString());
                //result.setRolesUsuarioses(traeRoles(result.getIdUsuario()));
                return true;
            }
            
        }
        catch(Exception e){
            return false;
        }
        finally {
            session.clear();
        }
}
public List<RolesUsuarios> traeRoles(Integer id){
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<RolesUsuarios> list= new ArrayList();
    try{
        session.beginTransaction();
        list=(List<RolesUsuarios>) getHibernateTemplate().find("from ROLES_USUARIOS where id_usuario="+id);
    }
    catch(Exception e){
        
    }
     finally {
            session.clear();
    }
    return list;
}
    
}
