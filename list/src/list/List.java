package list;

/**
 * Created by ms on 2018. 1. 2..
 */
public interface List<T> {
    void add(T value);
    void addTo(T value, int idx);
    void remove(int idx);
    int size();
    T get(int idx);
    String toString();
}
