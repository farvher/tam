/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p"),
    @NamedQuery(name = "Productos.findByProductoid", query = "SELECT p FROM Productos p WHERE p.productoid = :productoid"),
    @NamedQuery(name = "Productos.findByCreado", query = "SELECT p FROM Productos p WHERE p.creado = :creado"),
    @NamedQuery(name = "Productos.findByModificado", query = "SELECT p FROM Productos p WHERE p.modificado = :modificado"),
    @NamedQuery(name = "Productos.findByNrofotos", query = "SELECT p FROM Productos p WHERE p.nrofotos = :nrofotos"),
    @NamedQuery(name = "Productos.findByPreciounidad", query = "SELECT p FROM Productos p WHERE p.preciounidad = :preciounidad"),
    @NamedQuery(name = "Productos.findByDiponible", query = "SELECT p FROM Productos p WHERE p.diponible = :diponible"),
    @NamedQuery(name = "Productos.findByUrlcanonical", query = "SELECT p FROM Productos p WHERE p.urlcanonical = :urlcanonical"),
    @NamedQuery(name = "Productos.findByDestacado", query = "SELECT p FROM Productos p WHERE p.destacado = :destacado"),
    @NamedQuery(name = "Productos.findByUrlvideo", query = "SELECT p FROM Productos p WHERE p.urlvideo = :urlvideo"),
    @NamedQuery(name = "Productos.findByCondescuento", query = "SELECT p FROM Productos p WHERE p.condescuento = :condescuento"),
    @NamedQuery(name = "Productos.findByDescuento", query = "SELECT p FROM Productos p WHERE p.descuento = :descuento"),
    @NamedQuery(name = "Productos.findByCantidadelementos", query = "SELECT p FROM Productos p WHERE p.cantidadelementos = :cantidadelementos")})
public class Productos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "productoid")
    private Integer productoid;
    @Column(name = "creado")
    @Temporal(TemporalType.DATE)
    private Date creado;
    @Column(name = "modificado")
    @Temporal(TemporalType.DATE)
    private Date modificado;
    @Column(name = "nrofotos")
    private Integer nrofotos;
    @Column(name = "preciounidad")
    private BigInteger preciounidad;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "diponible")
    private Short diponible;
    @Size(max = 100)
    @Column(name = "urlcanonical")
    private String urlcanonical;
    @Column(name = "destacado")
    private Short destacado;
    @Size(max = 100)
    @Column(name = "urlvideo")
    private String urlvideo;
    @Column(name = "condescuento")
    private Short condescuento;
    @Column(name = "descuento")
    private Integer descuento;
    @Lob
    @Size(max = 65535)
    @Column(name = "DetalleProductoHtml")
    private String detalleProductoHtml;
    @Column(name = "cantidadelementos")
    private Integer cantidadelementos;
    @OneToMany(mappedBy = "productoid")
    private List<Elementos> elementosList;
    @JoinColumn(name = "estadoid", referencedColumnName = "estadoid")
    @ManyToOne
    private Estados estadoid;
    @JoinColumn(name = "unidadmedidaid", referencedColumnName = "unidadmedidaid")
    @ManyToOne
    private UnidadMedidas unidadmedidaid;
    @JoinColumn(name = "tiendaid", referencedColumnName = "tiendaid")
    @ManyToOne
    private Tiendas tiendaid;
    @JoinColumn(name = "marcaid", referencedColumnName = "marcaid")
    @ManyToOne
    private Marcas marcaid;
    @OneToMany(mappedBy = "productoid")
    private List<Fotos> fotosList;

    public Productos() {
    }

    public Productos(Integer productoid) {
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

    @XmlTransient
    public List<Elementos> getElementosList() {
        return elementosList;
    }

    public void setElementosList(List<Elementos> elementosList) {
        this.elementosList = elementosList;
    }

    public Estados getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Estados estadoid) {
        this.estadoid = estadoid;
    }

    public UnidadMedidas getUnidadmedidaid() {
        return unidadmedidaid;
    }

    public void setUnidadmedidaid(UnidadMedidas unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public Tiendas getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(Tiendas tiendaid) {
        this.tiendaid = tiendaid;
    }

    public Marcas getMarcaid() {
        return marcaid;
    }

    public void setMarcaid(Marcas marcaid) {
        this.marcaid = marcaid;
    }

    @XmlTransient
    public List<Fotos> getFotosList() {
        return fotosList;
    }

    public void setFotosList(List<Fotos> fotosList) {
        this.fotosList = fotosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productoid != null ? productoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.productoid == null && other.productoid != null) || (this.productoid != null && !this.productoid.equals(other.productoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Productos[ productoid=" + productoid + " ]";
    }
    
}
