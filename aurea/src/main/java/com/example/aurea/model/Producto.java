/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.List;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagenURL;
    private int existencia;
    private String talla;
    private String color;
    private Categoria categoria;
    private List<Resena> resenas;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, double precio,
                    String imagenURL, int existencia, String talla, String color,
                    Categoria categoria, List<Resena> resenas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagenURL = imagenURL;
        this.existencia = existencia;
        this.talla = talla;
        this.color = color;
        this.categoria = categoria;
        this.resenas = resenas;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagenURL() {
        return imagenURL;
    }

    public void setImagenURL(String imagenURL) {
        this.imagenURL = imagenURL;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }
}
