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

public class GenerosDto {
    private Integer generoid;
    private String genero;
    private List<UsuariosDto> usuariosList;

    public GenerosDto() {
    }

    public GenerosDto(Integer generoid) {
        this.generoid = generoid;
    }

    public Integer getGeneroid() {
        return generoid;
    }

    public void setGeneroid(Integer generoid) {
        this.generoid = generoid;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<UsuariosDto> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosDto> usuariosList) {
        this.usuariosList = usuariosList;
    }
}
