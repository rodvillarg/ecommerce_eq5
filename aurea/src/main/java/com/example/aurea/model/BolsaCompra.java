/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.model;

import java.util.List;

public class BolsaCompra {

    private int id;
    private Usuario usuario;
    private List<DetallePedido> detalles;
    private double total;

    public BolsaCompra() {
    }

    public BolsaCompra(int id, Usuario usuario, List<DetallePedido> detalles, double total) {
        this.id = id;
        this.usuario = usuario;
        this.detalles = detalles;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
