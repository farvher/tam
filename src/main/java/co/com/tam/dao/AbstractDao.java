/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
public abstract class AbstractDao<T> {

    private Class<T> entityClass;

    @PersistenceUnit
    public EntityManagerFactory emf;

    @PersistenceContext
    public EntityManager em;

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void create(T entity) {
        getEntityManager().persist(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void edit(T entity) {
        getEntityManager().merge(entity);
    }

    public void remove(T entity) {
        getEntityManager().remove(getEntityManager().merge(entity));
    }

    public void remove(final Long id) {
        Object entity = getEntityManager().find(entityClass, id);
        getEntityManager().remove(entity);
    }

    @Transactional(readOnly = true)
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    @Transactional(readOnly = true)
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    @Transactional(readOnly = true)
    public List<T> findRange(int[] range) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(range[1] - range[0] + 1);
        q.setFirstResult(range[0]);
        return q.getResultList();
    }

    @Transactional(readOnly = true)
    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }

    @Transactional
    public void reLoad(T entity) {
        this.getEntityManager().refresh(entity);
    }

    @Transactional(readOnly = true)
    public List<T> findByFieldsIsNull(String field) {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        cq.where(root.get(field).isNull());
        return getEntityManager().createQuery(cq).getResultList();
    }

    @Transactional(readOnly = true)
    public List<T> findByFieldsIsEqual(String field, Object value) {
        CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        Root<T> root = cq.from(entityClass);
        cq.select(root);
        cq.where(getEntityManager().getCriteriaBuilder().equal(root.get(field), value));
        return getEntityManager().createQuery(cq).getResultList();
    }

}
