package entity;

import enums.EnumTipoSaldo;

import java.time.LocalDate;

public class NovaCategoriaSaldo extends Saldo{
    private Long id;
    private String nmCategoria;
    private String descCategoria;
    private String corCategoria;

    public NovaCategoriaSaldo(Long id, Float valor, String descValor, LocalDate dataValor, EnumTipoSaldo tipoSaldo, Long id1, String nmCategoria, String descCategoria, String corCategoria) {
        super(id, valor, descValor, dataValor, tipoSaldo);
        this.id = id1;
        this.nmCategoria = nmCategoria;
        this.descCategoria = descCategoria;
        this.corCategoria = corCategoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmCategoria() {
        return nmCategoria;
    }

    public void setNmCategoria(String nmCategoria) {
        this.nmCategoria = nmCategoria;
    }

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }

    public String getCorCategoria() {
        return corCategoria;
    }

    public void setCorCategoria(String corCategoria) {
        this.corCategoria = corCategoria;
    }
}
