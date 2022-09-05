import entity.Deposito;
import entity.Usuario;
import enums.EnumTipoSaldo;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Cadastrando Novo Usuario. ----- \n");
        Usuario usuario = new Usuario(1L, "Victor Hugo", "email@gmail.com", "1234", "(11) 93265-4277");
        usuario.consultarUsuario(1L);
        System.out.println("\n----- Usuario cadastrado com sucesso. -----");

        System.out.println("\n----- Cadastrando Saldo. Usuario: " + usuario.getNome());
        Deposito deposito = new Deposito(1L, 150.50F, "Conta de agua", "30/08/2022", EnumTipoSaldo.SAIDA, usuario);
        deposito.consultarSaldo(usuario);
        System.out.println("\n----- Saldo cadastrado com sucesso. -----");

        usuario.consultarUsuario(1L);
        usuario.editarUsuario(1L);

        deposito.consultarSaldo(usuario);
        deposito.editarSaldo(1L, 1L);

        usuario.apagarUsuario(1L);
        usuario.consultarUsuario(1L);

        deposito.apagarSaldo(1L, 1L);
        deposito.consultarSaldo(usuario);
    }
}
