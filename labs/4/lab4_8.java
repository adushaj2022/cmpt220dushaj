package lab4_8;

import java.util.Scanner;

public class lab4_8 {

	public static void main(String[] args) {
		//Scanner object

		Scanner sc = new Scanner(System.in);

		int n = 0, input;

		int seq[] = new int[100]; //array

		//ask for input

		System.out.println("Enter positive numbers and 0 to end: ");

		//read first value

		input = sc.nextInt();

		//read till value is 0 and n is less than 100

		while(input != 0 && n<100)

		{

		seq[n] = input; //store value in array

		n++; //increment new

		//read next value

		input = sc.nextInt();

		}

		//sorting - insertion sort

		for (int i=1; i<n; ++i)

		{

		int cur = seq[i]; //current values

		int j = i-1;

		//find the place to insert

		while (j>=0 && seq[j] > cur)

		{

		seq[j+1] = seq[j];

		j = j-1;

		}

		seq[j+1] = cur; //insert in correct place

		}

		//print sorted values

		System.out.print("Sorted values: ");

		for(int i=0; i<n; i++)

		System.out.print(seq[i] + " ");

		System.out.println();

		sc.close();

		}

	}


