package etc.vn.manage.work;

import etc.vn.manage.IGeneral;
import etc.vn.model.work.work_item.Task;
import etc.vn.model.work.work_item.Work;

import java.util.List;

public interface IWorkManager extends IGeneral<Work> {

    List<Work> findWorkItemByUserId(Long id);

    List<Task> findTaskToDoOrNewByUserId(Long id);

    List<Task> findDoneTask(Long id);

}
