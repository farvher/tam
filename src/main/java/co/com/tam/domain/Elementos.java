/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "elementos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Elementos.findAll", query = "SELECT e FROM Elementos e"),
    @NamedQuery(name = "Elementos.findByElementoid", query = "SELECT e FROM Elementos e WHERE e.elementoid = :elementoid"),
    @NamedQuery(name = "Elementos.findByElemento", query = "SELECT e FROM Elementos e WHERE e.elemento = :elemento")})
public class Elementos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "elementoid")
    private Integer elementoid;
    @Size(max = 50)
    @Column(name = "elemento")
    private String elemento;
    @Lob
    @Size(max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "productoid", referencedColumnName = "productoid")
    @ManyToOne
    private Productos productoid;

    public Elementos() {
    }

    public Elementos(Integer elementoid) {
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

    public Productos getProductoid() {
        return productoid;
    }

    public void setProductoid(Productos productoid) {
        this.productoid = productoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (elementoid != null ? elementoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Elementos)) {
            return false;
        }
        Elementos other = (Elementos) object;
        if ((this.elementoid == null && other.elementoid != null) || (this.elementoid != null && !this.elementoid.equals(other.elementoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Elementos[ elementoid=" + elementoid + " ]";
    }
    
}
