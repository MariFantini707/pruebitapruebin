package com.proyecto.SuperAsia.Controller;

import com.proyecto.SuperAsia.Model.Inventario;
import com.proyecto.SuperAsia.Service.InventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping
    public List<Inventario> getAllInventario() {
        return inventarioService.getAllInventario();
    }

    @GetMapping("/{id}")
    public Optional<Inventario> getById(@PathVariable Integer id) {
        return inventarioService.getById(id);
    }

    @PostMapping
    public Inventario save(@RequestBody Inventario inventario) {
        return inventarioService.save(inventario);
    }

    @PutMapping("/{id}")
    public Inventario update(@PathVariable Integer id, @RequestBody Inventario inventario) {
        return inventarioService.update(id, inventario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        inventarioService.delete(id);
    }
}
