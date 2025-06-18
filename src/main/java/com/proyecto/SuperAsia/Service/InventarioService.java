package com.proyecto.SuperAsia.Service;

import com.proyecto.SuperAsia.Model.Inventario;
import com.proyecto.SuperAsia.Repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class InventarioService {

    private final InventarioRepository inventarioRepository;

    public InventarioService(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public List<Inventario> getAllInventario() {
        return inventarioRepository.findAll();
    }

    public Optional<Inventario> getById(Integer id) {
        return inventarioRepository.findById(id);
    }

    public Inventario save(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public Inventario update(Integer id, Inventario inventarioActualizado) {
        return inventarioRepository.findById(id).map(i -> {
            i.setNombre(inventarioActualizado.getNombre());
            i.setPrecio(inventarioActualizado.getPrecio());
            i.setCantidad(inventarioActualizado.getCantidad());
            return inventarioRepository.save(i);
        }).orElse(null);
    }

    public void delete(Integer id) {
        inventarioRepository.deleteById(id);
    }

}
