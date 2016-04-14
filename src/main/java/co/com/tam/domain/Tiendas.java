/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "tiendas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiendas.findAll", query = "SELECT t FROM Tiendas t"),
    @NamedQuery(name = "Tiendas.findByTiendaid", query = "SELECT t FROM Tiendas t WHERE t.tiendaid = :tiendaid"),
    @NamedQuery(name = "Tiendas.findByNombretienda", query = "SELECT t FROM Tiendas t WHERE t.nombretienda = :nombretienda"),
    @NamedQuery(name = "Tiendas.findByTitulotienda", query = "SELECT t FROM Tiendas t WHERE t.titulotienda = :titulotienda"),
    @NamedQuery(name = "Tiendas.findByUrllogo", query = "SELECT t FROM Tiendas t WHERE t.urllogo = :urllogo"),
    @NamedQuery(name = "Tiendas.findByEstilocss", query = "SELECT t FROM Tiendas t WHERE t.estilocss = :estilocss"),
    @NamedQuery(name = "Tiendas.findByTelatencioncliente", query = "SELECT t FROM Tiendas t WHERE t.telatencioncliente = :telatencioncliente"),
    @NamedQuery(name = "Tiendas.findByCorreocontactenos", query = "SELECT t FROM Tiendas t WHERE t.correocontactenos = :correocontactenos"),
    @NamedQuery(name = "Tiendas.findByUrlicon", query = "SELECT t FROM Tiendas t WHERE t.urlicon = :urlicon")})
public class Tiendas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tiendaid")
    private Integer tiendaid;
    @Size(max = 50)
    @Column(name = "nombretienda")
    private String nombretienda;
    @Size(max = 50)
    @Column(name = "titulotienda")
    private String titulotienda;
    @Size(max = 100)
    @Column(name = "urllogo")
    private String urllogo;
    @Size(max = 50)
    @Column(name = "estilocss")
    private String estilocss;
    @Size(max = 50)
    @Column(name = "telatencioncliente")
    private String telatencioncliente;
    @Size(max = 50)
    @Column(name = "correocontactenos")
    private String correocontactenos;
    @Lob
    @Size(max = 65535)
    @Column(name = "quienessomos")
    private String quienessomos;
    @Size(max = 50)
    @Column(name = "urlicon")
    private String urlicon;
    @OneToMany(mappedBy = "tiendaid")
    private List<Sucursales> sucursalesList;
    @OneToMany(mappedBy = "tiendaid")
    private List<UsuariosTiendas> usuariosTiendasList;
    @OneToMany(mappedBy = "tiendaid")
    private List<Productos> productosList;

    public Tiendas() {
    }

    public Tiendas(Integer tiendaid) {
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

    @XmlTransient
    public List<Sucursales> getSucursalesList() {
        return sucursalesList;
    }

    public void setSucursalesList(List<Sucursales> sucursalesList) {
        this.sucursalesList = sucursalesList;
    }

    @XmlTransient
    public List<UsuariosTiendas> getUsuariosTiendasList() {
        return usuariosTiendasList;
    }

    public void setUsuariosTiendasList(List<UsuariosTiendas> usuariosTiendasList) {
        this.usuariosTiendasList = usuariosTiendasList;
    }

    @XmlTransient
    public List<Productos> getProductosList() {
        return productosList;
    }

    public void setProductosList(List<Productos> productosList) {
        this.productosList = productosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tiendaid != null ? tiendaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiendas)) {
            return false;
        }
        Tiendas other = (Tiendas) object;
        if ((this.tiendaid == null && other.tiendaid != null) || (this.tiendaid != null && !this.tiendaid.equals(other.tiendaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Tiendas[ tiendaid=" + tiendaid + " ]";
    }
    
}
