package nineLabdushaj;

import java.util.Random;
import java.util.Scanner;

public class hundredInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[] arrayInt = new int[100];
		int spaceHold;

		for(int i = 0; i < 100; i++) {
			spaceHold = rand.nextInt(100);
			arrayInt[i] = spaceHold;
						
		}
		System.out.println("Enter an index for the array: ");
		int index = input.nextInt();

		System.out.println("Value at index:  " + arrayInt[index]);
	}


	}


