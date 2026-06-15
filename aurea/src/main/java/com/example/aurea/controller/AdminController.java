package com.example.aurea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controlador del panel de administración de Aurea.
 *
 * @author Jesús Rodrigo Villegas Argüelles - 261186
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String mostrarDashboard(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === MÉTRICAS ===
        model.addAttribute("ventasMes", "24,780");
        model.addAttribute("pedidosNuevos",104);
        model.addAttribute("clientesActivos", 6048);
        model.addAttribute("resenasPendientes", 4);

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("pedidosPendientes", 4);

        // === PEDIDOS RECIENTES ===
        List<Map<String, Object>> pedidos = new ArrayList<>();

        Map<String, Object> p1 = new HashMap<>();
        p1.put("codigo", "#AUR-0741");
        p1.put("clienteNombre", "Diego Ramírez");
        p1.put("total", "2,350");
        p1.put("estado", "Enviado");
        pedidos.add(p1);

        Map<String, Object> p2 = new HashMap<>();
        p2.put("codigo", "#AUR-0740");
        p2.put("clienteNombre", "Andrés Castillo");
        p2.put("total", "1,599");
        p2.put("estado", "En proceso");
        pedidos.add(p2);

        Map<String, Object> p3 = new HashMap<>();
        p3.put("codigo", "#AUR-0739");
        p3.put("clienteNombre", "Luis Herrera");
        p3.put("total", "3,100");
        p3.put("estado", "Enviado");
        pedidos.add(p3);

        Map<String, Object> p4 = new HashMap<>();
        p4.put("codigo", "#AUR-0738");
        p4.put("clienteNombre", "Miguel Soto");
        p4.put("total", "980");
        p4.put("estado", "Pendiente");
        pedidos.add(p4);

        model.addAttribute("pedidosRecientes", pedidos);

        // === MÁS VENDIDOS ===
        List<Map<String, Object>> productos = new ArrayList<>();

        Map<String, Object> prod1 = new HashMap<>();
        prod1.put("nombre", "Blazer Negro Casual");
        prod1.put("precio", "1,299");
        prod1.put("stock", 5);
        productos.add(prod1);

        Map<String, Object> prod2 = new HashMap<>();
        prod2.put("nombre", "Jean Baggy Azul");
        prod2.put("precio", "850");
        prod2.put("stock", 4);
        productos.add(prod2);

        Map<String, Object> prod3 = new HashMap<>();
        prod3.put("nombre", "Camisa Blanca Relaxed");
        prod3.put("precio", "699");
        prod3.put("stock", 1);
        productos.add(prod3);

        Map<String, Object> prod4 = new HashMap<>();
        prod4.put("nombre", "Jacket Negra Boxy");
        prod4.put("precio", "1,150");
        prod4.put("stock", 1);
        productos.add(prod4);

        model.addAttribute("masVendidos", productos);

        return "admin-dashboard";
    }

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("pedidosPendientes", 4);
        model.addAttribute("resenasPendientes", 7);

        // === LISTA DE PRODUCTOS (datos de ejemplo) ===
        List<Map<String, Object>> productos = new ArrayList<>();

        Map<String, Object> p1 = new HashMap<>();
        p1.put("id", 1);
        p1.put("nombre", "Blazer Negro Casual");
        p1.put("sku", "AUR-BLZ-001");
        p1.put("categoria", "Blazers");
        p1.put("precio", "1,299");
        p1.put("stock", 12);
        productos.add(p1);

        Map<String, Object> p2 = new HashMap<>();
        p2.put("id", 2);
        p2.put("nombre", "Jean Baggy Azul");
        p2.put("sku", "AUR-JN-004");
        p2.put("categoria", "Jeans");
        p2.put("precio", "899");
        p2.put("stock", 19);
        productos.add(p2);

        Map<String, Object> p3 = new HashMap<>();
        p3.put("id", 3);
        p3.put("nombre", "Camisa Blanca Relaxed");
        p3.put("sku", "AUR-CAM-002");
        p3.put("categoria", "Camisas");
        p3.put("precio", "699");
        p3.put("stock", 2);
        productos.add(p3);

        Map<String, Object> p4 = new HashMap<>();
        p4.put("id", 4);
        p4.put("nombre", "Jacket Negra Boxy");
        p4.put("sku", "AUR-JCK-001");
        p4.put("categoria", "Jackets");
        p4.put("precio", "1,150");
        p4.put("stock", 1);
        productos.add(p4);

        Map<String, Object> p5 = new HashMap<>();
        p5.put("id", 5);
        p5.put("nombre", "Polo Café");
        p5.put("sku", "AUR-POL-003");
        p5.put("categoria", "Polos");
        p5.put("precio", "649");
        p5.put("stock", 15);
        productos.add(p5);

        Map<String, Object> p6 = new HashMap<>();
        p6.put("id", 6);
        p6.put("nombre", "Bermuda Negra");
        p6.put("sku", "AUR-BRM-002");
        p6.put("categoria", "Bermudas");
        p6.put("precio", "549");
        p6.put("stock", 0);
        productos.add(p6);

        model.addAttribute("productos", productos);

        return "admin-productos";
    }

    @GetMapping("/productos/nuevo")
    public String mostrarFormProducto(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("pedidosPendientes", 4);
        model.addAttribute("resenasPendientes", 7);

        return "admin-producto-form";
    }

    @GetMapping("/resenas")
    public String mostrarResenas(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("pedidosPendientes", 4);
        model.addAttribute("totalClientes", 248);

        // === CONTADORES DE RESEÑAS ===
        model.addAttribute("resenasPendientes", 7);
        model.addAttribute("totalResenas", 24);
        model.addAttribute("resenasAprobadas", 17);

        // === LISTA DE RESEÑAS ===
        List<Map<String, Object>> resenas = new ArrayList<>();

        Map<String, Object> r1 = new HashMap<>();
        r1.put("id", 1);
        r1.put("clienteNombre", "Diego Ramírez");
        r1.put("productoNombre", "Blazer Negro Casual");
        r1.put("fecha", "13 jun 2026");
        r1.put("calificacion", 5);
        r1.put("texto", "Excelente calidad, el corte es perfecto y la tela muy buena. Lo usé para una boda y recibí muchos cumplidos.");
        r1.put("estado", "Pendiente");
        resenas.add(r1);

        Map<String, Object> r2 = new HashMap<>();
        r2.put("id", 2);
        r2.put("clienteNombre", "Andrés Castillo");
        r2.put("productoNombre", "Jean Baggy Azul");
        r2.put("fecha", "12 jun 2026");
        r2.put("calificacion", 4);
        r2.put("texto", "Muy buen jean, el azul es muy elegante. Le quito una estrella porque el tallaje corre un poco grande.");
        r2.put("estado", "Pendiente");
        resenas.add(r2);

        Map<String, Object> r3 = new HashMap<>();
        r3.put("id", 3);
        r3.put("clienteNombre", "Luis Herrera");
        r3.put("productoNombre", "Polo Café");
        r3.put("fecha", "11 jun 2026");
        r3.put("calificacion", 3);
        r3.put("texto", "Buena calidad por el precio. El color es exactamente como en la foto, eso se agradece.");
        r3.put("estado", "Pendiente");
        resenas.add(r3);

        Map<String, Object> r4 = new HashMap<>();
        r4.put("id", 4);
        r4.put("clienteNombre", "Miguel Soto");
        r4.put("productoNombre", "Camisa Blanca Relaxed");
        r4.put("fecha", "10 jun 2026");
        r4.put("calificacion", 5);
        r4.put("texto", "La camisa es increíble, muy cómoda y el material es de primera. Definitivamente compraré más.");
        r4.put("estado", "Aprobada");
        resenas.add(r4);

        model.addAttribute("resenas", resenas);

        return "admin-resenas";
    }

    @GetMapping("/pedidos")
    public String mostrarPedidos(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("resenasPendientes", 7);
        model.addAttribute("totalClientes", 248);

        // === CONTADORES DE PEDIDOS ===
        model.addAttribute("totalPedidos", 84);
        model.addAttribute("pedidosPendientes", 4);
        model.addAttribute("pedidosProceso", 12);
        model.addAttribute("pedidosEnviados", 58);
        model.addAttribute("pedidosEntregados", 10);

        // === LISTA DE PEDIDOS ===
        List<Map<String, Object>> pedidos = new ArrayList<>();

        Map<String, Object> p1 = new HashMap<>();
        p1.put("id", 1);
        p1.put("codigo", "#AUR-0741");
        p1.put("clienteNombre", "Diego Ramírez");
        p1.put("fecha", "13 jun 2026");
        p1.put("total", "2,350");
        p1.put("estado", "Enviado");
        p1.put("metodoPago", "Tarjeta");
        pedidos.add(p1);

        Map<String, Object> p2 = new HashMap<>();
        p2.put("id", 2);
        p2.put("codigo", "#AUR-0740");
        p2.put("clienteNombre", "Andrés Castillo");
        p2.put("fecha", "12 jun 2026");
        p2.put("total", "1,599");
        p2.put("estado", "En proceso");
        p2.put("metodoPago", "Transferencia");
        pedidos.add(p2);

        Map<String, Object> p3 = new HashMap<>();
        p3.put("id", 3);
        p3.put("codigo", "#AUR-0739");
        p3.put("clienteNombre", "Luis Herrera");
        p3.put("fecha", "11 jun 2026");
        p3.put("total", "3,100");
        p3.put("estado", "Enviado");
        p3.put("metodoPago", "Tarjeta");
        pedidos.add(p3);

        Map<String, Object> p4 = new HashMap<>();
        p4.put("id", 4);
        p4.put("codigo", "#AUR-0738");
        p4.put("clienteNombre", "Miguel Soto");
        p4.put("fecha", "10 jun 2026");
        p4.put("total", "980");
        p4.put("estado", "Pendiente");
        p4.put("metodoPago", "Efectivo");
        pedidos.add(p4);

        Map<String, Object> p5 = new HashMap<>();
        p5.put("id", 5);
        p5.put("codigo", "#AUR-0737");
        p5.put("clienteNombre", "Carlos Ruiz");
        p5.put("fecha", "09 jun 2026");
        p5.put("total", "4,250");
        p5.put("estado", "Entregado");
        p5.put("metodoPago", "Tarjeta");
        pedidos.add(p5);

        Map<String, Object> p6 = new HashMap<>();
        p6.put("id", 6);
        p6.put("codigo", "#AUR-0736");
        p6.put("clienteNombre", "José Morales");
        p6.put("fecha", "08 jun 2026");
        p6.put("total", "1,799");
        p6.put("estado", "En proceso");
        p6.put("metodoPago", "Transferencia");
        pedidos.add(p6);

        model.addAttribute("pedidos", pedidos);

        return "admin-pedidos";
    }

    @GetMapping("/clientes")
    public String mostrarClientes(Model model) {

        // === DATOS DEL ADMINISTRADOR ===
        model.addAttribute("adminNombre", "Carlos López");
        model.addAttribute("adminRol", "Super Admin");

        // === SIDEBAR BADGES ===
        model.addAttribute("totalProductos", 89);
        model.addAttribute("pedidosPendientes", 4);
        model.addAttribute("resenasPendientes", 7);
        model.addAttribute("totalClientes", 248);

        // === LISTA DE CLIENTES ===
        List<Map<String, Object>> clientes = new ArrayList<>();

        Map<String, Object> c1 = new HashMap<>();
        c1.put("id", 1);
        c1.put("nombre", "Diego Ramírez");
        c1.put("email", "diego.r@email.com");
        c1.put("fechaRegistro", "10 ene 2026");
        c1.put("totalCompras", 8);
        c1.put("totalGastado", "14,320");
        c1.put("estado", "Activo");
        clientes.add(c1);

        Map<String, Object> c2 = new HashMap<>();
        c2.put("id", 2);
        c2.put("nombre", "Andrés Castillo");
        c2.put("email", "andres.c@email.com");
        c2.put("fechaRegistro", "22 feb 2026");
        c2.put("totalCompras", 3);
        c2.put("totalGastado", "4,780");
        c2.put("estado", "Activo");
        clientes.add(c2);

        Map<String, Object> c3 = new HashMap<>();
        c3.put("id", 3);
        c3.put("nombre", "Luis Herrera");
        c3.put("email", "luis.h@email.com");
        c3.put("fechaRegistro", "05 mar 2026");
        c3.put("totalCompras", 5);
        c3.put("totalGastado", "9,100");
        c3.put("estado", "Activo");
        clientes.add(c3);

        Map<String, Object> c4 = new HashMap<>();
        c4.put("id", 4);
        c4.put("nombre", "Miguel Soto");
        c4.put("email", "miguel.s@email.com");
        c4.put("fechaRegistro", "18 abr 2026");
        c4.put("totalCompras", 1);
        c4.put("totalGastado", "980");
        c4.put("estado", "Inactivo");
        clientes.add(c4);

        Map<String, Object> c5 = new HashMap<>();
        c5.put("id", 5);
        c5.put("nombre", "Carlos Ruiz");
        c5.put("email", "carlos.r@email.com");
        c5.put("fechaRegistro", "02 may 2026");
        c5.put("totalCompras", 6);
        c5.put("totalGastado", "11,450");
        c5.put("estado", "Activo");
        clientes.add(c5);

        Map<String, Object> c6 = new HashMap<>();
        c6.put("id", 6);
        c6.put("nombre", "José Morales");
        c6.put("email", "jose.m@email.com");
        c6.put("fechaRegistro", "30 may 2026");
        c6.put("totalCompras", 2);
        c6.put("totalGastado", "3,200");
        c6.put("estado", "Activo");
        clientes.add(c6);

        model.addAttribute("clientes", clientes);

        return "admin-clientes";
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