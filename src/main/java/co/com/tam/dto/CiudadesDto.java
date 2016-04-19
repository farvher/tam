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
public class CiudadesDto {

    private Integer ciudadid;
    private String ciudad;
    private Integer paisid;
    private Boolean activa;
    private Integer regionid;
    private Boolean escapital;
    private List<UsuariosDto> usuariosList;

    public CiudadesDto() {
    }

    public CiudadesDto(Integer ciudadid) {
        this.ciudadid = ciudadid;
    }

    public Integer getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(Integer ciudadid) {
        this.ciudadid = ciudadid;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPaisid() {
        return paisid;
    }

    public void setPaisid(Integer paisid) {
        this.paisid = paisid;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Boolean getEscapital() {
        return escapital;
    }

    public void setEscapital(Boolean escapital) {
        this.escapital = escapital;
    }

    
    public List<UsuariosDto> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosDto> usuariosList) {
        this.usuariosList = usuariosList;
    }

    

}
