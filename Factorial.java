package codingstandards;
import java.util.Scanner;
public class Factorial {
           public static void main (String[]args) {
        	   int a;
        	   int fact =1;
        	   System.out.println("Enter a Number=");
        	   Scanner ref = new Scanner(System.in);
        	   a= ref.nextInt();
        	   for(int i=1;i<=a;i++)
        	   {
        		   if(i%2==0) 
                	    continue;
        		   fact = fact*i;
        		   


        		   
                  
        	   }
        	   System.out.println("Factorial of given number is=" +fact);
        	   
                 
        	   
           }
}
