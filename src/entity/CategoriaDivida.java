package entity;

public class CategoriaDivida {
    private Long id;
    private String nomeCategoriaDivida;

    public CategoriaDivida(Long id, String nomeCategoriaDivida) {
        this.id = id;
        this.nomeCategoriaDivida = nomeCategoriaDivida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoriaDivida() {
        return nomeCategoriaDivida;
    }

    public void setNomeCategoriaDivida(String nomeCategoriaDivida) {
        this.nomeCategoriaDivida = nomeCategoriaDivida;
    }
}
