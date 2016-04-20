/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao.impl;

import co.com.tam.dao.AbstractDao;
import co.com.tam.dao.ElementosDao;
import co.com.tam.domain.Elementos;
import co.com.tam.domain.Productos;
import java.util.List;
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

    @Override
    public void crearElemento(Elementos e) {
       create(e);
    }

    @Override
    public void eliminarElemento(Elementos e) {
        remove(e);
    }

    @Override
    public void eliminarElementosDelProducto(Productos p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Elementos> getElementos(Productos p) {
     return  findByFieldsIsEqual("productoid", p.getProductoid());
    }

    @Override
    public Elementos getElemento(int id) {
        return find(id);
    }
    
}
