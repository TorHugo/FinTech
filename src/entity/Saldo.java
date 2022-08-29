package entity;

import enums.EnumTipoSaldo;

import java.time.LocalDate;

public abstract class Saldo {
    private Long id;
    private Float valor;
    private String descValor;
    private LocalDate dataValor = LocalDate.now();
    private EnumTipoSaldo tipoSaldo;

    public Saldo(Long id, Float valor, String descValor, LocalDate dataValor, EnumTipoSaldo tipoSaldo) {
        this.id = id;
        this.valor = valor;
        this.descValor = descValor;
        this.dataValor = dataValor;
        this.tipoSaldo = tipoSaldo;
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

    public LocalDate getDataValor() {
        return dataValor;
    }

    public void setDataValor(LocalDate dataValor) {
        this.dataValor = dataValor;
    }

    public EnumTipoSaldo getTipoSaldo() {
        return tipoSaldo;
    }

    public void setTipoSaldo(EnumTipoSaldo tipoSaldo) {
        this.tipoSaldo = tipoSaldo;
    }
}
