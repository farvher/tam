/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.test.dao;

import co.com.tam.dao.UsuariosDao;
import co.com.tam.domain.Usuarios;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author geotor
 */
public class UsuariosJPATest {
    
    @Autowired
    UsuariosDao userdaDao;
    
    
    @Test
    public void crearUsuario(){
        
         Usuarios user = new Usuarios();
        user.setApellidos("sanmiguel");
        user.setNombres("Farith");
        
        user.setCedula("1092352729");
        userdaDao.create(user);
        assertEquals(user, user);
        
    
    }
    
    
}
