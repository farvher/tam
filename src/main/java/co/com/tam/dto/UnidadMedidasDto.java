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
public class UnidadMedidasDto  {
    private Integer unidadmedidaid;
    private String unidadmedida;
    private List<ProductosDto> productosList;

    public UnidadMedidasDto() {
    }

    public UnidadMedidasDto(Integer unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public Integer getUnidadmedidaid() {
        return unidadmedidaid;
    }

    public void setUnidadmedidaid(Integer unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public List<ProductosDto> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<ProductosDto> productosList) {
        this.productosList = productosList;
    }
    
}
