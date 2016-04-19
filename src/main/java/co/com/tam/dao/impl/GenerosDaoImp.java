/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao.impl;

import co.com.tam.dao.AbstractDao;
import co.com.tam.dao.GenerosDao;
import co.com.tam.domain.Generos;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
@Transactional
@Repository
public class GenerosDaoImp extends AbstractDao<Generos> implements GenerosDao{

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GenerosDaoImp() {
        super(Generos.class);
    }
    
}
