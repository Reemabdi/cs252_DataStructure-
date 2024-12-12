package lab8;
public class BST_Lab {

    
    public static void main(String[] args) {
        BSTree<Integer, Integer> tree = new BSTree();
        tree.insert(5, 5);
        tree.insert(8, 8);
        tree.insert(1, 1);
        tree.insert(7, 7);
        tree.insert(3, 13);
        tree.insert(9, 9);
        tree.insert(4, 4);
        System.out.println("the valu is found? "+tree.contains(3));
        System.out.println("number of leaf nodes "+tree.GetleafCount());

        //==========================================================
        
    BSTree<Integer,student>stree=new BSTree();
    stree.insert(5, new student(5,"lolo",88));
     stree.insert(3, new student(3,"fofo",79));
     stree.insert(8, new student(8,"toto",99));
    
     
////     stree.print();
////        System.out.println("========");
////        System.out.println(stree.search_Data(5));
////        System.out.println("=======");
////        stree.print_();
////        
        
        






































    }

}

