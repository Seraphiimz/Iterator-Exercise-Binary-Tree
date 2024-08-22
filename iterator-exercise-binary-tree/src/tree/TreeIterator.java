package tree;

public interface TreeIterator<T extends Comparable<T>> {
    boolean hasNext();
    Node<T> next();
}
