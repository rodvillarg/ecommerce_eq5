/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/","/index","index.html"})
    public String index() {
        return "index";
    }

    @GetMapping({"/login","/login.html"})
    public String login() {
        return "login";
    }

    @GetMapping({"/registro","/registro.html"})
    public String registro() {
        return "registro";
    }

    @GetMapping({"/productos","/productos.html"})
    public String productos() {
        return "productos";
    }


    @GetMapping("/novedades")
    public String novedades() {
        return "productos";
    }

    @GetMapping("/sale")
    public String sale() {
        return "productos";
    }

    @GetMapping("/producto/{id}")
    public String detalleProducto() {
        return "detalle-producto";
    }

    @GetMapping({"/bolsa-compra","/bolsa-compra.html"})
    public String bolsaCompra() {
        return "bolsa-compra";
    }

    @GetMapping("/checkout-envio")
    public String checkoutEnvio() {
        return "checkout-envio";
    }

    @GetMapping("/checkout-pago")
    public String checkoutPago() {
        return "checkout-pago";
    }

    @GetMapping("/checkout-confirmacion")
    public String checkoutConfirmacion() {
        return "checkout-confirmacion";
    }
}
