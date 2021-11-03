import java.util.Random;

public class RandomGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int randomNumber = rand.nextInt(10);
		System.out.println(randomNumber);
		System.out.println(Math.random());

	}

}
