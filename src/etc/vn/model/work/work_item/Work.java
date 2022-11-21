package etc.vn.model.work.work_item;

import etc.vn.model.work.State;
import etc.vn.model.work.relatedWork.RelatedWork;

import java.util.Date;

public abstract class Work {
    private Long id;
    private String title;
    private String description;
    private State state;
    private Long userId;
    private Long projectId;
    private Date activityDate;
    private RelatedWork relatedWork;

    public Work(Long id, String title, String description, State state, Long userId, Long projectId,
                Date activityDate, RelatedWork relatedWork) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.state = state;
        this.userId = userId;
        this.projectId = projectId;
        this.activityDate = activityDate;
        this.relatedWork = relatedWork;
    }

    public RelatedWork getRelatedWork() {
        return relatedWork;
    }

    public void setRelatedWork(RelatedWork relatedWork) {
        this.relatedWork = relatedWork;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }
}
