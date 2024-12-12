package circ;
public class CLList {

    Node tail;

    public CLList() {
        tail = null;
    }
//basic operations 
//======================================

    public void addFirst(char item) {
        Node temp = new Node(item,null);

        if (tail == null) {
            tail = temp;
            tail.setNext( tail);
        } else {
            temp.setNext( tail.getNext());
            tail.setNext(temp); 

        }
    }

//======================================
    public void addLast(char item) {
        Node temp = new Node(item,null);
        if (tail == null) {
            tail = temp;
            tail.setNext(tail);
        } else {
            temp.setNext( tail.getNext());
            tail.setNext(temp); 
            tail = tail.getNext();
        }
    }
//======================================

    public void removeFirst() {
        if (tail == null) {
            return;
        }
        if (tail.getNext() == tail) {
            tail = null;
        } else {
            tail.setNext( tail.getNext().getNext());
        }
    }

//======================================
    public void removeLast() {
        Node curr = tail;
        while (curr.getNext() != tail) {
            curr = curr.getNext();
        }

        curr.setNext(tail.getNext());
        tail = curr;

    }

//=============================================
    public void print() {
        System.out.println("-----------");
        if (tail == null) {
            return;
        }
        Node curr = tail.getNext();
        while (curr != tail) {
            System.out.println(curr.getItem());
            curr = curr.getNext();
        }
        System.out.println(curr.getItem());
    }
//===============================================
    
    
    
    public CLList reverse() {
      if(tail==null||tail.getNext()==tail)
        return null;
      
        CLList res = new CLList();

        Node temp = tail.getNext();

while(temp!=tail){
    res.addFirst(temp.getItem());
    temp=temp.getNext();
}

res.addFirst(temp.getItem());
        return res;
    }

    
////======================================
    public CLList oddIndexes() {
      if(tail==null||tail.getNext()==tail)
        return null;
      
        CLList res = new CLList();
        Node curr = tail.getNext();
        while (curr != tail && curr.getNext() != tail) {
            res.addLast(curr.getNext().getItem());
            curr = curr.getNext().getNext();

        }
        if (curr.getNext() == tail) {
            res.addLast(curr.getNext().getItem());
        }
        return res;
    }
//==============================

    public CLList upperCaseItems() {
        CLList res = new CLList();
    Node curr = tail.getNext();

        while (curr != tail) {
            if (Character.isUpperCase(curr.getItem())) {
                res.addLast(curr.getItem());
            }
            curr = curr.getNext();
        }
        if (Character.isUpperCase(curr.getItem())) {
            res.addLast(curr.getItem());
        }
        return res;
    }

    
//============================================
    public void removeEvenIndexes() {
        Node curr = tail;
        do {
            curr.setNext(curr.getNext().getNext()); 

            curr = curr.getNext();
        } while (  curr != tail&&curr.getNext() != tail);
        
        
        
        if (curr.getNext() == tail) {
            curr.setNext(curr.getNext().getNext());
            tail = curr;
        }
       

    }
//==================================

}
