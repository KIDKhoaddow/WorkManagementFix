package etc.vn.model.work.detail;

public abstract class Detail {
    private Long id ;
    private String priority;

    public Detail(Long id, String priority) {
        this.id = id;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
