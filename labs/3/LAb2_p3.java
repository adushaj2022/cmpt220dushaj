package LAb2_p3;
import java.util.Scanner;
import java.util.Random;

public class LAb2_p3 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the lower limit: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter the upper limit: ");
		int number2 = input.nextInt();
		
		int range1 = rand.nextInt(number2 - number1 + 1);
		int range2 = rand.nextInt(number2 - number1 + 1);
		int range3 = rand.nextInt(number2 - number1 + 1);
		
		System.out.print("Number 1: " + range1 + "\n" + "Number 2: " + range2 + "\n" + "Number 3: " + range3);
		
	}

}
