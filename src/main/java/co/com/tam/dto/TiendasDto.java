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
public class TiendasDto  {
    private Integer tiendaid;
    private String nombretienda;
    private String titulotienda;
    private String urllogo;
    private String estilocss;
    private String telatencioncliente;
    private String correocontactenos;
    private String quienessomos;
    private String urlicon;
    private List<SucursalesDto> sucursalesList;
    private List<UsuariosTiendasDto> usuariosTiendasList;
    private List<ProductosDto> productosList;

    public TiendasDto() {
    }

    public TiendasDto(Integer tiendaid) {
        this.tiendaid = tiendaid;
    }

    public Integer getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(Integer tiendaid) {
        this.tiendaid = tiendaid;
    }

    public String getNombretienda() {
        return nombretienda;
    }

    public void setNombretienda(String nombretienda) {
        this.nombretienda = nombretienda;
    }

    public String getTitulotienda() {
        return titulotienda;
    }

    public void setTitulotienda(String titulotienda) {
        this.titulotienda = titulotienda;
    }

    public String getUrllogo() {
        return urllogo;
    }

    public void setUrllogo(String urllogo) {
        this.urllogo = urllogo;
    }

    public String getEstilocss() {
        return estilocss;
    }

    public void setEstilocss(String estilocss) {
        this.estilocss = estilocss;
    }

    public String getTelatencioncliente() {
        return telatencioncliente;
    }

    public void setTelatencioncliente(String telatencioncliente) {
        this.telatencioncliente = telatencioncliente;
    }

    public String getCorreocontactenos() {
        return correocontactenos;
    }

    public void setCorreocontactenos(String correocontactenos) {
        this.correocontactenos = correocontactenos;
    }

    public String getQuienessomos() {
        return quienessomos;
    }

    public void setQuienessomos(String quienessomos) {
        this.quienessomos = quienessomos;
    }

    public String getUrlicon() {
        return urlicon;
    }

    public void setUrlicon(String urlicon) {
        this.urlicon = urlicon;
    }

    public List<SucursalesDto> getSucursalesList() {
        return sucursalesList;
    }

    public void setSucursalesList(List<SucursalesDto> sucursalesList) {
        this.sucursalesList = sucursalesList;
    }

    public List<UsuariosTiendasDto> getUsuariosTiendasList() {
        return usuariosTiendasList;
    }

    public void setUsuariosTiendasList(List<UsuariosTiendasDto> usuariosTiendasList) {
        this.usuariosTiendasList = usuariosTiendasList;
    }

    public List<ProductosDto> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<ProductosDto> productosList) {
        this.productosList = productosList;
    }
}
