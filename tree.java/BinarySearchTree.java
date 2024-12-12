
public class BinarySearchTree {

    
    public static void main(String[] args) {
        BSTree<Integer,employee>tr=new BSTree();
    
         employee emp1=new employee(3,"lolo",9000);
         employee emp2=new employee(1,"fofo",7000);
         employee emp3=new employee(4,"toto",10000);
         employee emp4=new employee(2,"dodo",8000);
                  
        tr.insert(3, emp1);
        tr.insert(1, emp2);
        tr.insert(4, emp3);
        tr.insert(2, emp4);
        
      // tr.print();
       
        System.out.println(tr.search(4));
       
       
       
       
//        System.out.println(tr.Search(3));
//        System.out.println("==========");
//        tr.print();
    }
    
}
