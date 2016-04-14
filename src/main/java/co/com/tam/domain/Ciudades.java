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
@Table(name = "ciudades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudades.findAll", query = "SELECT c FROM Ciudades c"),
    @NamedQuery(name = "Ciudades.findByCiudadid", query = "SELECT c FROM Ciudades c WHERE c.ciudadid = :ciudadid"),
    @NamedQuery(name = "Ciudades.findByCiudad", query = "SELECT c FROM Ciudades c WHERE c.ciudad = :ciudad"),
    @NamedQuery(name = "Ciudades.findByPaisid", query = "SELECT c FROM Ciudades c WHERE c.paisid = :paisid"),
    @NamedQuery(name = "Ciudades.findByActiva", query = "SELECT c FROM Ciudades c WHERE c.activa = :activa"),
    @NamedQuery(name = "Ciudades.findByRegionid", query = "SELECT c FROM Ciudades c WHERE c.regionid = :regionid"),
    @NamedQuery(name = "Ciudades.findByEscapital", query = "SELECT c FROM Ciudades c WHERE c.escapital = :escapital")})
public class Ciudades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ciudadid")
    private Integer ciudadid;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "paisid")
    private Integer paisid;
    @Column(name = "activa")
    private Boolean activa;
    @Column(name = "regionid")
    private Integer regionid;
    @Column(name = "escapital")
    private Boolean escapital;
    @OneToMany(mappedBy = "ciudadResidencia")
    private List<Usuarios> usuariosList;

    public Ciudades() {
    }

    public Ciudades(Integer ciudadid) {
        this.ciudadid = ciudadid;
    }

    public Integer getCiudadid() {
        return ciudadid;
    }

    public void setCiudadid(Integer ciudadid) {
        this.ciudadid = ciudadid;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPaisid() {
        return paisid;
    }

    public void setPaisid(Integer paisid) {
        this.paisid = paisid;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public Boolean getEscapital() {
        return escapital;
    }

    public void setEscapital(Boolean escapital) {
        this.escapital = escapital;
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
        hash += (ciudadid != null ? ciudadid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudades)) {
            return false;
        }
        Ciudades other = (Ciudades) object;
        if ((this.ciudadid == null && other.ciudadid != null) || (this.ciudadid != null && !this.ciudadid.equals(other.ciudadid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Ciudades[ ciudadid=" + ciudadid + " ]";
    }
    
}
