package com.exemplo.service;

import com.exemplo.model.Usuario;
import com.exemplo.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class UsuarioServiceTest {

    @Test
    void deveSalvarUsuarioComDadosValidos() {
        UsuarioRepository repositoryMock = mock(UsuarioRepository.class);
        UsuarioService service = new UsuarioService(repositoryMock);

        Usuario usuario = new Usuario("Raquel", "raquel@email.com");

        service.cadastrarUsuario(usuario);

        verify(repositoryMock, times(1)).salvar(usuario);
    }

    @Test
    void deveLancarErroQuandoDadosInvalidos() {
        UsuarioRepository repositoryMock = mock(UsuarioRepository.class);
        UsuarioService service = new UsuarioService(repositoryMock);

        Usuario usuario = new Usuario(null, "email@email.com");

        assertThrows(IllegalArgumentException.class, () -> {
            service.cadastrarUsuario(usuario);
        });

        verify(repositoryMock, never()).salvar(any());
    }
}
