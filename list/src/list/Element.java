package list;

/**
 * Created by ms on 2018. 1. 2..
 */
public class Element<T> {
    private T value;
    private Element next;

    public boolean hasNext() {
        return next != null;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Element getNext() {
        return next;
    }
    public void setNext(Element next) {
        this.next = next;
    }

    public Element(T value) {
        this.value = value;
    }
    public String toString() {
        return value.toString();
    }
}
