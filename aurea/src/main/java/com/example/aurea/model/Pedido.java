/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.Date;
import java.util.List;

public class Pedido {

    private int id;
    private String numPedido;
    private Date fecha;
    private double total;
    private EstadoPedido estado;
    private Direccion direccionEnvio;
    private List<DetallePedido> detalles;
    private Pago pago;

    public Pedido() {
    }

    public Pedido(int id, String numPedido, Date fecha, double total,
                  EstadoPedido estado, Direccion direccionEnvio,
                  List<DetallePedido> detalles, Pago pago) {
        this.id = id;
        this.numPedido = numPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.direccionEnvio = direccionEnvio;
        this.detalles = detalles;
        this.pago = pago;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public Direccion getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(Direccion direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
