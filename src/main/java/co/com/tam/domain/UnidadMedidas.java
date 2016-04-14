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
@Table(name = "unidad_medidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadMedidas.findAll", query = "SELECT u FROM UnidadMedidas u"),
    @NamedQuery(name = "UnidadMedidas.findByUnidadmedidaid", query = "SELECT u FROM UnidadMedidas u WHERE u.unidadmedidaid = :unidadmedidaid"),
    @NamedQuery(name = "UnidadMedidas.findByUnidadmedida", query = "SELECT u FROM UnidadMedidas u WHERE u.unidadmedida = :unidadmedida")})
public class UnidadMedidas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "unidadmedidaid")
    private Integer unidadmedidaid;
    @Size(max = 20)
    @Column(name = "unidadmedida")
    private String unidadmedida;
    @OneToMany(mappedBy = "unidadmedidaid")
    private List<Productos> productosList;

    public UnidadMedidas() {
    }

    public UnidadMedidas(Integer unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public Integer getUnidadmedidaid() {
        return unidadmedidaid;
    }

    public void setUnidadmedidaid(Integer unidadmedidaid) {
        this.unidadmedidaid = unidadmedidaid;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
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
        hash += (unidadmedidaid != null ? unidadmedidaid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadMedidas)) {
            return false;
        }
        UnidadMedidas other = (UnidadMedidas) object;
        if ((this.unidadmedidaid == null && other.unidadmedidaid != null) || (this.unidadmedidaid != null && !this.unidadmedidaid.equals(other.unidadmedidaid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.UnidadMedidas[ unidadmedidaid=" + unidadmedidaid + " ]";
    }
    
}
