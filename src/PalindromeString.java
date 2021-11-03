import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PalindromeString {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.next();
		String rev_str = "";
		char[] c = str.toCharArray();
		for(int i =c.length-1;i>=0;i--)
		  rev_str += String.valueOf(c[i]);
		//System.out.println(rev_str);
	     if(str.equals(rev_str))
	    	 System.out.println("Palindrome");
	     else
	    	 System.out.println("Not Palindrome");
	     
	     StringBuffer sb = new StringBuffer(str);
	     sb.reverse();
	     String buffer = sb.toString();
	     if(str.equals(buffer))
	    	 System.out.println("Palindrome");
	     else
	    	 System.out.println("Not Palindrome");
	     
	     StringBuilder sbu = new StringBuilder();
	     sbu.append(str);
	     sbu.reverse();
	     String builder = sbu.toString();

	     if(str.equals(builder))
	    	 System.out.println("Palindrome");
	     else
	    	 System.out.println("Not Palindrome");
	     
	}

}
