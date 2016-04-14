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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "usuarios_tiendas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuariosTiendas.findAll", query = "SELECT u FROM UsuariosTiendas u"),
    @NamedQuery(name = "UsuariosTiendas.findById", query = "SELECT u FROM UsuariosTiendas u WHERE u.id = :id")})
public class UsuariosTiendas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "usuarioid", referencedColumnName = "usuarioid")
    @ManyToOne
    private Usuarios usuarioid;
    @JoinColumn(name = "tiendaid", referencedColumnName = "tiendaid")
    @ManyToOne
    private Tiendas tiendaid;

    public UsuariosTiendas() {
    }

    public UsuariosTiendas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuarios getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuarios usuarioid) {
        this.usuarioid = usuarioid;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuariosTiendas)) {
            return false;
        }
        UsuariosTiendas other = (UsuariosTiendas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.UsuariosTiendas[ id=" + id + " ]";
    }
    
}
