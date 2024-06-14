package codingstandards;

public class Indices {
             public static void main(String[] args) {
            	 int[] num = {10,20,33,47,58,60,79,81,90};
            	 for(int i=0;i<num.length;i++)
            	 {
            		 if(num[i]%3==0) 
            			 continue;
            		 
            		 System.out.println ("Array elements are:" +num[i]);
            		 
            	 }
            	 
             }
}
