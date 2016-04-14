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
@Table(name = "tipo_identificaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoIdentificaciones.findAll", query = "SELECT t FROM TipoIdentificaciones t"),
    @NamedQuery(name = "TipoIdentificaciones.findByTipoidentificacionid", query = "SELECT t FROM TipoIdentificaciones t WHERE t.tipoidentificacionid = :tipoidentificacionid"),
    @NamedQuery(name = "TipoIdentificaciones.findByTipoidentificacion", query = "SELECT t FROM TipoIdentificaciones t WHERE t.tipoidentificacion = :tipoidentificacion")})
public class TipoIdentificaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipoidentificacionid")
    private Integer tipoidentificacionid;
    @Size(max = 20)
    @Column(name = "tipoidentificacion")
    private String tipoidentificacion;
    @OneToMany(mappedBy = "tipoidentificacionid")
    private List<Usuarios> usuariosList;

    public TipoIdentificaciones() {
    }

    public TipoIdentificaciones(Integer tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public Integer getTipoidentificacionid() {
        return tipoidentificacionid;
    }

    public void setTipoidentificacionid(Integer tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public String getTipoidentificacion() {
        return tipoidentificacion;
    }

    public void setTipoidentificacion(String tipoidentificacion) {
        this.tipoidentificacion = tipoidentificacion;
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
        hash += (tipoidentificacionid != null ? tipoidentificacionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoIdentificaciones)) {
            return false;
        }
        TipoIdentificaciones other = (TipoIdentificaciones) object;
        if ((this.tipoidentificacionid == null && other.tipoidentificacionid != null) || (this.tipoidentificacionid != null && !this.tipoidentificacionid.equals(other.tipoidentificacionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.TipoIdentificaciones[ tipoidentificacionid=" + tipoidentificacionid + " ]";
    }
    
}
