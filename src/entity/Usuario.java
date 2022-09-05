package entity;

import repository.UsuarioInterface;

import java.util.Scanner;


public class Usuario implements UsuarioInterface {
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
    public void consultarUsuario(Long id) {
        if (id.equals(this.getId())) {
            System.out.println("\n----- Perfil -----");
            System.out.println("\n\t.Nome: " + this.getNome());
            System.out.println("\t.E-mail: " + this.getEmail());
            System.out.println("\t.Senha: " + this.getSenha());
            System.out.println("\t.Telefone: " + this.getTelefone());
            System.out.println("\n----- Fim da Consulta de Perfil -----");
        }
    }

    @Override
    public Usuario editarUsuario(Long id) {
        if (id.equals(this.getId())){
            System.out.println("\n----- Editar Perfil -----");
            System.out.println("\n\t.Antigo nome: " + this.getNome());

            this.setNome(null);
            this.setNome("Victor Hugo");
            System.out.println("\t.Novo nome: " + this.getNome());

            System.out.println("\n----- Fim da Edicao de Perfil -----");
            return new Usuario();
        } else {
            System.out.println("\n----- Usuario nao encontrado! -----");
        }

        return new Usuario(null, null, null, null, null);
    }

    @Override
    public void apagarUsuario(Long id) {
        if (id.equals(this.getId())){
            System.out.println("\n\n\n\n\n----- Excluindo Perfil -----");
            this.setNome(null);
            this.setEmail(null);
            this.setSenha(null);
            this.setTelefone(null);
            System.out.println("\n----- Perfil excluido com sucesso! Id: {"+ id +"} -----");
        } else {
            System.out.println("\n----- Usuario nao encontrado! -----\n\n\n\n\n");
        }
    }
}
