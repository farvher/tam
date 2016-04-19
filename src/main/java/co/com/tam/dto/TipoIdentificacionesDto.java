/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dto;

import java.util.List;

/**
 *
 * @author geotor
 */
public class TipoIdentificacionesDto  {
    private Integer tipoidentificacionid;
    private String tipoidentificacion;
    private List<UsuariosDto> usuariosList;

    public TipoIdentificacionesDto() {
    }

    public TipoIdentificacionesDto(Integer tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public Integer getTipoidentificacionid() {
        return tipoidentificacionid;
    }

    public void setTipoidentificacionid(Integer tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
    }

    public List<UsuariosDto> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosDto> usuariosList) {
        this.usuariosList = usuariosList;
    }
}
