package dushaj8;

import java.util.ArrayList;
import java.util.Scanner;

public class sortArrayList {

	public static void main(String[] args) {

		ArrayList <Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 5 numbers: ");
		
		for(int i = 0; i <= 5; i++) {
			list.add(input.nextInt());
			
		}
		
		sort(list);
		System.out.print("List after sort: ");
		for (int q = 0; q < list.size(); q++) {
			System.out.print(list.get(q) + " ");
		}
		
	}
	
	private static void sort(ArrayList<Integer> list) {
		
		int temp;
		int k;
		int y;
		for(k = 0; k < list.size() - 1; k++) {
			for (y = k + 1; y < list.size() - 1; y++) {
				if ((Integer) list.get(k) > (Integer)(list.get(y))) {
                    temp = (Integer)list.get(k);
                    list.add(k,(Integer)list.get(y));
                    list.add(y,temp);
			}
			
		}
		
	}

}
}
