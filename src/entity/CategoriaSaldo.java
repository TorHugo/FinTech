package entity;

import enums.EnumTipoCategoria;
import enums.EnumTipoSaldo;

import java.time.LocalDate;

public class CategoriaSaldo extends Saldo{
    private Long id;
    private EnumTipoCategoria tipoCategoria;

    public CategoriaSaldo(Long id, Float valor, String descValor, LocalDate dataValor, EnumTipoSaldo tipoSaldo, Long id1, EnumTipoCategoria tipoCategoria) {
        super(id, valor, descValor, dataValor, tipoSaldo);
        this.id = id1;
        this.tipoCategoria = tipoCategoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnumTipoCategoria getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(EnumTipoCategoria tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }
}

