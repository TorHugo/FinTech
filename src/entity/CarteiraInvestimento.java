package entity;

public class CarteiraInvestimento {
    private Long id;
    private Float valorTotal;

    public CarteiraInvestimento(Long id, Float valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
