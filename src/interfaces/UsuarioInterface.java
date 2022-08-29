package interfaces;

import entity.Usuario;

public interface UsuarioInterface {

    public void cadastrarUsuario();
    public void editarUsuario(Usuario usuario);
    public void apagarUsuario(Usuario usuario);
}
