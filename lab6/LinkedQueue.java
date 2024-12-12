package lab6;

import lab5.LinkedStack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author master
 */
public class LinkedQueue<E> {
    private SinglyLinkedList<E>list=new SinglyLinkedList();
    public LinkedQueue(){}
    public boolean isEmpty(){return list.isEmpty();}
    public void enqueue(E element){list.addLast(element);}
    public E first(){return list.first();}
    public E dequeue(){return list.removeFirst();}
    public int size(){return list.size();}
    // private patient[] list() {
    //     return null;
    // }





    // public void nth (int idu){
    //     boolean personFound = false;
    //     for (patient p :list() ) {
    //         if (p.getId()== idu) {
    //             personFound = true;
               
             
    //         }
    //     }
       
    //     if (personFound) {
    //         System.out.println("Prescription for " + patient.getName() );
    //         System.out.print(prescriptions.print());
    //     } else {
    //         System.out.println("Person not found in queue");
    //     }
    // }

    public int secmax(LinkedQueue q){
if (q.isEmpty())return -1 ;

int max = 0 ; 
int secmax = 0 ;
LinkedQueue q1 = new LinkedQueue<>();
while(!q.isEmpty()){
    if ((Integer)q.first() > max )
    max = (Integer)q.first();
q1.enqueue(q.dequeue());
}
while (!q1.isEmpty()){
    if ((Integer)first() > secmax  && (Integer)first() != max  ){
secmax = (Integer) first() ;
q.enqueue(q1.dequeue());
    }
}
return secmax;
}
public boolean isfound (LinkedQueue q , int x ){
    if (q.isEmpty()) return false;
int y ;
boolean c = false ;
int s = q.size();
   for (int i = 0; i <s ; i++) {
      y =  (Integer)q.dequeue();
      if ( y == x)
      c= true ;
    
      q.enqueue(y);
    }
    return c;

}
public void delnum (LinkedQueue q , int num){
if (q.isEmpty())return ; 

if (num < 0 )return ;
LinkedQueue w = new LinkedQueue<>();
while (!q.isEmpty()){
    int y= (Integer)q.dequeue();
if (y != num )
w.enqueue(y);
}



}
public void deled(LinkedQueue q){
    if ( isEmpty()) return ;
    LinkedQueue w = new LinkedQueue<>();
    while(!q.isEmpty()){
       //if ( (Integer) first() ==  )
    }
}
public void swaptwo (LinkedQueue q ){
    if(isEmpty()) return ;
    LinkedQueue w = new LinkedQueue<>();

    while (!q.isEmpty()){
        int y= (Integer)q.dequeue();
        int x= (Integer)q.dequeue();

        w.enqueue(x);
        w.enqueue(y);
        
    }
    while(!w.isEmpty()){
        q.enqueue(w.dequeue());
    }
System.out.println(q);
    
}
public void rever(LinkedQueue <Character> q){
    if(q.isEmpty()) return;
LinkedStack<Character> s = new LinkedStack<>();
LinkedQueue<Character> q1 = new LinkedQueue<>();
    char c ; 
    while (!q.isEmpty()){
        c = q.dequeue();
        if (Character.isLetter(c))
           q1.enqueue(c);
           else 
           s.push(c);
    }
    while (!s.isEmpty()){
       q.enqueue(q1.dequeue());
       q.enqueue(s.pop());
    }
    System.out.println(q);
}
public void print(LinkedQueue q){
    while (!q.isEmpty()){
        System.out.println(q.dequeue());
    }
}
public void movemaxfro(LinkedQueue q){
    if (q.isEmpty())return ; 
    LinkedQueue q1 = new LinkedQueue<>();

    int max = 0 ;

    while (!q.isEmpty()){
        int x = (Integer)q.dequeue();
    if (x> max ){
        max = x ;
    }
    q1.enqueue(x);
    
    }
    int n = q1.size();
    for (int i = 0; i < n; i++) {
        int x = (Integer)q1.dequeue();
    if (x == max)
    q.enqueue(x);

    q1.dequeue();
    }

    
    while (!q1.isEmpty()){
        q.enqueue(q1.dequeue());
    }
    
}
public void Deleat(LinkedQueue<Integer>q, int k){

    if(q.isEmpty()){
    return;}
   
    LinkedQueue<Integer> Temp=new LinkedQueue<>();
    int x ;
    
    for(int i=0;i<q.size();i++){

        x=(Integer)q.dequeue();
        if(x==k){
            q.dequeue();
        

       q.enqueue(x);
    }
}
}

public static void main(String[] args) {
    LinkedQueue q= new LinkedQueue<>();
q.enqueue(9);
q.enqueue(8);
q.enqueue(8);
q.enqueue(7);
q.enqueue(4);
q.enqueue(5);

q.movemaxfro(q);
q.Deleat(q, 5);
q.print(q);
}}
    

