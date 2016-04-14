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
@Table(name = "generos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Generos.findAll", query = "SELECT g FROM Generos g"),
    @NamedQuery(name = "Generos.findByGeneroid", query = "SELECT g FROM Generos g WHERE g.generoid = :generoid"),
    @NamedQuery(name = "Generos.findByGenero", query = "SELECT g FROM Generos g WHERE g.genero = :genero")})
public class Generos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "generoid")
    private Integer generoid;
    @Size(max = 20)
    @Column(name = "genero")
    private String genero;
    @OneToMany(mappedBy = "generoid")
    private List<Usuarios> usuariosList;

    public Generos() {
    }

    public Generos(Integer generoid) {
        this.generoid = generoid;
    }

    public Integer getGeneroid() {
        return generoid;
    }

    public void setGeneroid(Integer generoid) {
        this.generoid = generoid;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (generoid != null ? generoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Generos)) {
            return false;
        }
        Generos other = (Generos) object;
        if ((this.generoid == null && other.generoid != null) || (this.generoid != null && !this.generoid.equals(other.generoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Generos[ generoid=" + generoid + " ]";
    }
    
}
