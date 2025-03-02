package genericitydemo2;

public interface Data<T> {
    void add(T t);

    void remove(T t);

    void update(T t);

    T query(T t);
}
