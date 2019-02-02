package labpart4;

import java.util.Scanner;

public class labpart4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter mass: ");
		double mass = input.nextDouble();
		double Cspeed =  299972458;
		System.out.println("The energy is: " + (mass/Cspeed) + "joules");
		

	}

}
