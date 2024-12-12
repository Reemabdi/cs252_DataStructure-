package prac;

public class circ<E> {
    class Node <E>{
        private Node<E> next ; 
        private E element ;

        public Node (E em){
element= em;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }
        

        
    }
    private Node <E> tail= null ; 
    private int size ;

    public circ(){}

public int size (){
    return size;
}
public boolean isEmpty()
{
    return size == 0 ;
}
public E first (){
    if (isEmpty())return null ;

    return tail.getNext().getElement();
}
public E last (){
    if (isEmpty())return null ;

    return tail.getElement();
}
public void rotate(){
    if ( tail!= null)
    tail=tail.getNext();
}
public void addfirst(E e){
if (size==0) {
   // tail=new Node(e, null);
    tail.setNext(tail);

}
else {
  //  Node <> n = new Node<E>( e ,tail.getNext());
   tail.setNext(tail);


}
size++;
}
 public E removef (){
    if ( isEmpty())return null;

    if ( tail.getNext() == tail){
        tail= null;
    }

    E x=tail.getNext().getNext().getElement();
    tail.setNext(tail.getNext().getNext());
    size--;

    return x; 
 }   

 public E reovel (){
    if (isEmpty()) return null ;

    E x = tail .getElement();
    if (tail == tail.getNext())
    tail =null;

    Node curr= tail.getNext();

    while ( curr!= tail)
    tail= curr;
   



    size --;
    return x;
 }
}
