package codingstandards;
import java.util.Scanner;
public class PadindromeString {
	
	public static void main(String[] args) {
		System.out.println("Enter a String=");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();

		if(isPalindrome(str))
 
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}
	public static boolean isPalindrome(String str)
	{
		boolean isMatch = false;
		for(int i = str.length()-1, j = 0; i>=0 && j <= str.length()-1; i-- , j++ )
		{
			if(str.charAt(i) == str.charAt(j))
			{
				isMatch = true;
			}
			else
			{
				isMatch = false;
				break;
			}
		}
		if(isMatch)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 
}
 

