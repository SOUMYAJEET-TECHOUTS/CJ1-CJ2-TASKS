package codingstandards;

public class PrimeNumbers {
    public static void main (String[] args)
    {
    	int a =1;
    	int b=100;
    	int j;
    	int i;
    	for( i=a;i<=b;i++)
    	{
    		for(j=2;j<=i;j++)
    		{
    			if(i%j == 0)
    			break;
    		}
    		if(j % 5==0)
    			continue;
    		
			if(i==j)
			{
    	    System.out.println(j);
			}
    			
    	}
    }
}
