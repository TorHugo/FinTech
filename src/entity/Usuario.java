package entity;

import interfaces.UsuarioInterface;

import java.util.Scanner;

public class Usuario implements UsuarioInterface {
    Scanner sc = new Scanner(System.in);
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;

    public Usuario(Long id, String nome, String email, String senha, String telefone) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }
    public Usuario(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void cadastrarUsuario() {

    }

    @Override
    public void editarUsuario(Usuario usuario) {

    }

    @Override
    public void apagarUsuario(Usuario usuario) {

    }
}
