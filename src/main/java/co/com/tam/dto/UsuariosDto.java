/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.tam.dto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author geotor
 */
public class UsuariosDto {
    private Integer usuarioid;
    private String cedula;
    private String nombres;
    private String apellidos;
    private Date nacimiento;
    private String direccion;
    private String direccion2;
    private Date creado;
    private Date modificado;
    private String telefono;
    private String celular;
    private String correo;
    private String clave;
    private List<UsuariosTiendasDto> usuariosTiendasList;
    private GenerosDto generoid;
    private TipoIdentificacionesDto tipoidentificacionid;
    private CiudadesDto ciudadResidencia;
    private EstadosDto estadoid;
    private RolesDto rolid;

    public UsuariosDto() {
    }

    public UsuariosDto(Integer usuarioid) {
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

    public List<UsuariosTiendasDto> getUsuariosTiendasList() {
        return usuariosTiendasList;
    }

    public void setUsuariosTiendasList(List<UsuariosTiendasDto> usuariosTiendasList) {
        this.usuariosTiendasList = usuariosTiendasList;
    }

    public GenerosDto getGeneroid() {
        return generoid;
    }

    public void setGeneroid(GenerosDto generoid) {
        this.generoid = generoid;
    }

    public TipoIdentificacionesDto getTipoidentificacionid() {
        return tipoidentificacionid;
    }

    public void setTipoidentificacionid(TipoIdentificacionesDto tipoidentificacionid) {
        this.tipoidentificacionid = tipoidentificacionid;
    }

    public CiudadesDto getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(CiudadesDto ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public EstadosDto getEstadoid() {
        return estadoid;
    }

    public void setEstadoid(EstadosDto estadoid) {
        this.estadoid = estadoid;
    }

    public RolesDto getRolid() {
        return rolid;
    }

    public void setRolid(RolesDto rolid) {
        this.rolid = rolid;
    }
    
}
