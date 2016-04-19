/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao.impl;

import co.com.tam.dao.AbstractDao;
import co.com.tam.dao.ElementosDao;
import co.com.tam.domain.Elementos;
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
public class ElementosDaoImp extends AbstractDao<Elementos>  implements ElementosDao{

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ElementosDaoImp() {
        super(Elementos.class);
    }
    
}
