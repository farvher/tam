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
@Table(name = "fotos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fotos.findAll", query = "SELECT f FROM Fotos f"),
    @NamedQuery(name = "Fotos.findByFotoid", query = "SELECT f FROM Fotos f WHERE f.fotoid = :fotoid"),
    @NamedQuery(name = "Fotos.findByFotonombre", query = "SELECT f FROM Fotos f WHERE f.fotonombre = :fotonombre"),
    @NamedQuery(name = "Fotos.findByFototitle", query = "SELECT f FROM Fotos f WHERE f.fototitle = :fototitle"),
    @NamedQuery(name = "Fotos.findByFotourl", query = "SELECT f FROM Fotos f WHERE f.fotourl = :fotourl"),
    @NamedQuery(name = "Fotos.findByCreada", query = "SELECT f FROM Fotos f WHERE f.creada = :creada"),
    @NamedQuery(name = "Fotos.findByModificada", query = "SELECT f FROM Fotos f WHERE f.modificada = :modificada"),
    @NamedQuery(name = "Fotos.findByExt", query = "SELECT f FROM Fotos f WHERE f.ext = :ext"),
    @NamedQuery(name = "Fotos.findByPosicion", query = "SELECT f FROM Fotos f WHERE f.posicion = :posicion"),
    @NamedQuery(name = "Fotos.findByComentario", query = "SELECT f FROM Fotos f WHERE f.comentario = :comentario")})
public class Fotos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "fotoid")
    private Integer fotoid;
    @Size(max = 50)
    @Column(name = "fotonombre")
    private String fotonombre;
    @Size(max = 50)
    @Column(name = "fototitle")
    private String fototitle;
    @Size(max = 100)
    @Column(name = "fotourl")
    private String fotourl;
    @Column(name = "creada")
    @Temporal(TemporalType.DATE)
    private Date creada;
    @Column(name = "modificada")
    @Temporal(TemporalType.DATE)
    private Date modificada;
    @Size(max = 10)
    @Column(name = "ext")
    private String ext;
    @Column(name = "posicion")
    private Integer posicion;
    @Size(max = 200)
    @Column(name = "comentario")
    private String comentario;
    @JoinColumn(name = "productoid", referencedColumnName = "productoid")
    @ManyToOne
    private Productos productoid;

    public Fotos() {
    }

    public Fotos(Integer fotoid) {
        this.fotoid = fotoid;
    }

    public Integer getFotoid() {
        return fotoid;
    }

    public void setFotoid(Integer fotoid) {
        this.fotoid = fotoid;
    }

    public String getFotonombre() {
        return fotonombre;
    }

    public void setFotonombre(String fotonombre) {
        this.fotonombre = fotonombre;
    }

    public String getFototitle() {
        return fototitle;
    }

    public void setFototitle(String fototitle) {
        this.fototitle = fototitle;
    }

    public String getFotourl() {
        return fotourl;
    }

    public void setFotourl(String fotourl) {
        this.fotourl = fotourl;
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

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
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
        hash += (fotoid != null ? fotoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fotos)) {
            return false;
        }
        Fotos other = (Fotos) object;
        if ((this.fotoid == null && other.fotoid != null) || (this.fotoid != null && !this.fotoid.equals(other.fotoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Fotos[ fotoid=" + fotoid + " ]";
    }
    
}
