package entity;

import enums.EnumTipoSaldo;

import java.time.LocalDate;
import java.util.Date;

public class NovaCategoriaSaldo extends Saldo{
    private Long id;
    private String nmCategoria;
    private String descCategoria;
    private String corCategoria;

    public NovaCategoriaSaldo(Long idUsuario, Float valor, String descValor, String dataValor, EnumTipoSaldo tipoSaldo, Usuario usuario) {
        super(idUsuario, valor, descValor, dataValor, tipoSaldo, usuario);
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
