package redoLab;

import java.util.Scanner;

public class Addition {
	static int sum;
	
	public static void main(String[] args) {
		try {
			System.out.println("enter a number: ");
			
			Scanner scan = new Scanner(System.in);
			String input = scan.next();
			int number = Integer.parseInt(input);
			System.out.print(" The sum is: " + sumDigits(number));
			
		}
		catch(Exception e) {
			System.out.print("Exception ");
			System.exit(0);
		}
		
		}
		
		public static int sumDigits(long num) {
			if(num > 0) {
				sum = sum + (int)num % 10;
				sumDigits(num/10);
			}
		return sum;
		
		}

}
