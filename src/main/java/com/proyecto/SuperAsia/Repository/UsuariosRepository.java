package com.proyecto.SuperAsia.Repository;

import com.proyecto.SuperAsia.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
     // Aquí puedes agregar métodos personalizados si es necesario

}
