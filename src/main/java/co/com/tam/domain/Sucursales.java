/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "sucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s"),
    @NamedQuery(name = "Sucursales.findBySucursalid", query = "SELECT s FROM Sucursales s WHERE s.sucursalid = :sucursalid"),
    @NamedQuery(name = "Sucursales.findByDireccion", query = "SELECT s FROM Sucursales s WHERE s.direccion = :direccion"),
    @NamedQuery(name = "Sucursales.findByTelefono", query = "SELECT s FROM Sucursales s WHERE s.telefono = :telefono"),
    @NamedQuery(name = "Sucursales.findByCelular", query = "SELECT s FROM Sucursales s WHERE s.celular = :celular"),
    @NamedQuery(name = "Sucursales.findByCorreo", query = "SELECT s FROM Sucursales s WHERE s.correo = :correo"),
    @NamedQuery(name = "Sucursales.findByCreada", query = "SELECT s FROM Sucursales s WHERE s.creada = :creada"),
    @NamedQuery(name = "Sucursales.findByModificada", query = "SELECT s FROM Sucursales s WHERE s.modificada = :modificada"),
    @NamedQuery(name = "Sucursales.findByLatitud", query = "SELECT s FROM Sucursales s WHERE s.latitud = :latitud"),
    @NamedQuery(name = "Sucursales.findByLongitud", query = "SELECT s FROM Sucursales s WHERE s.longitud = :longitud")})
public class Sucursales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sucursalid")
    private Integer sucursalid;
    @Size(max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 20)
    @Column(name = "celular")
    private String celular;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    @Column(name = "creada")
    @Temporal(TemporalType.DATE)
    private Date creada;
    @Column(name = "modificada")
    @Temporal(TemporalType.DATE)
    private Date modificada;
    @Size(max = 50)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 50)
    @Column(name = "longitud")
    private String longitud;
    @JoinColumn(name = "tiendaid", referencedColumnName = "tiendaid")
    @ManyToOne
    private Tiendas tiendaid;

    public Sucursales() {
    }

    public Sucursales(Integer sucursalid) {
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

    public Tiendas getTiendaid() {
        return tiendaid;
    }

    public void setTiendaid(Tiendas tiendaid) {
        this.tiendaid = tiendaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sucursalid != null ? sucursalid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.sucursalid == null && other.sucursalid != null) || (this.sucursalid != null && !this.sucursalid.equals(other.sucursalid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Sucursales[ sucursalid=" + sucursalid + " ]";
    }
    
}
