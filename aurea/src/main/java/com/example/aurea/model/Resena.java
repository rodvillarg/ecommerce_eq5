/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.Date;

public class Resena {

    private int id;
    private int calificacion;
    private String comentario;
    private Date fecha;

    public Resena() {
    }

    public Resena(int id, int calificacion, String comentario, Date fecha) {
        this.id = id;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
