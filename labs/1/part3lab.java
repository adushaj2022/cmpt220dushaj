package part3lab1;
import java.util.Scanner;
public class part3lab {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in grams to convert to ounces: ");
		double grams = input.nextDouble();
		
		double result = grams / 28.35;
		
		System.out.println("The converted value is: " + result + " ounces");		
		

	}

}
