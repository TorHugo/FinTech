package entity;

import enums.EnumTipoSaldo;

public class Deposito extends Saldo{
    public Deposito(Long id, Float valor, String descValor, String dataValor, EnumTipoSaldo tipoSaldo, Usuario usuario) {
        super(id, valor, descValor, dataValor, tipoSaldo, usuario);
    }
}
