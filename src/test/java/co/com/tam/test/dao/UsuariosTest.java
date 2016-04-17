/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.test.dao;

import co.com.tam.dao.UsuariosDao;
import co.com.tam.domain.Fotos;
import co.com.tam.domain.Productos;
import co.com.tam.domain.Tiendas;
import co.com.tam.domain.Usuarios;
import co.com.tam.util.HU;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuariosTest {

    
   @Ignore
    @Test
    @Transactional
    public void aCreateUser() {
        Usuarios user = new Usuarios();
        user.setApellidos("sanmiguel");
        user.setNombres("Farith");
        user.setCedula("1092352729");
        UsuariosDao dao = new UsuariosDao();
        dao.create(user);
        assertEquals(user, user);
    }
    

}
