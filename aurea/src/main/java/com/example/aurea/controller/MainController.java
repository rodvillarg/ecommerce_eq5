/**
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
package com.example.aurea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/perfil")
    public String mostrarPerfil(Model model) {

        // === DATOS DEL USUARIO ===
        Map<String, Object> usuario = new HashMap<>();
        usuario.put("nombre", "Diego");
        usuario.put("apellido", "Ramírez");
        usuario.put("email", "diego.r@email.com");
        usuario.put("telefono", "+52 644 123 4567");
        usuario.put("fechaRegistro", "enero 2026");
        model.addAttribute("usuario", usuario);

        // === PEDIDOS ===
        List<Map<String, Object>> pedidos = new ArrayList<>();

        Map<String, Object> p1 = new HashMap<>();
        p1.put("codigo", "#AUR-0741");
        p1.put("items", "Blazer Negro Casual, Jean Baggy Azul");
        p1.put("total", "2,350");
        p1.put("fecha", "13 jun 2026");
        p1.put("estado", "Enviado");
        pedidos.add(p1);

        Map<String, Object> p2 = new HashMap<>();
        p2.put("codigo", "#AUR-0738");
        p2.put("items", "Polo Café");
        p2.put("total", "649");
        p2.put("fecha", "28 may 2026");
        p2.put("estado", "Entregado");
        pedidos.add(p2);

        Map<String, Object> p3 = new HashMap<>();
        p3.put("codigo", "#AUR-0725");
        p3.put("items", "Camisa Blanca Relaxed, Bermuda Negra");
        p3.put("total", "1,248");
        p3.put("fecha", "10 may 2026");
        p3.put("estado", "Entregado");
        pedidos.add(p3);

        model.addAttribute("pedidos", pedidos);

        // === DIRECCIONES ===
        List<Map<String, Object>> direcciones = new ArrayList<>();

        Map<String, Object> d1 = new HashMap<>();
        d1.put("id", 1);
        d1.put("tipo", "Principal");
        d1.put("nombre", "Diego Ramírez");
        d1.put("calle", "Calle Yañez 123, Col. Centro");
        d1.put("ciudad", "Ciudad Obregón");
        d1.put("estado", "Sonora");
        d1.put("cp", "85000");
        d1.put("telefono", "+52 644 123 4567");
        direcciones.add(d1);

        Map<String, Object> d2 = new HashMap<>();
        d2.put("id", 2);
        d2.put("tipo", "Secundaria");
        d2.put("nombre", "Diego Ramírez");
        d2.put("calle", "Av. Tecnológico 456, Col. Constitución");
        d2.put("ciudad", "Hermosillo");
        d2.put("estado", "Sonora");
        d2.put("cp", "83000");
        d2.put("telefono", "+52 662 987 6543");
        direcciones.add(d2);

        model.addAttribute("direcciones", direcciones);

        return "perfil";
    }
}
