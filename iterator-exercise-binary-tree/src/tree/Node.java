package tree;

/**
 * Classe Node com o parametro generito T, que estende Comparable<T>. Isso significa que
 * o tipo T deve ser comparável a si mesmo, permitindo que os nós sejam organizados de acordo
 * com seus valores.
 * @author Alex Sandro
 *
 * @param <T>
 */
public class Node<T extends Comparable<T>> {
    T value;
    Node<T> left;
    Node<T> right;

    Node(T value) {
        this.value = value;
        right = null;
        left = null;
    }
    
    public Node<T> getLeft(){
    	return left;
    }
    
    public Node<T> getRight(){
    	return right;
    }
    
    public String toString() {
    	return value.toString();
    }
   
    
    public int compareTo(Node<T> otherNode) {
    	return this.value.compareTo(otherNode.value);
    }
    
    @Override
    public Node<T> clone() {
        try {
            Node<T> clonedNode = new Node<>(this.value);
            if (this.left != null) {
                clonedNode.left = this.left.clone();
            }
            if (this.right != null) {
                clonedNode.right = this.right.clone();
            }
            return clonedNode;
        } catch (Exception e) {
            throw new AssertionError("Erro ao clonar node", e);
        }
    }
}

