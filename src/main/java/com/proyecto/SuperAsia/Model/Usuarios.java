package com.proyecto.SuperAsia.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuarios {
    @Id
    private Integer id;
    private String nombres;
    private String correo;
    private String contraseña;


}
