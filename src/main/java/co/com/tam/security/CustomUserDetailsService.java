/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.security;

import co.com.tam.dao.RolesDao;
import co.com.tam.dao.UsuariosDao;
import co.com.tam.domain.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author geotor
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private final UsuariosDao userDao;

    @Autowired
    public CustomUserDetailsService(UsuariosDao userdao) {
        this.userDao = userdao;

    }

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuarios user = userDao.getUser(email);
        if (user == null) {
            throw new UsernameNotFoundException(email + " - > USUARIO NO ENCONTRADO");
        }
        return new SecurityUser(user);
    }

}
