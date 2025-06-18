package com.proyecto.SuperAsia.Controller;

import com.proyecto.SuperAsia.Model.Carrito;
import com.proyecto.SuperAsia.Service.CarritoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carrito")

public class CarritoController {
    private final CarritoService carritoService;

    public CarritoController(CarritoService carritoService) {
        this.carritoService = carritoService;
    }

    @GetMapping
    public List<Carrito> getAll() {
        return carritoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Carrito> getById(@PathVariable Integer id) {
        return carritoService.getById(id);
    }

    @PostMapping
    public Carrito save(@RequestBody Carrito carrito) {
        return carritoService.save(carrito);
    }

    @PutMapping("/{id}")
    public Carrito update(@PathVariable Integer id, @RequestBody Carrito carrito) {
        return carritoService.update(id, carrito);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        carritoService.delete(id);
    }

    //APARTE, QUIERO REALIZAR ALGO RANDOM PARA HACER BUSQUEDA DE OTRA COSA

}
