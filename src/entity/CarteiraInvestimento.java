package entity;

public class CarteiraInvestimento {
    private Long id;
    private Float valorTotalInvestido;

    public CarteiraInvestimento(Long id, Float valorTotalInvestido) {
        this.id = id;
        this.valorTotalInvestido = valorTotalInvestido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorTotalInvestido() {
        return valorTotalInvestido;
    }

    public void setValorTotalInvestido(Float valorTotalInvestido) {
        this.valorTotalInvestido = valorTotalInvestido;
    }
}
