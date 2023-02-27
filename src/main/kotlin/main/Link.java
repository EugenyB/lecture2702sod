package main;

public class Link<T> {
    private Object data;
    private Link<T> next = null;
    private Link<T> prev = null;

    public Link(T data) {
        this.data = data;
    }

    public Link(T data, Link<T> next, Link<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return (T) data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Link<T> getNext() {
        return next;
    }

    public void setNext(Link<T> next) {
        this.next = next;
    }

    public Link<T> getPrev() {
        return prev;
    }

    public void setPrev(Link<T> prev) {
        this.prev = prev;
    }


}
