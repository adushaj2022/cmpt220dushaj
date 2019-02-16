package lab3_1;
import java.util.Scanner;

public class lab3_1 {

	public static void main(String[] args) {
		double total = 0;
		double count = 0;
		double evenCount = 0;
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number (0 to quit): ");
		double userInput = input.nextDouble();
		while (userInput != 0) {
			System.out.print("Enter a number (0 to quit): ");
			userInput = input.nextDouble();
			
			total += userInput;
			count += 1;
			
			if (userInput % 2 == 0) {
				evenCount +=1;
			}
		}
		double average = total / count;
		System.out.print("The average is: " + average + "\n");
		System.out.print("The sum is: " + total + "\n");
		System.out.print("The even count is: " + evenCount + "\n");
	}

}
