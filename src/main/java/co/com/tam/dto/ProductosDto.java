/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 *
 * @author geotor
 */
public class ProductosDto {
    private Integer productoid;
    private Date creado;
    private Date modificado;
    private Integer nrofotos;
    private BigInteger preciounidad;
    private String descripcion;
    private Short diponible;
    private String urlcanonical;
    private Short destacado;
    private String urlvideo;
    private Short condescuento;
    private Integer descuento;
    private String detalleProductoHtml;
    private Integer cantidadelementos;
    private List<ElementosDto> elementosList;
    private EstadosDto estadoid;
    private UnidadMedidasDto unidadmedidaid;
    private TiendasDto tiendaid;
    private MarcasDto marcaid;
    private List<FotosDto> fotosList;

    public ProductosDto() {
    }

    public ProductosDto(Integer productoid) {
        this.productoid = productoid;
    }

    public Integer getProductoid() {
        return productoid;
    }

    public void setProductoid(Integer productoid) {
        this.productoid = productoid;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
    }

    public Integer getNrofotos() {
        return nrofotos;
    }

    public void setNrofotos(Integer nrofotos) {
        this.nrofotos = nrofotos;
    }

    public BigInteger getPreciounidad() {
        return preciounidad;
    }

    public void setPreciounidad(BigInteger preciounidad) {
        this.preciounidad = preciounidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Short getDiponible() {
        return diponible;
    }

    public void setDiponible(Short diponible) {
        this.diponible = diponible;
    }

    public String getUrlcanonical() {
        return urlcanonical;
    }

    public void setUrlcanonical(String urlcanonical) {
        this.urlcanonical = urlcanonical;
    }

    public Short getDestacado() {
        return destacado;
    }

    public void setDestacado(Short destacado) {
        this.destacado = destacado;
    }

    public String getUrlvideo() {
        return urlvideo;
    }

    public void setUrlvideo(String urlvideo) {
        this.urlvideo = urlvideo;
    }

    public Short getCondescuento() {
        return condescuento;
    }

    public void setCondescuento(Short condescuento) {
        this.condescuento = condescuento;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public String getDetalleProductoHtml() {
        return detalleProductoHtml;
    }

    public void setDetalleProductoHtml(String detalleProductoHtml) {
        this.detalleProductoHtml = detalleProductoHtml;
    }

    public Integer getCantidadelementos() {
        return cantidadelementos;
    }

    public void setCantidadelementos(Integer cantidadelementos) {
        this.cantidadelementos = cantidadelementos;
    }

    public List<ElementosDto> getElementosList() {
        return elementosList;
    }

    public void setElementosList(List<ElementosDto> elementosList) {
        this.elementosList = elementosList;
    }

    public EstadosDto getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(EstadosDto estadoid) {
        this.estadoid = estadoid;
    }

    public UnidadMedidasDto getUnidadmedidaid() {
        return unidadmedidaid;
    }

    public void setUnidadmedidaid(UnidadMedidasDto unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public TiendasDto getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(TiendasDto tiendaid) {
        this.tiendaid = tiendaid;
    }

    public MarcasDto getMarcaid() {
        return marcaid;
    }

    public void setMarcaid(MarcasDto marcaid) {
        this.marcaid = marcaid;
    }

    public List<FotosDto> getFotosList() {
        return fotosList;
    }

    public void setFotosList(List<FotosDto> fotosList) {
        this.fotosList = fotosList;
    }

}
