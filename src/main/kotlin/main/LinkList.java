package main;

public class LinkList<T> {
    private Link<T> first;
    private Link<T> last;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(T element) {
        Link<T> temp = new Link<>(element);
        if (isEmpty()) {
            last = temp;
        } else {
            temp.setNext(first);
            first.setPrev(temp);
        }
        first = temp;
    }

    public void addLast(T element) {
        Link<T> temp = new Link<>(element);
        if (isEmpty()) {
            first = temp;
        } else {
            temp.setPrev(last);
            last.setNext(temp);
        }
        last = temp;
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Link<T> temp = first;
        first = first.getNext();
        if (first != null) {
            first.setPrev(null);
        } else {
            last = null;
        }
        return temp.getData();
    }

    public T removeLast() {
        if (isEmpty()) {
            return null;
        }
        Link<T> temp = last;
        last = last.getPrev();
        if (last != null) {
            last.setNext(null);
        } else {
            first = null;
        }
        return temp.getData();
    }

    public boolean contains(T element) {
        return find(element) != null;
    }

    private Link<T> find(T element) {
        if (isEmpty()) return null;
        Link<T> curr = first;
        while (curr != null) {
            if (curr.getData().equals(element)) {
                return curr;
            }
            curr = curr.getNext();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Link<T> curr = first;
        while (curr != null) {
            T data = curr.getData();
            sb.append(data);
            if (curr!=last) sb.append(", ");
            curr = curr.getNext();
        }
        sb.append("]");
        return sb.toString();
    }

    public void remove(T element) {
        if (isEmpty()) return;
        Link<T> forDelete = find(element);
        if (forDelete==null) return;
        Link<T> prev = forDelete.getPrev();
        Link<T> next = forDelete.getNext();
        if (prev == null) {
            first = next;
        }
        if (next == null) {
            last = prev;
        }
        if (prev!=null) prev.setNext(next);
        if (next!=null) next.setPrev(prev);
    }
}
