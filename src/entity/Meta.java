package entity;

import java.util.Date;

public class Meta {
    private Long id;
    private String descMeta;
    private Float valor;
    private Date dataInicio;
    private Date dataFinal;
    private Boolean concluida;
    private CategoriaMeta categoriaMeta;

    public Meta(Long id, String descMeta, Float valor, Date dataInicio, Date dataFinal, Boolean concluida, CategoriaMeta categoriaMeta) {
        this.id = id;
        this.descMeta = descMeta;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.concluida = concluida;
        this.categoriaMeta = categoriaMeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescMeta() {
        return descMeta;
    }

    public void setDescMeta(String descMeta) {
        this.descMeta = descMeta;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public CategoriaMeta getCategoriaMeta() {
        return categoriaMeta;
    }

    public void setCategoriaMeta(CategoriaMeta categoriaMeta) {
        this.categoriaMeta = categoriaMeta;
    }
}
