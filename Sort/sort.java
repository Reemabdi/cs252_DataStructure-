



//package Sort;








public class sort {


    //================================
     public static void bubbleSort(int []a){
     int count=0;
         for(int i=0;i<a.length-1;i++)
       {
           count++; 
           
       for(int j=1;j<a.length-i;j++)
       {
       if(a[j-1]>a[j]){
         
     int temp=a[j-1];
    a[j-1]=a[j];
    a[j]=temp;
    
       }
         }
       }
         System.out.println("number of passs is "+count);
       }
     //================================================
     public static void selectionSort(int[] a) {
         
    for (int i = 0; i < a.length-1; i++) {
       
    // find index of smallest element
    int minIndex = i;
    for (int j = i + 1; j < a.length; j++) {
    if (a[j] > a[minIndex]) {
    minIndex = j;
    }
    }
    // swap smallest element with a[i]
    int temp=a[i];
    a[i]=a[minIndex];
    a[minIndex]=temp;
       
    }
    }
       //===============================================================
       public static void insertionSort(int[] a){
           
    for(int i=1;i<a.length;i++){
    int temp=a[i];
    int j=i;
    while(j>0 && a[j-1]<temp)
    {
        a[j]=a[j-1];
        j--;
        
    }
    
    a[j]=temp;
    
    
    }
          
    }
    //===========================================================================
       
        public static void main(String[] args) {
              int ar[]={5,4,3,2,1,7,8,9,10};
           // bubbleSort(ar);
         selectionSort(ar);
           // insertionSort(ar);
          
            for(int i=0;i<ar.length;i++)
                System.out.print(" "+ar[i]);
            System.out.println("");
             
            
            
          
    
           
    
    
          
        }
        
    }
    