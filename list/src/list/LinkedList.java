package list;

import java.util.StringJoiner;

/**
 * Created by ms on 2018. 1. 2..
 */
public class LinkedList<T> implements List<T> {
    private Element<T> head;

    private boolean hasHead() {
        return head != null;
    }

    private Element getLastElement() {
        Element currentElement = head;

        while(currentElement.hasNext()) {
            currentElement = currentElement.getNext();
        }

        return currentElement;
    }
    private Element getElementByIdx(int idx) {
        Element currentElement = head;

        for(int i=0; i < idx; i++) {
            currentElement = currentElement.getNext();
        }

        return currentElement;
    }

    @Override
    public void add(T value) {
        Element element = new Element(value);
        if(!hasHead()) {
            head = element;
            return;
        }

        Element lastElement = getLastElement();
        lastElement.setNext(element);
    }

    @Override
    public void addTo(T value, int idx){
        if(idx >= size()) {
            return;
        }
        Element element = new Element(value);

        if(idx == 0) {
            element.setNext(head);
            head = element;
            return;
        }

        Element beforeElement = getElementByIdx(idx - 1);
        element.setNext(beforeElement.getNext());
        beforeElement.setNext(element);
    }

    @Override
    public void remove(int idx) {
        if(idx >= size()) {
            return;
        }
        if(idx == 0) {
            head = head.getNext();
            return;
        }

        Element beforeElement = getElementByIdx(idx - 1);
        beforeElement.setNext(beforeElement.getNext());
    }

    @Override
    public int size() {
        int size = 0;
        Element currentElement = head;

        while(true) {
            if(currentElement != null) {
                currentElement = currentElement.getNext();
                size += 1;
            } else {
                break;
            }
        }

        return size;
    }

    @Override
    public T get(int idx) {
        return (T) getElementByIdx(idx).getValue();
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        Element currentElement = head;

        while(currentElement != null) {
            sj.add(currentElement.getValue().toString());
            currentElement = currentElement.getNext();
        }

        return sj.toString();
    }
}
