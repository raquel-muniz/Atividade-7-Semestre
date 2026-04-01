package com.exemplo.service;

import com.exemplo.model.Usuario;
import com.exemplo.repository.UsuarioRepository;

public class UsuarioService {

    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getEmail() == null) {
            throw new IllegalArgumentException("Dados inválidos");
        }
        repository.salvar(usuario);
    }
}
