//package lab5dushaj1;

import java.util.Scanner;

public class lab5dushaj2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double[] userNumber = new double[10];
		double spaceHolder;
		for (int k = 0; k < userNumber.length; k++) {
			System.out.print("Enter 10 numbers: ");
			spaceHolder = userInput.nextDouble();
			userNumber[k] = spaceHolder;
			
		}
		System.out.println("Mean: " + mean(userNumber));
		System.out.printf("Standard Deviation: " + "%.2f",sd(userNumber) );
	}

	private static double mean(double[] userList) {
		int count = 0;
		int total = 0;
		
		for (int j = 0; j < userList.length; j++) {
			total += userList[j];
			count += 1;
		}
		double mean = total / count;
		return mean;
	}
	private static double sd(double[] user_List) {
		double powerSum1 = 0;
		double powerSum2 = 0;
		double stdev = 0;
		for (int i = 0; i < user_List.length; i++) {
			powerSum1 += user_List[i];
			powerSum2 += Math.pow(user_List[i], 2);
			stdev =  Math.sqrt(i *powerSum2 - Math.pow(powerSum1,  2))/i;		
		}
		return stdev;
	}

}
