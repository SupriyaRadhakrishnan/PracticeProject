import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		int i = 2;
		boolean flag = false;
		if(num>1) {
		while(i <= num/2)
		{
			if(num%i ==0) {
				System.out.println("Not Prime");
				i=num;
				flag = true;

			}
			i++;
		}
		}
		else
			flag = true;
		
		if(flag == false)
			System.out.println("Prime");
		
	}
	

}
