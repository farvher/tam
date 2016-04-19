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
public class MarcasDto  {
    private Integer marcaid;
    private String marca;
    private List<ProductosDto> productosList;

    public MarcasDto() {
    }

    public MarcasDto(Integer marcaid) {
        this.marcaid = marcaid;
    }

    public Integer getMarcaid() {
        return marcaid;
    }

    public void setMarcaid(Integer marcaid) {
        this.marcaid = marcaid;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<ProductosDto> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<ProductosDto> productosList) {
        this.productosList = productosList;
    }

}
