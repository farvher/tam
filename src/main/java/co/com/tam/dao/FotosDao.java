/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import co.com.tam.domain.Fotos;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
@Transactional
public class FotosDao extends AbstractDao<Fotos> {

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FotosDao() {
        super(Fotos.class);
    }
    
}
