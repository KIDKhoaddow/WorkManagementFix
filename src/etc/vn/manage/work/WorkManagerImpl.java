package etc.vn.manage.work;

import etc.vn.manage.IGeneral;
import etc.vn.model.work.State;
import etc.vn.model.work.work_item.Task;
import etc.vn.model.work.work_item.Work;

import java.util.ArrayList;
import java.util.List;

public class WorkManagerImpl implements IWorkManager {
    private static List<Work> workList = new ArrayList<>();

    @Override
    public void save(Work work) {
        workList.add(work);
    }

    @Override
    public void edit(int index, Work work) {
        workList.set(index, work);
    }

    @Override
    public boolean delete(Long idTask) {
        return workList.remove(idTask);
    }

    @Override
    public List<Work> findAll() {
        return workList;
    }

    @Override
    public Work findById(Long id) {
        for (Work element : workList) {
            if (element.getId().equals(id)) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List<Work> findWorkItemByUserId(Long id) {
        List<Work> list = new ArrayList<>();
        for (Work element : workList) {
            if (element.getUserId().equals(id)) {
                list.add(element);
            }

        }
        return list;
    }

    @Override
    public List<Task> findTaskToDoOrNewByUserId(Long id) {
        List<Task> list = new ArrayList<>();
        for (Work element : workList) {
            if (element.getUserId().equals(id) && !element.getState().equals(State.DONE)) {
                list.add((Task) element);
            }

        }
        return list;
    }

    @Override
    public List<Task> findDoneTask(Long id) {
        List<Task> list = new ArrayList<>();
        for (Work element : workList) {
            if (element.getUserId().equals(id) && element.getState().equals(State.DONE)) {
                list.add((Task) element);
            }

        }
        return list;
    }
}
