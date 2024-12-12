package lab77;

public class Tree1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         BinaryTree<Integer> t = new BinaryTree();
        System.out.println(t.getSize());

        TNode<Integer> r = t.addRoot(5);
        TNode<Integer> c = t.addLeft(r, 8);
        TNode<Integer> a = t.addRight(r, 9);


        System.out.println(t.isRoot(r));
        System.out.println(t.isRoot(c));
        System.out.println(c.getItem());
        System.out.println(t.isEmpty());
        System.out.println(t.isExternal(a));
        System.out.println(t.isInternal(c));


        t.addLeft(c, 100);
        t.addLeft(a, 300);


        System.out.println(t.getSize());
        System.out.println(t.left(c).getItem() + 30);
        System.out.println("hight is "+t.height(a));

        t.breadth_first(t.getRoot());

t.printInte(a);

  

        
    }
    
}
