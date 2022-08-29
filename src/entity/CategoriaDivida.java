package entity;

public class CategoriaDivida {
    private Long id;
    private String nmCategoriaDivida;

    // constructor
    public CategoriaDivida(Long id, String nmCategoriaDivida) {
        this.id = id;
        this.nmCategoriaDivida = nmCategoriaDivida;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmCategoriaDivida() {
        return nmCategoriaDivida;
    }

    public void setNmCategoriaDivida(String nmCategoriaDivida) {
        this.nmCategoriaDivida = nmCategoriaDivida;
    }
}
