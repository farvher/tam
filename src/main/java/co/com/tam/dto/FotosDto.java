/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dto;

import java.util.Date;

/**
 *
 * @author geotor
 */

public class FotosDto  {
    private Integer fotoid;
    private String fotonombre;
    private String fototitle;
    private String fotourl;
    private Date creada;
    private Date modificada;
    private String ext;
    private Integer posicion;
    private String comentario;
    private ProductosDto productoid;

    public FotosDto() {
    }

    public FotosDto(Integer fotoid) {
        this.fotoid = fotoid;
    }

    public Integer getFotoid() {
        return fotoid;
    }

    public void setFotoid(Integer fotoid) {
        this.fotoid = fotoid;
    }

    public String getFotonombre() {
        return fotonombre;
    }

    public void setFotonombre(String fotonombre) {
        this.fotonombre = fotonombre;
    }

    public String getFototitle() {
        return fototitle;
    }

    public void setFototitle(String fototitle) {
        this.fototitle = fototitle;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
    }

    public Date getCreada() {
        return creada;
    }

    public void setCreada(Date creada) {
        this.creada = creada;
    }

    public Date getModificada() {
        return modificada;
    }

    public void setModificada(Date modificada) {
        this.modificada = modificada;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public ProductosDto getProductoid() {
        return productoid;
    }

    public void setProductoid(ProductosDto productoid) {
        this.productoid = productoid;
    }

    
}
