package HomeWork_4.gb.list;

import HomeWork_4.gb.GBDeque;
import HomeWork_4.gb.GBList;
import java.util.Iterator;

public class GBLinkedList<T> implements GBDeque<T>, GBList<T> {
    private int size;
    {
        size = 0;
    }

    private GBNode<T> head;
    private GBNode<T> tail;

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public GBLinkedList(T head) {
        this();
        addFirst(head);
    }

    @Override
    public  boolean isEmpty() { return head == null; }
    
    // Метод добавления элемента в начало списка
    @Override
    public void addFirst(T t) {
        GBNode<T> temp = new GBNode<>(t);
        if (isEmpty()) tail = temp;
        else head.prev = temp;

        temp.next = head;
        head = temp;
        size++;
    }
    // Метод добавления элемента в конец списка
    @Override
    public void addLast(T t) {
        GBNode<T> temp = new GBNode<>(t);

        if (isEmpty()) head = temp;
        else tail.next = temp;

        temp.prev = tail;
        tail = temp;
        size++;
    }
    
    // Метод добавления элемента в список
    @Override
    public GBLinkedList<T> add(T t) {
        addLast(t);
        return this;
    }

    // Метод добавления элемента в список по индексу
    @Override
    public GBLinkedList<T> add(int i, T t) {
        if (i < 0 || i >= size) return this;
        
        GBNode<T> current = getNode(i);
        GBNode<T> temp = new GBNode<>(t, current.prev, current);
        current.prev.next = temp;
        current.prev = temp;
        return this;
    }
    // Метод удаления первого элемента из списка
    @Override
    public void removeFirst() {
        remove(0);
    }
    // Метод удаления последненго элемента из списка
    @Override
    public void removeLast() {
        remove(size - 1);
    }
    // Метод получения элемента по индексу
    @Override
    public T get(int i) {
        if (i < 0 || i >= size) return null;

        return getNode(i).data;
    }
    // Метод удаления элемента из списка по индексу
    @Override
    public void remove(int i) {
        GBNode<T> nodeToRemove = getNode(i);
        if (nodeToRemove == null) return;

        if (nodeToRemove != head) nodeToRemove.prev.next = nodeToRemove.next;
        else head = nodeToRemove.next;

        if (nodeToRemove != tail) nodeToRemove.next.prev = nodeToRemove.prev;
        else tail = nodeToRemove.prev;

        nodeToRemove.prev = nodeToRemove.next = null;
        size--;
    }
    // Метод получения размера списка
    @Override
    public int size() { return size; }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<>(head);
    }
    // Метод замены элемента по индексу
    @Override
    public void update(int i, T t) {
        GBNode<T> currentNode = getNode(i);
        currentNode.data = t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
            .append(this.getClass().getSimpleName());

        if (size < 1) return sb.toString();

        sb
            .append(" Size: ")
            .append(size)
            .append( " (");

        for (T el: this) {
            sb.append(el);
            sb.append(el == tail.data ? ")" : ", ");
        }

        return sb.toString();
    }

    public GBNode<T> getNode(int i) {
        GBNode<T> current = head;

        for (int pos = 0; current != null && pos < i; pos++) {
            current = current.next;
        }

        return current;
    }
}
