/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dao;

import co.com.tam.domain.Usuarios;
import java.util.List;

/**
 *
 * @author geotor
 */
public interface UsuariosDao {

    public List<Usuarios> getUsuario(String cedula);
    public List<Usuarios> getUsuarios();
    public Usuarios getUser(String email);

}
