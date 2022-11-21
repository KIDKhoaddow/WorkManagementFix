package etc.vn.model.work.work_item;

import etc.vn.model.Status;
import etc.vn.model.work.State;
import etc.vn.model.work.detail.DetailProductBacklog;
import etc.vn.model.work.relatedWork.RelatedWork;

import java.util.Date;

public class ProductBacklog extends Work{
    private DetailProductBacklog detailProductBacklog;
    private String acceptanceCriteria;

    public ProductBacklog(Long id, String title, String description, State state, Long userId, Long projectId,
                          Date activityDate, RelatedWork relatedWork, DetailProductBacklog detailProductBacklog,
                          String acceptanceCriteria) {
        super(id, title, description, state, userId, projectId, activityDate, relatedWork);
        this.detailProductBacklog = detailProductBacklog;
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public DetailProductBacklog getDetailProductBacklog() {
        return detailProductBacklog;
    }

    public void setDetailProductBacklog(DetailProductBacklog detailProductBacklog) {
        this.detailProductBacklog = detailProductBacklog;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

}
