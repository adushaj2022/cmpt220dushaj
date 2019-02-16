package lab3_5;
import java.util.Scanner;
public class lab3_5 {

	
		

			public static double average(double a, double b, double c){

			double sum = a + b + c; // finding sum

			double average = sum / 3; // finding average

			return average; // returning average

			}


			

			public static void main(String[] args) {

			Scanner in = new Scanner(System.in);

			System.out.print("Enter a : ");

			double a = in.nextDouble();

			System.out.print("Enter b : ");

			double b = in.nextDouble();

			System.out.print("Enter c : ");

			double c = in.nextDouble();

			System.out.println("Average is : "+average(a,b,c)); // calling average function

		

			}

			{
	}

}
