package LAb2_p5;

import java.util.Arrays;
import java.util.Scanner;

public class LAb2_p5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s1 = input.next();
		
		
		System.out.print("Enter another string: ");
		String s2 = input.next();
		System.out.println(s1.compareTo(s2));
		
		
		String orderStr = s1 + s2; // JA: Does this order change?
		
        char[] chars = orderStr.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
		


	}

}
