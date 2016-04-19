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

public class EstadosDto {
    private Integer estadoid;
    private String estado;
    private List<ProductosDto> productosList;
    private List<UsuariosDto> usuariosList;

    public EstadosDto() {
    }

    public EstadosDto(Integer estadoid) {
        this.estadoid = estadoid;
    }

    public Integer getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Integer estadoid) {
        this.estadoid = estadoid;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ProductosDto> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<ProductosDto> productosList) {
        this.productosList = productosList;
    }

    public List<UsuariosDto> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<UsuariosDto> usuariosList) {
        this.usuariosList = usuariosList;
    }
    
}
