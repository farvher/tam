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
@Table(name = "marcas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcas.findAll", query = "SELECT m FROM Marcas m"),
    @NamedQuery(name = "Marcas.findByMarcaid", query = "SELECT m FROM Marcas m WHERE m.marcaid = :marcaid"),
    @NamedQuery(name = "Marcas.findByMarca", query = "SELECT m FROM Marcas m WHERE m.marca = :marca")})
public class Marcas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "marcaid")
    private Integer marcaid;
    @Size(max = 50)
    @Column(name = "marca")
    private String marca;
    @OneToMany(mappedBy = "marcaid")
    private List<Productos> productosList;

    public Marcas() {
    }

    public Marcas(Integer marcaid) {
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
        hash += (marcaid != null ? marcaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcas)) {
            return false;
        }
        Marcas other = (Marcas) object;
        if ((this.marcaid == null && other.marcaid != null) || (this.marcaid != null && !this.marcaid.equals(other.marcaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Marcas[ marcaid=" + marcaid + " ]";
    }
    
}
