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
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author Mary
 */
@Named
public class UsuarioDao  implements IUsuarioDao, Serializable{
    private static final long serialVersionUID = 1L;
    @Inject  
    private SessionFactory sessionFactory;  
    public SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }
   
    @Override 
    public void addUser(Usuarios usuario) {
//        getHibernateTemplate().saveOrUpdate(usuario);
    }

    public ArrayList<Usuarios> buscarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override 
    public boolean validaContrasena(Usuarios usuario){
        
        try{
            
            Session session = getSessionFactory().getCurrentSession(); 
            Transaction trans = session.beginTransaction();
            
            //session.save(usuario);
            
            Usuarios result = (Usuarios)session.createQuery("from Usuarios where EMAIL="+usuario.getEmail()+"and contrasena="+usuario.getContrasena()).uniqueResult();
            trans.commit();
            sessionFactory.close();
            if(result==null){
                System.out.println("no encontrado:"+usuario.getEmail());
                return false;
            }
            else{
                //buscar roles de usuario
                System.out.println("usuario"+result.getNombre()+result.getApPaterno()+result.getApMaterno());
                //result.setRolesUsuarioses(traeRoles(result.getIdUsuario()));
                return true;
            }
           
        }
        catch(Exception e){
            
            return false;
        }
        finally {
            
        }
}
public List<RolesUsuarios> traeRoles(Integer id){
    Session session = HibernateUtil.getSessionFactory().openSession();
    List<RolesUsuarios> list= new ArrayList();
    try{
        session.beginTransaction();
//        list=(List<RolesUsuarios>) getHibernateTemplate().find("from ROLES_USUARIOS where id_usuario="+id);
    }
    catch(Exception e){
        
    }
     finally {
            session.clear();
    }
    return list;
}
    
}
