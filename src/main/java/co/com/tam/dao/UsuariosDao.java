/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import co.com.tam.domain.Usuarios;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
@Repository
@Transactional
public class UsuariosDao extends AbstractDao<Usuarios> {
    
//    @PersistenceUnit(unitName = "tamjndi")
    @PersistenceContext
    private EntityManager em;
   

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosDao() {
        super(Usuarios.class);
    }
    
}
