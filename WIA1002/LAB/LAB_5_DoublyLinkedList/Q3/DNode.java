package WIA1002.LAB.LAB_5_DoublyLinkedList.Q3;

public class DNode<E> {
    E element;
    DNode<E> next;
    DNode<E> prev;

    public DNode(E element) {
        this(element, null, null);
    }

    public DNode(E element, DNode<E> next, DNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

}
