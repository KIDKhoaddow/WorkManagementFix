package etc.vn.manage;

import java.util.List;

public  interface IGeneral <T>{
    void save(T t);

    void edit(int index, T t);

    boolean delete(Long idTask);

    List<T> findAll();

    T findById(Long id);
}
