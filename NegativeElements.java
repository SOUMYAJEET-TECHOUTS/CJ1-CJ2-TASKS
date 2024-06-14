package codingstandards;

public class NegativeElements {
      public static void main(String[] args) {
    	  int i;
    	  int[] num = {1,2,0,3,-7,4,5,6};
    	  
    	 for(i=0; i< num.length;i++) 
    		 
    		 if(num[i]<0)
    			 break;
    		 
    	  System.out.println(num[i]);
    
    	  
      }
}
