package com.proyecto.SuperAsia.Controller;

import com.proyecto.SuperAsia.Model.Usuarios;
import com.proyecto.SuperAsia.Service.UsuariosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {

    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping
    public List<Usuarios> getAllUsuarios() {
        return usuariosService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public Optional<Usuarios> getUsuarioById(@PathVariable Long id) {
        return usuariosService.getUsuarioById(id);
    }

    @PostMapping
    public Usuarios createUsuario(@RequestBody Usuarios usuario) {
        return usuariosService.createUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuarios updateUsuario(@PathVariable Long id, @RequestBody Usuarios usuario) {
        return usuariosService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuariosService.deleteUsuario(id);
    }



}
