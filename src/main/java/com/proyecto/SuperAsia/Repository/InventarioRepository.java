package com.proyecto.SuperAsia.Repository;

import com.proyecto.SuperAsia.Model.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<Inventario, Integer> {
}