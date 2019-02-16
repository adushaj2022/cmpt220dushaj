package LAb2_p1;

import java.util.Scanner;

public class LAb2_p1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter a number: ");
		int number2 = input.nextInt();
		
		System.out.print("Is number 1 less than number 2 ? " + (number1 < number2) + "\n");
		System.out.print("Is number 1 less than or equal to number 2 ? " + (number1 <= number2) + "\n");
		System.out.print("Is number 1 equal number 2 ? " + (number1 == number2) + "\n");
		System.out.print("Is number 1 not equal number 2 ?" + (number1 != number2) + "\n");
		System.out.print("Is number 1 greater number 2 ?" + (number1  > number2)+ "\n");
		System.out.print("Is number 1 greater than or equal to  number 2 ? " + (number1 >= number2)+ "\n");
		

	}

}
