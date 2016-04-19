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

public class ElementosDto {
    private Integer elementoid;
    private String elemento;
    private String descripcion;
    private ProductosDto productoid;

    public ElementosDto() {
    }

    public ElementosDto(Integer elementoid) {
        this.elementoid = elementoid;
    }

    public Integer getElementoid() {
        return elementoid;
    }

    public void setElementoid(Integer elementoid) {
        this.elementoid = elementoid;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ProductosDto getProductoid() {
        return productoid;
    }

    public void setProductoid(ProductosDto productoid) {
        this.productoid = productoid;
    }
    
}
