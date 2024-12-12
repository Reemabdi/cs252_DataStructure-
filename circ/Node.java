package circ;
class Node<E> {		
    E element;       
    Node<E> next;    
public Node(){}
   public Node(E data) {
       this.element = data;
   }

   public Node(E element, Node<E> next) {
       this.element = element;
       this.next = next;
   }

   public E getElement() {
       return element;
   }

   public void setElement(E element) {
       this.element = element;
   }

   public Node<E> getNext() {
       return next;
   }

   public void setNext(Node<E> next) {
       this.next = next;
   }
   
   
}
