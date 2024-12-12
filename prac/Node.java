package prac;

public class Node <E> {
   private E Element ;
   private Node<E> next ;

   
   public Node (E Element ,  Node<E> next){
    this.Element = Element ;
    this.next = next;
   }

   public Node(E e) {
}

public void setElement (E Element){
    this.Element = Element ;
   }

   public E getElement (){
   return Element;
   }

   public void setnext (Node <E> next){
    this.next = next;
   }

   public Node <E> getnext (){
    return next;
   }

   public Node next (){
return next ;
   }

   public String getvalu(){
    return null;
   }
   }
