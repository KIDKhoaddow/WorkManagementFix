package etc.vn.model.work.work_item;

import etc.vn.model.work.State;
import etc.vn.model.work.detail.DetailTask;
import etc.vn.model.work.relatedWork.RelatedWork;

import java.util.Date;

public class Task extends Work {
    private DetailTask detailTask;

    public Task(Long id, String title, String description, State state, Long userId, Long projectId,
                Date activityDate, RelatedWork relatedWork, DetailTask detailTask) {
        super(id, title, description, state, userId, projectId, activityDate, relatedWork);
        this.detailTask = detailTask;
    }

    public DetailTask getDetailTask() {
        return detailTask;
    }

    public void setDetailTask(DetailTask detailTask) {
        this.detailTask = detailTask;
    }
}
