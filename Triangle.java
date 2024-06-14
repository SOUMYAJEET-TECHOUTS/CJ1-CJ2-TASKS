package codingstandards;

public class Triangle {
       public static void main (String[] args) {
    	   for (int i = 1; i <= 5; i++) {
               if (i == 3) {
                   break;
               }
               for (int j = 1; j <= i; j++) {
                   System.out.print("*");
               }
               System.out.println();
       }
}
}