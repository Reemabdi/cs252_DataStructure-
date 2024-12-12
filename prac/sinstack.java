package prac;

import lab5.LinkedStack;

class sinstack<E> {

int size;
Node <E> head ;
Node <E> tail ;
public int size(){
    return size;
}
public boolean isempty (){
    return size == 0 ;
}
public void addfirst (E ele){
head = new Node<>(ele, head);

if(isempty())
head = tail ;
size++;

}
public E first (){
    if (isempty())
    return null ;
    return head.getElement();
}

public E removef(){
if (isempty())return null ;
E x = head.getElement();

head = head.next();
if ( size == 0 )
tail = null;
size --;
return x;
}
    }
class stack <E>{

    sinstack <E>list = new sinstack();
    public stack (){}

    public int siz (){
       return list.size();
    }

    public boolean i (){
        return list.isempty();
    }
    public void push (E e){
        list.addfirst(e);
        
    }
    public E top ()
{
    return list.first();

}
public E pop (){
    return list.removef();
}
public void delenumL(LinkedStack s , int x){
LinkedStack s1 = new LinkedStack<>();

while (!s.isEmpty()){
  int num = (int)s.pop();
  if (num != x)
  s1.push(num);
}
while (!s1.isEmpty())
s.push(s1.pop());
}
public int max (LinkedStack s){
    int max = (int)s.top();
    LinkedStack s1 = new LinkedStack<>();
    while(!s.isEmpty())
    {
        if ((int)s.top()> max )
        max =(int) s.top();
s1.push(s.pop());
    }
    while (!s1.isEmpty())
s.push(s1.pop());
    return max;

}
public void arrngestck(LinkedStack s){
    if(s.isEmpty())return ;

    LinkedStack t = new LinkedStack<>();
    LinkedStack t1 = new LinkedStack<>();
    int x ;

    while (!s.isEmpty()){
        x=(Integer)s.pop();
     if(x%2== 0)
     t.push(x)   ;
     else 
     t1.push(x);
    }
    while(!t.isEmpty())
    t1.push(t.pop());
    
}
public void sumevenarr(LinkedStack s , int a , int b ){
    if (s.isEmpty())return ;
    if (a<0 && b < 0) return ;
    int sum=0 ;
    int x ;
    while (!s.isEmpty()){
        x=(Integer) s.pop();
        if (x >= a && x <= b  ){
        if (x%2 == 0){
        sum =+ x;
    s.push(x);
        }}   
    }
    s.push(sum);

}
public void multipop(LinkedStack s , int x ){
    if (s.isEmpty()) System.out.println("emp");
if(x>s.size())return;
    int z = s.size();
    LinkedStack t = new LinkedStack<>();
    while (!s.isEmpty()){
        t.push(s.pop());
    }
    for (int i = 0; i < x; i++) {
        t.pop();
       
    }
}

}
