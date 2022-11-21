package etc.vn.model.work.detail;

import etc.vn.model.work.Activity;

public class DetailTask extends Detail{
    private  String teamEstimate;
    private String remainingWork;
    private String taskPoint;
    private Activity activity;

    public DetailTask(Long id, String priority, String teamEstimate, String remainingWork, String taskPoint, Activity activity) {
        super(id, priority);
        this.teamEstimate = teamEstimate;
        this.remainingWork = remainingWork;
        this.taskPoint = taskPoint;
        this.activity = activity;
    }
    public DetailTask(Long id, String priority) {
        super(id, priority);
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
    public String getPriority() {
        return super.getPriority();
    }

    @Override
    public void setPriority(String priority) {
        super.setPriority(priority);
    }
}
