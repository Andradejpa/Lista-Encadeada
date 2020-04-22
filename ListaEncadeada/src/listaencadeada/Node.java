package listaencadeada;

/**
 *
 * @author Joao Pedro
 */
public class Node {

    private int info;
    private Node next;

    public Node(int num) {

        this.info = num;

    }

    public Node getNext() {
        return next;
    }

    public int getInfo() {
        return this.info;
    }

    public void setNext(Node n) {
        this.next = n;
    }

}
