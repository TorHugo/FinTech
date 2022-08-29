package entity;

public class CategoriaMeta {

    private Long id;
    private String nmCategoriaMeta;

    public CategoriaMeta(Long id, String nmCategoriaMeta) {
        this.id = id;
        this.nmCategoriaMeta = nmCategoriaMeta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmCategoriaMeta() {
        return nmCategoriaMeta;
    }

    public void setNmCategoriaMeta(String nmCategoriaMeta) {
        this.nmCategoriaMeta = nmCategoriaMeta;
    }
}
