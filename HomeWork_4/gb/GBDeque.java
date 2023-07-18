package HomeWork_4.gb;

public interface GBDeque<T> extends Iterable<T>{
    boolean isEmpty();
    void addFirst(T t);
    void addLast(T t);
    void removeFirst();
    void removeLast();
}
