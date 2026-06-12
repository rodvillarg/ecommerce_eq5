/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.List;

public class Usuario {

    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String telefono;
    private RolUsuario rol;
    private List<Direccion> direcciones;
    private List<Pedido> pedidos;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String correo, String contrasena,
                   String telefono, RolUsuario rol, List<Direccion> direcciones,
                   List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.rol = rol;
        this.direcciones = direcciones;
        this.pedidos = pedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
