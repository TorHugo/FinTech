package entity;

import java.util.Date;

public class Meta {
    private Long id;
    private String descMeta;
    private Float valorMeta;
    private Date dataInicio;
    private Date dataTermino;
    private Boolean concluida;

    public Meta(Long id, String descMeta, Float valorMeta, Date dataInicio, Date dataTermino, Boolean concluida) {
        this.id = id;
        this.descMeta = descMeta;
        this.valorMeta = valorMeta;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.concluida = concluida;
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

    public Float getValorMeta() {
        return valorMeta;
    }

    public void setValorMeta(Float valorMeta) {
        this.valorMeta = valorMeta;
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

    public Boolean getConcluida() {
        return concluida;
    }

    public void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }
}
