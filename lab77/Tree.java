package lab77;

public class Tree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

   //================ Q 3 =====================
        ExpressionTree tree = new ExpressionTree();

        String postfix = "56+34*3*+";

        char[] charArray = postfix.toCharArray();

        tree.construct_PostExpretionTree(charArray);
        System.out.println("\npostfix expression is");

//        
        System.out.println("====");
        tree.inorder(tree.root);
        System.out.println("=====");
        tree.preorder(tree.root);
        System.out.println("=====");

        tree.postorder(tree.root);
        System.out.println("=====");
        System.out.println(tree.evalExpression(tree.getRoot()));

        tree.construct_infixExpretionTree("(((6+5)*4)+(3-(2/1)))");
              System.out.println("\ninfix expression is");
System.out.println("====");
       tree.inorder(tree.root);
//===========================================
//tree.inorderPrintTree(tree.root);
//        System.out.println("=====");
//tree.preorderPrintTree(tree.root);
//        System.out.println("====");
//       tree.postorderPrintTree(tree.getRoot(), 0);

        
    }
    
}
