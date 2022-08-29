package entity;

public class CategoriaInvestimento {
    private Long id;
    private String nmCategoriaInvestimento;

    public CategoriaInvestimento(Long id, String nmCategoriaInvestimento) {
        this.id = id;
        this.nmCategoriaInvestimento = nmCategoriaInvestimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmCategoriaInvestimento() {
        return nmCategoriaInvestimento;
    }

    public void setNmCategoriaInvestimento(String nmCategoriaInvestimento) {
        this.nmCategoriaInvestimento = nmCategoriaInvestimento;
    }
}
