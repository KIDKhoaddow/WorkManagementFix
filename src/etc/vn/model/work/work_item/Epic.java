package etc.vn.model.work.work_item;

import etc.vn.model.Status;
import etc.vn.model.work.State;
import etc.vn.model.work.detail.DetailEpic;
import etc.vn.model.work.relatedWork.RelatedWork;

import java.util.Date;

public class Epic extends Work {
    private String acceptanceCriteria;
    private RelatedWork relatedWork;
    private DetailEpic detailEpic;
    private Status status;
    public Epic(Long id, String title, String description, State state, Long userId, Long projectId, Date activityDate) {
        super(id, title, description, state, userId, projectId, activityDate);
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public State getState() {
        return super.getState();
    }

    @Override
    public void setState(State state) {
        super.setState(state);
    }

    @Override
    public Long getUserId() {
        return super.getUserId();
    }

    @Override
    public void setUserId(Long userId) {
        super.setUserId(userId);
    }

    @Override
    public Long getProjectId() {
        return super.getProjectId();
    }

    @Override
    public void setProjectId(Long projectId) {
        super.setProjectId(projectId);
    }

    @Override
    public Date getActivityDate() {
        return super.getActivityDate();
    }

    @Override
    public void setActivityDate(Date activityDate) {
        super.setActivityDate(activityDate);
    }
}
