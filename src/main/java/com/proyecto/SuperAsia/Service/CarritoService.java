package com.proyecto.SuperAsia.Service;


import com.proyecto.SuperAsia.Model.Carrito;
import com.proyecto.SuperAsia.Repository.CarritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoService {
    private final CarritoRepository carritoRepository;

    public CarritoService(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    public List<Carrito> getAll() {
        return carritoRepository.findAll();
    }

    public Optional<Carrito> getById(Integer id) {
        return carritoRepository.findById(id);
    }

    public Carrito save(Carrito carrito) {
        return carritoRepository.save(carrito);
    }

    public Carrito update(Integer id, Carrito nuevoCarrito) {
        return carritoRepository.findById(id).map(c -> {
            c.setUsuarios(nuevoCarrito.getUsuarios());
            c.setProducto(nuevoCarrito.getProducto());
            c.setNumeroProductos(nuevoCarrito.getNumeroProductos());
            return carritoRepository.save(c);
        }).orElse(null);
    }

    public void delete(Integer id) {
        carritoRepository.deleteById(id);
    }

}
