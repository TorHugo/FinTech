package entity;

import enums.EnumTipoSaldo;
import repository.SaldoInterface;

public abstract class Saldo implements SaldoInterface {
    protected Long id;
    protected Float valor;
    protected String descValor;
    protected String dataValor;
    protected EnumTipoSaldo tipoSaldo;
    protected Usuario usuario;

    public Saldo(Long id, Float valor, String descValor, String dataValor, EnumTipoSaldo tipoSaldo, Usuario usuario) {
        this.id = id;
        this.valor = valor;
        this.descValor = descValor;
        this.dataValor = dataValor;
        this.tipoSaldo = tipoSaldo;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getDescValor() {
        return descValor;
    }

    public void setDescValor(String descValor) {
        this.descValor = descValor;
    }

    public String getDataValor() {
        return dataValor;
    }

    public void setDataValor(String dataValor) {
        this.dataValor = dataValor;
    }

    public EnumTipoSaldo getTipoSaldo() {
        return tipoSaldo;
    }

    public void setTipoSaldo(EnumTipoSaldo tipoSaldo) {
        this.tipoSaldo = tipoSaldo;
    }


    @Override
    public void consultarSaldo(Usuario usuario) {
        if (usuario.getId().equals(usuario.getId())){
            System.out.println("\n----- Valores do Usuario: " +  usuario.getNome() + " -----");
            System.out.println("\n\t.Usuario: " + this.getUsuario().getNome());
            System.out.println("\t.Valor: " + this.getValor());
            System.out.println("\t.Descricao: " + this.getDescValor());
            System.out.println("\t.Tipo: " + this.getTipoSaldo());
            System.out.println("\t.Data: " + this.getDataValor());
            System.out.println("\n----- Fim da Consulta do Valor -----");
        } else {
            System.out.println("Saldo ou Usuario nao encontrado.");
        }
    }

    @Override
    public void editarSaldo(Long idUsuario, Long id) {

        if (!idUsuario.equals(this.getUsuario().getId())){
            System.out.println("Usuario não encontrado.");
        }
        if (!id.equals(this.getId())){
            System.out.println("Saldo não encontrado.");
        }

        System.out.println("\n----- Editar Saldo -----");

        System.out.println("\n\t--- Antigas informacoes: ---");
        System.out.println("\t.Descricao: " + this.getDescValor());
        System.out.println("\t.Tipo: " + this.getTipoSaldo());
        System.out.println("\t.Valor: " + this.getValor());

        this.setDescValor(null);
        this.setTipoSaldo(null);
        this.setValor(null);

        this.setDescValor("Pagamento!");
        this.setTipoSaldo(EnumTipoSaldo.ENTRADA);
        this.setValor(3201.00F);

        System.out.println("\n\t--- Novas informacoes: ---");
        System.out.println("\t.Descricao: " + this.getDescValor());
        System.out.println("\t.Tipo: " + this.getTipoSaldo());
        System.out.println("\t.Valor: " + this.getValor());

        System.out.println("\n----- Fim da Edicao de Saldo -----");
    }

    @Override
    public void apagarSaldo(Long idUsuario, Long id) {
        if (!idUsuario.equals(this.getUsuario().getId())){
            System.out.println("Usuario não encontrado.");
        }
        if (!id.equals(this.getId())){
            System.out.println("Saldo não encontrado.");
        }
        System.out.println("\n\n\n\n\n----- Excluindo Saldo -----");
        this.setDescValor(null);
        this.setTipoSaldo(null);
        this.setValor(null);
        this.setDataValor(null);
        this.setUsuario(null);
        System.out.println("\n----- Saldo excluido com sucesso! Usuario: {"+ idUsuario +"} -----\n\n\n\n\n");
    }
}
