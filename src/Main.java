import entity.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario usuario[] = new Usuario[3];

        usuario[0] = new Usuario(1L, "Victor Hugo", "email@gmail.com", "1234", "(11) 93265-4277");
        usuario[1] = new Usuario(2L, "Hugo Arruda", "email@gmail.com", "1234", "(11) 93265-4277");
        usuario[2] = new Usuario(3L, "Victor Jesus", "email@gmail.com", "1234", "(11) 93265-4277");


        usuario[2].consultarUsuario(3L);
        usuario[2].apagarUsuario(3L);
    }
}
