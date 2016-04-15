/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import java.util.List;

/**
 *
 * @author geotor
 */
public interface RepositoryDao<T> {

    public void create(T entity);

    public void update(T entity);

    public void remove(T entity);

    public T find(Object id);

    public List<T> findAll();

    public int count();

}
