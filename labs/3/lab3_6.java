package lab3_6;
import java.util.Scanner;

public class lab3_6 {



		public static int countVowel(String s){

		int count = 0; // initial vowel count is 0

		// scan entire string and find vowel

		for (int i = 0; i < s.length() ; i++ ) {

		char c = s.charAt(i); // get character at index i to variable c

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||

		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){ // check c is vowel or not

		count += 1; // increase count

		}

		}

		return count;

		}

		public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.print("Enter a string : ");

		String s = in.next();

		System.out.println("Vowel Count : "+countVowel(s)); // calling countVowel

		}

		}

