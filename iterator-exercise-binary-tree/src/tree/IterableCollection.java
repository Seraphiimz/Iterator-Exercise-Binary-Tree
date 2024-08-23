package tree;

public interface IterableCollection<T extends Comparable<T>> {
	TreeIterator<T> createIterator(String traversalType);

}
