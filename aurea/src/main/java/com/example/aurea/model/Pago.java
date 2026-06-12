/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.Date;

public class Pago {

    private int id;
    private double monto;
    private Date fecha;
    private MetodoPago metodo;
    private EstadoPago estado;

    public Pago() {
    }

    public Pago(int id, double monto, Date fecha, MetodoPago metodo, EstadoPago estado) {
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public MetodoPago getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public EstadoPago getEstado() {
        return estado;
    }

    public void setEstado(EstadoPago estado) {
        this.estado = estado;
    }
}
