package codingstandards;

public class SumOfOddNumbers {
         public static void main(String[] args) {
        	 int i,sum=0;
        	 for(i=1;i<=100;i++)
        	 {
        		 if(i%2==0)
        			 continue;
        		System.out.println(i);
        		
        		sum = sum+i;
        	 }
        	
        	System.out.println("sum=" +sum);
        	
         }
}
