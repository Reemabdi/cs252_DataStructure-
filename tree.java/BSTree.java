public class BSTree<K extends Comparable <K>, E>   {
    
    private BSTNode<K, E> root; 
    
    
    
    public E search(K k) { 			                // "wrapper method" 
        BSTNode <K,E>  n = searchTree(root, k); 	// get Node for key 
        if (n == null)
      return null; 			// no such key 
        else
      return n.getData(); 			// return list of values for key 
    }
   
    
    private BSTNode searchTree(BSTNode<K,E> root, K key) 
    { 
      // Base Cases: root is null or key is present at root 
  if (root==null || root.getKey()==key) 
  return root; 
  if (root.getKey().compareTo(key) > 0) 
  return searchTree(root.getLeft(), key); 
   
  return searchTree(root.getRight(), key); 
    }
 
    //============================
                               // "wrapper method" 
       
   public  E Search(K key)
  {	
  BSTNode temp=root;
  
  while(temp!=null)
  {
       if((Integer)temp.getKey()>(Integer)key)
       temp=temp.getLeft(); 
  else
       if((Integer)temp.getKey()<(Integer)key)
       temp=temp.getRight();
  else
      return (E)temp.getData();
  }
  return null;
  
  }
  
  
    
    //==============================
    
    public void insert(K key, E data)
  {      BSTNode<K,E> parent = null; 
         BSTNode<K,E> trav = root; 
         while (trav != null) {
                 // what should go here?  
  parent = trav;
  if (key .compareTo(trav.getKey())<0 )
     trav= trav.getLeft();
  else
             trav = trav.getRight();  } 
         
          BSTNode<K,E> newNode = new BSTNode<K,E>(key, data); 
          if (root == null)                  
                 root = newNode; 
          else if (parent.getKey().compareTo(key)>0)       
                 parent.setLeft(newNode); 
          else                                             
                 parent.setRight(newNode); 
  
          
  }
    //===========================================
    public void print(){
           
        print(root)  ;
    }
    
    private void print(BSTNode root){
    if(root!=null)
    {
        print(root.getLeft());
        System.out.println(root.getData());
        print(root.getRight());
    }
    
    }
  }
  