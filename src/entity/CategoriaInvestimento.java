package entity;

public class CategoriaInvestimento {
    private Long id;
    private String nmCategoriaInvestimento;
    private String descCategoria;

    public CategoriaInvestimento(Long id, String nmCategoriaInvestimento, String descCategoria) {
        this.id = id;
        this.nmCategoriaInvestimento = nmCategoriaInvestimento;
        this.descCategoria = descCategoria;
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

    public String getDescCategoria() {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria) {
        this.descCategoria = descCategoria;
    }
}
