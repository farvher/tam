/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author geotor
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByUsuarioid", query = "SELECT u FROM Usuarios u WHERE u.usuarioid = :usuarioid"),
    @NamedQuery(name = "Usuarios.findByCedula", query = "SELECT u FROM Usuarios u WHERE u.cedula = :cedula"),
    @NamedQuery(name = "Usuarios.findByNombres", query = "SELECT u FROM Usuarios u WHERE u.nombres = :nombres"),
    @NamedQuery(name = "Usuarios.findByApellidos", query = "SELECT u FROM Usuarios u WHERE u.apellidos = :apellidos"),
    @NamedQuery(name = "Usuarios.findByNacimiento", query = "SELECT u FROM Usuarios u WHERE u.nacimiento = :nacimiento"),
    @NamedQuery(name = "Usuarios.findByDireccion", query = "SELECT u FROM Usuarios u WHERE u.direccion = :direccion"),
    @NamedQuery(name = "Usuarios.findByDireccion2", query = "SELECT u FROM Usuarios u WHERE u.direccion2 = :direccion2"),
    @NamedQuery(name = "Usuarios.findByCreado", query = "SELECT u FROM Usuarios u WHERE u.creado = :creado"),
    @NamedQuery(name = "Usuarios.findByModificado", query = "SELECT u FROM Usuarios u WHERE u.modificado = :modificado"),
    @NamedQuery(name = "Usuarios.findByTelefono", query = "SELECT u FROM Usuarios u WHERE u.telefono = :telefono"),
    @NamedQuery(name = "Usuarios.findByCelular", query = "SELECT u FROM Usuarios u WHERE u.celular = :celular"),
    @NamedQuery(name = "Usuarios.findByCorreo", query = "SELECT u FROM Usuarios u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuarios.findByClave", query = "SELECT u FROM Usuarios u WHERE u.clave = :clave")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "usuarioid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer usuarioid;
    @Size(max = 20)
    @Column(name = "cedula")
    private String cedula;
    @Size(max = 50)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 50)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "nacimiento")
    @Temporal(TemporalType.DATE)
    private Date nacimiento;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 100)
    @Column(name = "direccion2")
    private String direccion2;
    @Column(name = "creado")
    @Temporal(TemporalType.DATE)
    private Date creado;
    @Column(name = "modificado")
    @Temporal(TemporalType.DATE)
    private Date modificado;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 20)
    @Column(name = "celular")
    private String celular;
    @Size(max = 50)
    @Column(name = "correo")
    private String correo;
    @Size(max = 100)
    @Column(name = "clave")
    private String clave;
    @OneToMany(mappedBy = "usuarioid")
    private List<UsuariosTiendas> usuariosTiendasList;
    @JoinColumn(name = "generoid", referencedColumnName = "generoid")
    @ManyToOne
    private Generos generoid;
    @JoinColumn(name = "tipoidentificacionid", referencedColumnName = "tipoidentificacionid")
    @ManyToOne
    private TipoIdentificaciones tipoidentificacionid;
    @JoinColumn(name = "ciudad_residencia", referencedColumnName = "ciudadid")
    @ManyToOne
    private Ciudades ciudadResidencia;
    @JoinColumn(name = "estadoid", referencedColumnName = "estadoid")
    @ManyToOne
    private Estados estadoid;
    @JoinColumn(name = "rolid", referencedColumnName = "rolid")
    @ManyToOne
    private Roles rolid;

    public Usuarios(Usuarios user) {
        this.usuarioid = user.getUsuarioid();
        this.cedula = user.getCedula();
        this.nombres = user.getNombres();
        this.apellidos = user.getApellidos();
        this.nacimiento = user.getNacimiento();
        this.direccion = user.getDireccion();
        this.direccion2 = user.getDireccion2();
        this.creado = user.getCreado();
        this.modificado = user.getModificado();
        this.telefono = user.getTelefono();
        this.celular = user.getCelular();
        this.correo = user.getCorreo();
        this.clave = user.getClave();
        this.usuariosTiendasList = user.getUsuariosTiendasList();
        this.generoid = user.getGeneroid();
        this.tipoidentificacionid = user.getTipoidentificacionid();
        this.ciudadResidencia = user.getCiudadResidencia();
        this.estadoid = user.getEstadoid();
        this.rolid = user.getRolid();
    }

    public Usuarios() {

    }

    public Usuarios(Integer usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Integer getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Integer usuarioid) {
        this.usuarioid = usuarioid;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getModificado() {
        return modificado;
    }

    public void setModificado(Date modificado) {
        this.modificado = modificado;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @XmlTransient
    public List<UsuariosTiendas> getUsuariosTiendasList() {
        return usuariosTiendasList;
    }

    public void setUsuariosTiendasList(List<UsuariosTiendas> usuariosTiendasList) {
        this.usuariosTiendasList = usuariosTiendasList;
    }

    public Generos getGeneroid() {
        return generoid;
    }

    public void setGeneroid(Generos generoid) {
        this.generoid = generoid;
    }

    public TipoIdentificaciones getTipoidentificacionid() {
        return tipoidentificacionid;
    }

    public void setTipoidentificacionid(TipoIdentificaciones tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public Ciudades getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(Ciudades ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public Estados getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(Estados estadoid) {
        this.estadoid = estadoid;
    }

    public Roles getRolid() {
        return rolid;
    }

    public void setRolid(Roles rolid) {
        this.rolid = rolid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuarioid != null ? usuarioid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.usuarioid == null && other.usuarioid != null) || (this.usuarioid != null && !this.usuarioid.equals(other.usuarioid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.tam.domain.Usuarios[ usuarioid=" + usuarioid + " ]";
    }

}
