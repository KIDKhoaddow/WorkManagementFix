package etc.vn.model.work.work_item;

import etc.vn.model.Status;
import etc.vn.model.work.State;
import etc.vn.model.work.detail.DetailEpic;
import etc.vn.model.work.relatedWork.RelatedWork;

import java.util.Date;

public class Epic extends Work {
    private String acceptanceCriteria;
    private DetailEpic detailEpic;
    private Status status;

    public Epic(Long id, String title, String description, State state, Long userId, Long projectId, Date activityDate,
                RelatedWork relatedWork, String acceptanceCriteria, DetailEpic detailEpic, Status status) {
        super(id, title, description, state, userId, projectId, activityDate, relatedWork);
        this.acceptanceCriteria = acceptanceCriteria;
        this.detailEpic = detailEpic;
        this.status = status;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public DetailEpic getDetailEpic() {
        return detailEpic;
    }

    public void setDetailEpic(DetailEpic detailEpic) {
        this.detailEpic = detailEpic;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
