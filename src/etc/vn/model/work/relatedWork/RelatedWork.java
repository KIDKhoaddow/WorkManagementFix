package etc.vn.model.work.relatedWork;

public class RelatedWork {
    private  Long id;
    private  Long idParenWork;
    private  Long idChildWork;

    public RelatedWork(Long id, Long idParenWork, Long idChildWork) {
        this.id = id;
        this.idParenWork = idParenWork;
        this.idChildWork = idChildWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdParenWork() {
        return idParenWork;
    }

    public void setIdParenWork(Long idParenWork) {
        this.idParenWork = idParenWork;
    }

    public Long getIdChildWork() {
        return idChildWork;
    }

    public void setIdChildWork(Long idChildWork) {
        this.idChildWork = idChildWork;
    }
}
