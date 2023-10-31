package com.ecommerce.controller;

import com.ecommerce.model.DetalleOrden;
import com.ecommerce.model.Orden;
import com.ecommerce.model.Producto;
import com.ecommerce.repository.ProductoRepository;
import com.ecommerce.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ProductoService productoService;

    //Almacenar detalles de orden
    List<DetalleOrden> detalles = new ArrayList<DetalleOrden>();

    //Datos de orden
    Orden orden = new Orden();

    @GetMapping("")
    public String home(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "usuario/home";
    }

    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Integer id, Model model) {

        log.info("Id enviado como parametro: {}", id);
        Producto producto = new Producto();
        Optional<Producto> productoOptional = productoService.get(id);
        producto = productoOptional.get();

        model.addAttribute("producto", producto);

        return "usuario/productohome";
    }

    //CARRITO
    @PostMapping("/cart")
    public String addCart(@RequestParam Integer id, @RequestParam Integer cantidad) {

        DetalleOrden detalleOrden = new DetalleOrden();
        Producto producto = new Producto();
        double sumaTotal = 0;

        Optional<Producto> optionalProducto = productoService.get(id);
        log.info("Producto añadido: {}",optionalProducto.get());
        log.info("Cantidad: {}",cantidad);

        return "usuario/carrito";
    }


}
