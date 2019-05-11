package redoLab;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int value;
		int max;
		
		int[] array = new int[8];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 8 numbers: ");
		for(int i = 0;i<8;i++) {
			value = input.nextInt();
			array[i] = value;
		}
		
		max = array[0];
		
		max = maximum(array, array.length-1, max);
		System.out.println("Largest element" + "in the array is: " + max);
		

	}

	private static int maximum(int[] array, int length, int max) {
		if(length > -1) {
			if(array[length]>max) {
				max = array[length];
			}
			return (max = maximum(array, length-1,max));
		}
		else
		return max;
	}

}
