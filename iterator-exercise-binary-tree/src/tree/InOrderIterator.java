package tree;

import java.util.Stack;

public class InOrderIterator<T extends Comparable<T>> implements TreeIterator<T> {
    private Stack<Node<T>> stack = new Stack<>();
    private Node<T> currentNode;

    public InOrderIterator(Node<T> root) {
        currentNode = root;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty() || currentNode != null;
    }

    @Override
    public Node<T> next() {
        while (currentNode != null) {
            stack.push(currentNode);
            currentNode = currentNode.left;
        }

        currentNode = stack.pop();
        Node<T> node = currentNode;
        currentNode = currentNode.right;

        return node;
    }
}
