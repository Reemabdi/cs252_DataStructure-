package prac;

import javax.swing.text.html.parser.Element;

import lab4.DoublyLinkedList;

public class doubl <E> {

   private static class Node<E> {
    private E element; 
    private Node<E> prev;
    private Node <E> next ;

    public Node (E element ,Node<E> prev,Node <E> next){
       this.element = element ;
       this.next= next ;
       this.prev= prev;

    }
    public void setElement (E e){
        this.element= e;
    }
    public E getelemE (){
        return element;
    }
    public Node<E> getPrev() {
        return prev;
    }
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> next) {
        this.next = next;
    }
   
    }
private Node <E> header ; 
private Node <E> tailer ;
private int size ;
private Node <E> curr;
    public doubl ( E element ,Node<E> prev,Node <E> next){
        element = element ;
        next= next ;
        prev= prev;

        Node head = new Node<E>(element, header, header.next);
        Node tail = new Node<E>(element, tailer.prev, tailer);
    }
    public int size (){
        return size ;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public E first (){
        if (isEmpty())
        return null;
    
        return header.getNext().getelemE();
    }
    public E last (){
        if ( isEmpty())
        return null;

        return tailer.getPrev().getelemE();
    }
    public void addfirst(E x){
     addbetween(x, header, header.getNext());
    }
    public void addlast (E e){
        addbetween(e, tailer.getPrev(), tailer);
    }
    public void addbetween(E e ,Node <E> pres , Node <E> secc ){
        Node n = new Node<E>(e, pres, secc);
        pres.setNext(n);
        secc.setPrev(n);
        size++;
    }
    public void removef(){
        if (isEmpty())
        return ;
        remove(header .getNext());
    }
    public void removel(){
        if (isEmpty())
        return ;
        remove(tailer .getPrev ());
    }


    public E remove (Node <E> n ){
        Node <E> secc = n.getNext();
        Node <E> pres = n.getPrev();

        secc.setPrev(pres);
        pres.setNext(secc);

       return  n.getelemE();
    }
    public E midpand(){
if ( header.next==null) return null;

curr = header ;
Node curr2= tailer;
while (curr.next != curr2.prev ){
curr= curr.getNext();
curr2= curr2.getPrev();
}
return curr.getNext().getelemE();


    }

    public void swaplistpair(){
        if (header.getNext()==null) return ;
int count =0 ;
        while ( curr.getNext()!= null){
            E x = curr.getelemE();
            E y = curr.getNext().getelemE();

            curr.setElement(y);
            curr.getNext().setElement(x);
            curr= curr.next.next;
            count ++;
        }
    }
    public void betwnum(){
        if (header.getNext()==null) return ;
        int num ;
        while (curr.getNext()!= tailer){
            if(curr.getelemE() == curr.getNext().getNext().getelemE())
       num  =   (Integer)curr.getNext().getelemE();
      // System.out.println(num);
curr= curr.getNext();
        }
    }

    public void marge(doubl d1 , doubl d2){
        if (d1.header.getNext()== null && d2.header.getNext()== null )return ;

        d1.tailer.setNext(d2.header);
        d2.header.setPrev(tailer);

        d1.tailer= d2.tailer;
        
    }

}
