package tree;

public class TreeIteratorFactory<T extends Comparable<T>> {

    public TreeIterator<T> createIterator(Node<T> root, String traversalType) {
        switch (traversalType.toLowerCase()) {
            case "preorder":
                return new PreOrderIterator<>(root);
            case "inorder":
                return new InOrderIterator<>(root);
            case "postorder":
                return new PostOrderIterator<>(root);
            default:
                throw new IllegalArgumentException("Unsupported traversal type: " + traversalType);
        }
    }
}
