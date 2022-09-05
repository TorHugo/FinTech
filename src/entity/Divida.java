package entity;

import java.util.Date;

public class Divida {
    private Long id;
    private String nomeConta;
    private Float valorConta;
    private Date dataVencimento;
    private Date dataPagemento;
    private Boolean verificacaoDivida;

    private CategoriaDivida categoriaDivida;

    public Divida(Long id, String nomeConta, Float valorConta, Date dataVencimento, Date dataPagemento, Boolean verificacaoDivida, CategoriaDivida categoriaDivida) {
        this.id = id;
        this.nomeConta = nomeConta;
        this.valorConta = valorConta;
        this.dataVencimento = dataVencimento;
        this.dataPagemento = dataPagemento;
        this.verificacaoDivida = verificacaoDivida;
        this.categoriaDivida = categoriaDivida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public Float getValorConta() {
        return valorConta;
    }

    public void setValorConta(Float valorConta) {
        this.valorConta = valorConta;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagemento() {
        return dataPagemento;
    }

    public void setDataPagemento(Date dataPagemento) {
        this.dataPagemento = dataPagemento;
    }

    public Boolean getVerificacaoDivida() {
        return verificacaoDivida;
    }

    public void setVerificacaoDivida(Boolean verificacaoDivida) {
        this.verificacaoDivida = verificacaoDivida;
    }
}
