/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dto;

/**
 *
 * @author geotor
 */
public class UsuariosTiendasDto  {
    private Integer id;
    private UsuariosDto usuarioid;
    private TiendasDto tiendaid;

    public UsuariosTiendasDto() {
    }

    public UsuariosTiendasDto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UsuariosDto getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(UsuariosDto usuarioid) {
        this.usuarioid = usuarioid;
    }

    public TiendasDto getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(TiendasDto tiendaid) {
        this.tiendaid = tiendaid;
    }
}
