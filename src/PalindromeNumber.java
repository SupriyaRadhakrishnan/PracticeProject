import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		int org_num = num;
		int rev_num = 0;
		while(num !=0)
		{
		 rev_num = rev_num*10 +  (num%10);
		 num = num/10;
		}
		
		if(rev_num == org_num)
			System.out.println("num is a Palindrome");
		else
			System.out.println("num is not a Palindrome");
	}

}
