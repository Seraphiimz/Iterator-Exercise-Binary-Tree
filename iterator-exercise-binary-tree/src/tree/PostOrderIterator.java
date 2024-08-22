package tree;

import java.util.Stack;

public class PostOrderIterator<T extends Comparable<T>> implements TreeIterator<T> {
    private Stack<Node<T>> stack1 = new Stack<>();
    private Stack<Node<T>> stack2 = new Stack<>();

    public PostOrderIterator(Node<T> root) {
        if (root != null) {
            stack1.push(root);
        }
        while (!stack1.isEmpty()) {
            Node<T> node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !stack2.isEmpty();
    }

    @Override
    public Node<T> next() {
        return stack2.pop();
    }
}
