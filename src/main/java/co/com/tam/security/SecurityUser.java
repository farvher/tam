/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.security;

import co.com.tam.domain.Roles;
import co.com.tam.domain.Usuarios;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author geotor
 */
public class SecurityUser extends Usuarios implements UserDetails {
    
    public SecurityUser(Usuarios user) {
        super(user);
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       String role =   this.getRolid().getNombrerol();
       return AuthorityUtils.commaSeparatedStringToAuthorityList(role);
    }
    
    @Override
    public String getPassword() {
        return super.getClave();
    }
    
    @Override
    public String getUsername() {
        return super.getCorreo();
    }
    
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    
    @Override
    public boolean isEnabled() {
        return true;
    }
    
}
