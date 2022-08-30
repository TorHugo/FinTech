package repository;

import entity.Usuario;

public interface UsuarioInterface {

    void consultarUsuario(Long id);
    Usuario editarUsuario(Long id);
    void apagarUsuario(Long id);
}
