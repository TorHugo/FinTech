package entity;

import enums.EnumTipoCategoria;
import enums.EnumTipoSaldo;

import java.time.LocalDate;
import java.util.Date;

public class CategoriaSaldo extends Saldo{
    private Long id;
    private EnumTipoCategoria tipoCategoria;

    public CategoriaSaldo(
                            Long idSaldo,
                            Float valor,
                            String descValor,
                            String dataValor,
                            EnumTipoSaldo tipoSaldo,
                            Usuario usuario,
                            Long id1,
                            EnumTipoCategoria tipoCategoria
                            ) {
        super(idSaldo, valor, descValor, dataValor, tipoSaldo, usuario);
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

