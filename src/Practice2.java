
public class Practice2 {
	
	public static void main(String args[])
	{
		
		int num = 124;
		int rev =0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println(rev);
	  //using Strinbuffer
		num = 124;
	StringBuffer sb = new StringBuffer(String.valueOf(num));

	System.out.println(sb.reverse());
	
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	System.out.println(sbl.reverse());
}
	
}
