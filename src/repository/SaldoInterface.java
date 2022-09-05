package repository;

import entity.Usuario;

public interface SaldoInterface {

    void consultarSaldo (Usuario usuario);
    void editarSaldo(Long idUsuario, Long id);
    void apagarSaldo(Long idUsuario, Long id);
}
