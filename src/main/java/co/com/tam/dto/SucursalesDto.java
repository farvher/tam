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

public class SucursalesDto  {
    private Integer sucursalid;
    private String direccion;
    private String telefono;
    private String celular;
    private String correo;
    private Date creada;
    private Date modificada;
    private String latitud;
    private String longitud;
    private TiendasDto tiendaid;

    public SucursalesDto() {
    }

    public SucursalesDto(Integer sucursalid) {
        this.sucursalid = sucursalid;
    }

    public Integer getSucursalid() {
        return sucursalid;
    }

    public void setSucursalid(Integer sucursalid) {
        this.sucursalid = sucursalid;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public TiendasDto getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(TiendasDto tiendaid) {
        this.tiendaid = tiendaid;
    }

}
