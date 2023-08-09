package shahbaz.java.dao;

import shahbaz.java.model.BaseDaoModel;

import java.util.List;

public interface GenericCrudDao<T extends BaseDaoModel> {

    public T save(T model);

    public T update(T model);

    public T findById(Integer id);

    public void delete(Integer id);

    public List<T> findAll();

}
