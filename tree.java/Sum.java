
public class Sum{

public static int sum(BTNode node) {
    if (node == null) 
        return 0;
   
    return (Integer) node.getItem() + sum(node.getLeft()) + sum(node.getRight());
}
//========================================================
public static int Countnode(BTNode root) {
    if (root == null) {
        return 0;
    }

    return 1 + Countnode(root.getLeft()) + Countnode(root.getRight());
}
//==================================================================
public static int getLeafCount(BTNode root) {
    if (root == null) {
        return 0;
    }
    if (root.getLeft() == null && root.getRight() == null) 
        return 1;
    
        return getLeafCount(root.getLeft()) + getLeafCount(root.getRight());
    }


//==============================================
public static int getparentCount(BTNode root) {
    if (root == null) {
        return 0;
    }
    if (root.getLeft() == null && root.getRight() == null) 
        return 0;
   
    
  
        return  1+getparentCount(root.getLeft()) + getparentCount(root.getRight());
    }

//==================================================
public static void main(String[] args) {
    BTNode<Integer> root = new BTNode<Integer>();
    BTNode<Integer> l1 = new BTNode<Integer>();
    BTNode<Integer> r1 = new BTNode<Integer>();
    BTNode<Integer> l2 = new BTNode<Integer>();
    BTNode<Integer> r2 = new BTNode<Integer>();
    BTNode<Integer> r3 = new BTNode<Integer>();
    root.setItem(5);
    l1.setItem(6);
    r1.setItem(7);
    l2.setItem(8);
    r2.setItem(9);
    r3.setItem(2);

    root.setLeft(l1);
    root.setRight(r1);
    l1.setLeft(l2);
    l1.setRight(r2);
    r1.setRight(r3);
//
    preorder(root);
//===============================
    System.out.println("====================");
    System.out.println("sum " + sum(root));
    System.out.println("count " + Countnode(root));
    System.out.println("leave count " + getLeafCount(root));
    System.out.println("parent count " + getparentCount(root));



}
///////////////////////////
public int Sum() {
    return sum(root);

}

private int sum(BSTNode node) {
    if (node == null) {
        return 0;
    }
    return (Integer) node.getData() + sum(node.getLeft()) + sum(node.getRight());
}
//=========================================================
public int CountNodes() {
    return Countnode(root);

}

int Countnode(BSTNode<K, E> node) {
    if (node == null) {
        return 0;
    }

    return 1 + Countnode(node.getLeft()) + Countnode(node.getRight());
}

//=================================================
public int GetleafCount() {
    return getLeafCount(root);

}
int getLeafCount(BSTNode<K, E> node) {
    if (node == null) 
        return 0;
    
    if (node.getLeft() == null && node.getRight() == null) 
        return 1;
   
        return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
    
}

//==============================================
public int GetparentCount() {
    return getparentCount(root);

}

int getparentCount(BSTNode<K, E> node) {
    if (node == null)
        return 0;
   
    if (node.getLeft() == null && node.getRight() == null) 
        return 0;
   
        return 1 + getparentCount(node.getLeft()) + getparentCount(node.getRight());
   
}
//======================================================
public static void main(String[] args) {

    BSTree<Integer, Integer> myt = new BSTree();
    myt.insert(20, 20);
    myt.insert(15, 15);
    myt.insert(40, 40);
    myt.insert(5, 5);
    myt.insert(17, 17);
    myt.insert(30, 30);
    myt.insert(45, 45);
  myt.insert(1, 1);
                 //===================================
System.out.println(myt.Sum()); 
    System.out.println("tree size " + myt.CountNodes());
    System.out.println("leave count " + myt.GetleafCount());
    System.out.println("parent count " + myt.GetparentCount());
    }









}