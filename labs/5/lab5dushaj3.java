package lab5dushaj3;

import java.util.Scanner;

public class lab5dushaj3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of students: ");

		int numOfStu = input.nextInt();
		System.out.print("Then enter a student score followed by a name: ");

		int[] grades = new int[numOfStu];

		String[] names = new String[numOfStu];

		for (int i = 0; i < numOfStu; i++) {

		String name = input.next();

		int grade = input.nextInt();

		names[i] = name;

		grades[i] = grade;

		System.out.println("");

		}

		//this is the area that sorts it from least to greatest

		//i is the indexed value of the last number in array

		//if it's 10 numbers big, i is 9

		//loop ends before index 0 because 0 should be in it's place at the end already

		for (int i = grades.length - 1; i > 0; i--) {

		//resets both to 0 to start at the beginning of the array

		//so that you can test the new first number

		int currentMax = grades[0];

		int currentMaxIndex = 0;

		//finds largest number out of all up to back-limit

		//i is back-limit that gets chopped off by one each time

		for (int k = 1; k <= i; k++) {

		if (currentMax < grades[k]) {

		currentMax = grades[k];

		currentMaxIndex = k;

		}

		}

		//after largest number is found, assign that number to i

		//i is a high number like 9, then 8, then 7, etc.

		//each time it runs, i-- so each second highest max number

		//gets put infront of the all time highest number

		grades[currentMaxIndex] = grades[i];

		grades[i] = currentMax;

		String tempName = names[currentMaxIndex];

		names[currentMaxIndex] = names[i];

		names[i] = tempName;

		}
		int y;
		System.out.println("Your names and scores in ascending order: ");
		for (y=0; y<grades.length; y++)
		

		System.out.println(names[y] + " " + grades[y]);

		}
}


