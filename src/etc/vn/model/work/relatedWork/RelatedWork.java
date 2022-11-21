package etc.vn.model.work.relatedWork;

import etc.vn.model.work.work_item.Work;

public class RelatedWork {
    private  Long id;
    private Work parenWork;
    private  Work childWork;

    public RelatedWork(Long id, Work parenWork, Work childWork) {
        this.id = id;
        this.parenWork = parenWork;
        this.childWork = childWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Work getParenWork() {
        return parenWork;
    }

    public void setParenWork(Work parenWork) {
        this.parenWork = parenWork;
    }

    public Work getChildWork() {
        return childWork;
    }

    public void setChildWork(Work childWork) {
        this.childWork = childWork;
    }
}
