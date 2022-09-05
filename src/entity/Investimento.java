package entity;

import java.util.Date;

public class Investimento {
    private Long id;
    private Float valor;
    private String localInvestido;
    private Date dataInicio;
    private Date dataTermino;
    private Float rentabilidade;
    private CategoriaInvestimento categoriaInvestimento;

    public Investimento(Long id, Float valor, String localInvestido, Date dataInicio, Date dataTermino, Float rentabilidade, CategoriaInvestimento categoriaInvestimento) {
        this.id = id;
        this.valor = valor;
        this.localInvestido = localInvestido;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.rentabilidade = rentabilidade;
        this.categoriaInvestimento = categoriaInvestimento;
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

    public String getLocalInvestido() {
        return localInvestido;
    }

    public void setLocalInvestido(String localInvestido) {
        this.localInvestido = localInvestido;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Float getRentabilidade() {
        return rentabilidade;
    }

    public void setRentabilidade(Float rentabilidade) {
        this.rentabilidade = rentabilidade;
    }

    public CategoriaInvestimento getCategoriaInvestimento() {
        return categoriaInvestimento;
    }

    public void setCategoriaInvestimento(CategoriaInvestimento categoriaInvestimento) {
        this.categoriaInvestimento = categoriaInvestimento;
    }
}
