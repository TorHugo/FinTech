package entity;

public class CategoriaMeta {
    private Long id;
    private String nomeCategoriaMeta;

    public CategoriaMeta(Long id, String nomeCategoriaMeta) {
        this.id = id;
        this.nomeCategoriaMeta = nomeCategoriaMeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoriaMeta() {
        return nomeCategoriaMeta;
    }

    public void setNomeCategoriaMeta(String nomeCategoriaMeta) {
        this.nomeCategoriaMeta = nomeCategoriaMeta;
    }
}
