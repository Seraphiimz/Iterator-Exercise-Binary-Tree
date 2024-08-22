package tree;

import java.util.Stack;

public class PreOrderIterator<T extends Comparable<T>> implements TreeIterator<T> {
    private Stack<Node<T>> stack = new Stack<>();

    public PreOrderIterator(Node<T> root) {
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Node<T> next() {
        if (!hasNext()) return null;

        Node<T> currentNode = stack.pop();
        if (currentNode.right != null) {
            stack.push(currentNode.right);
        }
        if (currentNode.left != null) {
            stack.push(currentNode.left);
        }
        return currentNode;
    }
}
