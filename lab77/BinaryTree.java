package lab77;


public class BinaryTree<E> {


    private TNode<E> root;
    private int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public TNode<E> getRoot() {
        return root;
    }

    public TNode<E> addRoot(E e) {
        if (root == null) {
            root = new TNode<E>();
            root.setItem(e);
            size++;
        }
        return root;

    }

    public TNode<E> parent(TNode<E> p) {
        if (p != null) {
            TNode<E> n = p.getParent();
            return n;
        }
        return null;
    }

    public TNode<E> left(TNode<E> p) {
        if (p != null) {
            TNode<E> n = p.getLeft();
            return n;
        }
        return null;
    }

    public TNode<E> right(TNode<E> p) {
        if (p != null) {
            TNode<E> n = p.getRight();
            return n;
        }
        return null;
    }

    public boolean isRoot(TNode<E> p) {
        if (p != null) {
            if (p.getParent() == null) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (root == null) {
            return true;
        }
        return false;
    }

    public int getSize(TNode<E> p) {
        return size;
    }

    public TNode<E> addLeft(TNode<E> p, E e) {
        if (p != null && p.getLeft() == null) {
            TNode<E> n = new TNode<E>();
            n.setItem(e);
            p.setLeft(n);
            n.setParent(p);
            size++;
            return n;
        } else {
            return null;
        }
    }

    public TNode<E> addRight(TNode<E> p, E e) {
        if (p != null && p.getRight() == null) {
            TNode<E> n = new TNode<E>();
            n.setItem(e);
            p.setRight(n);
            n.setParent(p);
            size++;
            return n;
        } else {
            return null;
        }
    }

    public boolean isInternal(TNode<E> p) {
        if (p != null) {
            if (p.getLeft() != null || p.getRight() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isExternal(TNode<E> p) {
        if (p != null) {
            if (p.getLeft() == null && p.getRight() == null) {
                return true;
            }
        }
        return false;
    }
    
    
    public void breadth_first(TNode<E> p){
        LinkedQueue<TNode<E>> items = new LinkedQueue<TNode<E>>();
        if(p != null)
            items.enqueue(p);
        while(!items.isEmpty()){
            TNode<E> p1 = items.dequeue();
            System.out.println(p1.getItem());
            if(p1.getLeft() != null)
                items.enqueue(p1.getLeft());
            if(p1.getRight()!= null)
                items.enqueue(p1.getRight());
        }
    }
 
    //=================================
    int height(TNode root) {
        // Return if reached null node or last level
        if (root == null)
            return 0;

        // Traversing left subtree
        int heightleftsubtree = height(root.getLeft());

        // Traversing right subtree
        int heightrightsubtree = height(root.getRight());

        // return the height which is maximum of left or right sub tree after adding 1
        return Math.max(heightleftsubtree, heightrightsubtree) + 1;
    }
 









    public void printInte(TNode<E> x){
        if (x!= null) {
            if (x.getLeft() != null || x.getRight() != null) {
               System.out.println(x.getItem()) ;
               printInte(x.getLeft());
               printInte(x.getRight());
            }
            
}}
}

