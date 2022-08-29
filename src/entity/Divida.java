package entity;

import java.util.Date;

public class Divida {
    private Long id;
    private String nomeDivida;
    private Float valor;
    private Date dataVencimento;
    private Date dataVPagamento;
    private Boolean verificacaoPagamento;
    private CategoriaDivida categoriaDivida;

    // constructor
    public Divida(Long id, String nomeDivida, Float valor, Date dataVencimento, Date dataVPagamento, Boolean verificacaoPagamento, CategoriaDivida categoriaDivida) {
        this.id = id;
        this.nomeDivida = nomeDivida;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataVPagamento = dataVPagamento;
        this.verificacaoPagamento = verificacaoPagamento;
        this.categoriaDivida = categoriaDivida;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDivida() {
        return nomeDivida;
    }

    public void setNomeDivida(String nomeDivida) {
        this.nomeDivida = nomeDivida;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataVPagamento() {
        return dataVPagamento;
    }

    public void setDataVPagamento(Date dataVPagamento) {
        this.dataVPagamento = dataVPagamento;
    }

    public Boolean getVerificacaoPagamento() {
        return verificacaoPagamento;
    }

    public void setVerificacaoPagamento(Boolean verificacaoPagamento) {
        this.verificacaoPagamento = verificacaoPagamento;
    }

    public CategoriaDivida getCategoriaDivida() {
        return categoriaDivida;
    }

    public void setCategoriaDivida(CategoriaDivida categoriaDivida) {
        this.categoriaDivida = categoriaDivida;
    }
}
