package persistence;

import java.util.List;

public interface IObjDao<T> {

    public void insert(T t);
    public void update(T t);
    public void delete(T t);
    public T search(T t);
    public List<T> list();

}