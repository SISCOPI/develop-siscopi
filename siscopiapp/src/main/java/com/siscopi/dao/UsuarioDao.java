/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siscopi.dao;

import com.siscopi.beans.negocio.RolesUsuarios;
import com.siscopi.beans.negocio.Usuarios;
import com.siscopi.util.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Query;


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
    @Autowired  
    private SessionFactory sessionFactory;  
    
   
    public SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
    public void setSessionFactory(SessionFactory sessionFactory) {  
        this.sessionFactory = sessionFactory;  
    }
    public UsuarioDao (){

    }
   
    @Override 
    public void addUser(Usuarios usuario) {
//        getHibernateTemplate().saveOrUpdate(usuario);
    }

    public ArrayList<Usuarios> buscarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override 
    public Usuarios validaContrasena(Usuarios usuario){
        
        try{
            
            Session session = HibernateUtil.getSessionFactory().openSession(); 
            
            
            //session.save(usuario);
            String query="from Usuarios where EMAIL=? and CONTRASENA=?";
            Query select=session.createQuery(query);
            select.setParameter(0, usuario.getEmail());
            select.setParameter(1, usuario.getContrasena());
            Usuarios result = (Usuarios)select.uniqueResult();
            
            
            if(result==null){
                System.out.println("no encontrado:"+usuario.getEmail());
                return result;
            }
            else{
                //buscar roles de usuario
                System.out.println("usuario"+result.getNombre()+result.getApPaterno()+result.getApMaterno());
                //result.setRolesUsuarioses(traeRoles(result.getIdUsuario()));
                return result;
            }
           
        }
        catch(HibernateException exception){
            System.out.println("Problem creating session factory"+exception.getMessage());
            
            return null;
        }
        catch(Exception e){
            System.out.println("Problem creating session factory"+e.getMessage());
            return null;
        }
        finally {
            
        }
}
public List<RolesUsuarios> traeRoles(Integer id){
    //Session session = HibernateUtil.getSessionFactory().openSession();
    List<RolesUsuarios> list= new ArrayList();
//    try{
//        session.beginTransaction();
////        list=(List<RolesUsuarios>) getHibernateTemplate().find("from ROLES_USUARIOS where id_usuario="+id);
//    }
//    catch(Exception e){
//        
//    }
//     finally {
//            session.clear();
//    }
    return list;
}
    
}
