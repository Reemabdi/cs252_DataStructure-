package prac;



public class SinglyLinkedList <E> {
    
   // private 
    private Node<E> head ; 
    private Node<E> tail ;
    private Node<E> curr;
    private Node<E> midd; 

    private int size ;

   public SinglyLinkedList (){
   head = head ;
   tail = tail; 
   curr = head ;
   size = 0 ;
}
public  SinglyLinkedList maxinpos1(SinglyLinkedList   <Integer>l1 , SinglyLinkedList  <Integer>l2){
    if (l1.head == null && l2.head == null)return null;
    
    Node curr1 = l1.head; 
    Node curr2 = l2.head;
    int num ;
    SinglyLinkedList l3 = new SinglyLinkedList<>();
    while ( curr1.next()!= null && curr2.next()!= null ){
        if ((Integer)curr1.getElement()>(Integer) curr2.getElement()){
       num = (Integer)curr1.getElement();
        }else{
       num =(Integer)curr2.getElement(); }
       Node n =  new Node(num);
        if (l3.head==null){
        head = new Node(n); 
        }else{
        n.setnext(null);
        tail.setnext(n);
        tail= n ;}
        
    }
    if ( curr1.next()!= null || curr2.next()!= null){
    num = (Integer)curr1.getElement();
    }else{
    num =(Integer)curr2.getElement(); }
    Node n =  new Node(num);
    n.setnext(null);
    tail.setnext(n);
    tail= n ;
    
    
    
    return l3;
    
      
    }

public int size (){
    return size;
}

public boolean isEmpty (){
    return size == 0 ;
} 

public E first (){
    if (isEmpty())
    return null;

    return head.getElement();
}
public E last (){
if (isEmpty())
return null;

return tail.getElement();

}

public void addfirst(E e){
   if ( size == 0 )
   tail = head ;
Node news = new Node<E>(e);
 
 news.setnext(head); 
head = news;

size++;
}

public void addlast(E e){
    Node news = new Node<E>(e);
    news.setnext(null);
    if (isEmpty())
   head = news;

 news = tail.next();
tail = news;

size++;
}
public E removef (){
    E x = head.getElement();
    if (isEmpty())
    return null;

    head = head.next();
    size --;

    if (size == 0){
        tail = null ;
    }
    return x;
}

public void print (){
curr =head ;

while (curr!= null){
    System.out.println(curr.getElement());
    curr= curr.next();
}
}

public void removem(E e){
    if (isEmpty())
    return ;
curr = head ;

//while (curr.next() != e )

}

//////////////////////////////////////////////////////////////////

public E firstt (){
    if (isEmpty())
    return null ;

    return head.getElement();
}

public E lastt (){
    if ( isEmpty())
    return null ; 

    return tail.getElement();

}


public void addl (E e ){
    
 Node n = new Node<E>(e , null); 

if ( isEmpty())
  head = n;

  n = tail.next();
  tail.setnext(n) ;

  tail = n ;
  size ++;

}

public E remf ()
{if (isEmpty())
    return null ;

    if ( head == tail)
    head = tail = null;

    E x = head.getElement();
    head = head.getnext();

    size --;
    return x;

}

public void add (E e , int ind ){
    if (ind < 0 || ind> size){
    System.out.println("out pu");
return;}

Node n = new Node<E>(e , null);

if (ind == 0 ){
head = head.getnext();
n.setnext(head);

head = n;

if (tail == null ){
    head = tail ;
}
}

curr = head ;
for( int i = 0 ; i < ind-1 ; i++)
curr = curr.next();

n.setnext(curr.getnext());

curr.setnext(n);

size++;

}

public E removelast (int ind){
    if (ind < 0 || ind> size){
        System.out.println("out pu");
    return null;}

    if (ind == 0){
removef();
    }
curr = head ;

for (int i = 0 ; i < ind-1 ; i++)
curr = curr.getnext();

E x = curr.getnext().getElement();

curr = curr.getnext().getnext();

size--;
return x ;

}
public int summaxmin (SinglyLinkedList list ){
    if (list.isEmpty())
    return -1 ;
curr= head;
int max ,min ;
max = min= (Integer) curr.getElement();
    while (curr != null){
        if ((Integer)curr.getElement() > max )
         max = (Integer)curr.getElement() ;
curr = curr.next();    }
while (curr != null){
    if ((Integer)curr.getElement() < min )
     min = (Integer)curr.getElement() ;
curr = curr.next();    }

int sum = max + min ;
    return sum;
}

public void addaftermin (int x ){
    if (isEmpty()) return;

    if (head == tail)
    head.next().setElement(x);

curr = head ;
int min = (Integer)curr.getElement();
    while (curr != null){
        if ((Integer)curr.getElement() < min )
         min = (Integer)curr.getElement() ;
    curr = curr.next();    }

   while ((Integer)curr.next().getElement() != min ){
    curr = curr.next() ;
   }
   curr.next().setElement(x);
}

public void delemax(){
    if (isEmpty())
    return;
    if ( head.next()== null)
    head=null;
int max = (Integer)curr.getElement();
    while (curr!= null )
    {
        if ((Integer)curr.getElement() > max )
        max = (Integer)curr.getElement();
        curr.getnext();
    }
    while ((Integer)curr.getElement()!= max ){
        curr =curr.next();
    }
  curr.setnext(curr.next().next());
  size--;
}
public void copress(){
    if ( size < 2)
    return ;
while (curr != null)
{
    if ( curr.getElement() == curr.getnext().getElement())
    curr.setnext(curr.next().next());
    curr =curr.next();
}
size--;
}
public void insetafteanoth ( int x ,int y){
    Node n = new Node(x);
    if ( head == null )
    head = new Node (x);

    while (curr.next()!= null) {
    if ((Integer)curr.getElement() != y ) {
        tail.setnext(n); 
        tail= n;
    }
    if ((Integer)curr.getElement() == y ){
    n.setnext(curr.getnext());
curr.setnext(n);
    }
curr =curr.next();

    }
    size++;
}
public Node<E> middl(){
    if ( head == null && head.getnext()== null)
    return null;
int nsize = size / 2;

for (int i = 0 ; i< nsize ; i++)
curr = curr.next();

if ( size %2 == 1)
curr=curr.next();
return curr.getnext();
}
public void doublvalue(int x ){
    Node n = new Node (x);
    if ( head == null )
    return;

    while (curr.next() != null)
    {
        if ((Integer)curr.getElement()== x ){
             if (curr.next()== tail){
             n.setnext(null);
             tail.setnext(n);
             tail= n;}
             n.setnext(curr.getnext());
             curr.setnext(n);
             curr= curr.next().next();
        }
        else 
       curr= curr.next();
    }
}

public void evenoddsplit(){
    SinglyLinkedList s1 = new SinglyLinkedList<>();
    SinglyLinkedList s2 = new SinglyLinkedList<>();
    if ( head != null)
    return;

    while ( curr.next() != null)
    {
        if ( (Integer)curr.getElement() % 2==0)
{
    //s1.addLast(curr.getElement());
}
//else s2.addLast(curr.getElement());
curr= curr.next();
    }

}

public  SinglyLinkedList maxinpos(SinglyLinkedList   <Integer>l1 , SinglyLinkedList  <Integer>l2){
if (l1.head == null && l2.head == null)return null;

Node curr1 = l1.head; 
Node curr2 = l2.head;
int num ;
SinglyLinkedList l3 = new SinglyLinkedList<>();
while ( curr1.next()!= null && curr2.next()!= null ){
    if ((Integer)curr1.getElement()>(Integer) curr2.getElement()){
   num = (Integer)curr1.getElement();
    }else{
   num =(Integer)curr2.getElement(); }
   Node n =  new Node(num);
    if (l3.head==null){
    head = new Node(n); 
    }else{
    n.setnext(null);
    tail.setnext(n);
    tail= n ;}
    
}
if ( curr1.next()!= null || curr2.next()!= null){
num = (Integer)curr1.getElement();
}else{
num =(Integer)curr2.getElement(); }
Node n =  new Node(num);
n.setnext(null);
tail.setnext(n);
tail= n ;

return l3;
  
}





public static void main(String[] args) {
    SinglyLinkedList<Integer> s = new SinglyLinkedList();
    SinglyLinkedList <Integer>s1 = new SinglyLinkedList();
    SinglyLinkedList<Integer> s2 = new SinglyLinkedList();


    //s.addFirst(5);
    // s.add(10, 1);
    // s.add(15, 2);
   // System.out.println( s.size());
    s.addlast(1);
    s.addlast(2);
    s.addlast(0);
    s1.addlast(5);
    s1.addlast(1);
    s1.addlast(4);
     s2=s2.maxinpos(s1, s);
    
    s2.print();
}




























}
