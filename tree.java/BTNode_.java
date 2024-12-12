
public class BTNode_ {

    public static <E> void preOrder(BTNode<E> p) {
 if (p != null) {
   System.out.println(p.getItem());
   preOrder(p.getLeft());
   preOrder(p.getRight());
   
 }}
   
 //==============================================
 public  static <E> void inOrder(BTNode<E> p) {
 if (p != null) {
   inOrder(p.getLeft());
   System.out.println(p.getItem());
   inOrder(p.getRight());
 }}
 //=================================================
 public  static <E>  void postOrder(BTNode<E> p) {
 if (p != null) {
   postOrder(p.getLeft());
   postOrder(p.getRight());
   System.out.println(p.getItem());
 }}
 //=========================================
 
 
 
 
 
 
 
     public static void main(String[] args) {
 BTNode<Character>root=new BTNode();
 root.setItem('B');
  BTNode<Character>L=new BTNode();
 L.setItem('A');
 
 BTNode<Character>R=new BTNode();
 R.setItem('D');
 
 BTNode<Character>LL=new BTNode();
 LL.setItem('C');
 BTNode<Character>RR=new BTNode();
 RR.setItem('E');
 
 root.setLeft(L);
 root.setRight(R);
 R.setLeft(LL);
 R.setRight(RR);
 
 
         preOrder(root);
         System.out.println("---");
         inOrder(root);
 System.out.println("---");
         postOrder(root);
 
     }
     
 }
 
 