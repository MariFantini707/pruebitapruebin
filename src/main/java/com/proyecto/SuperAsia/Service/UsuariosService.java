package com.proyecto.SuperAsia.Service;
import com.proyecto.SuperAsia.Model.Usuarios;
import com.proyecto.SuperAsia.Repository.UsuariosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuarios> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    public Optional<Usuarios> getUsuarioById(Long id) {
        return usuariosRepository.findById(id);
    }

    public Usuarios createUsuario(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public Usuarios updateUsuario(Long id, Usuarios usuarioActualizado) {
        return usuariosRepository.findById(id).map(usuario -> {
            usuario.setNombres(usuarioActualizado.getNombres());
            usuario.setCorreo(usuarioActualizado.getCorreo());
            return usuariosRepository.save(usuario);
        }).orElse(null);
    }

    public void deleteUsuario(Long id) {
        usuariosRepository.deleteById(id);
    }

}
