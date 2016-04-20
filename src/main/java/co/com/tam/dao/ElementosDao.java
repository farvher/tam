/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import co.com.tam.domain.Elementos;
import co.com.tam.domain.Productos;
import java.util.List;

/**
 *
 * @author geotor
 */
public interface ElementosDao {

    public void crearElemento(Elementos p);

    public void eliminarElemento(Elementos e);

    public void eliminarElementosDelProducto(Productos p);

    public List<Elementos> getElementos(Productos p);

    public Elementos getElemento(int id);

}
