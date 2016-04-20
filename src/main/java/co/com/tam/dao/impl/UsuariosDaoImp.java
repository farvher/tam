/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao.impl;

import co.com.tam.dao.AbstractDao;
import co.com.tam.dao.UsuariosDao;
import co.com.tam.domain.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
@Repository
@Transactional
public class UsuariosDaoImp extends AbstractDao<Usuarios> implements UsuariosDao{


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosDaoImp() {
        super(Usuarios.class);
    }

    @Override
    public List<Usuarios> getUsuario(String cedula) {
        return findByFieldsIsEqual("cedula", cedula);
        
    }
    
    @Override
    public List<Usuarios> getUsuarios() {
        return findAll();
        
    }
    
    
    
    

}
