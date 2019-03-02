package lab4_7;

import java.util.Scanner;

public class lab4_7 {

	public static void main(String[] args) {
		 //creating the scanner object

        Scanner scan = new Scanner(System.in);

        //declaring the required variables

        int size,i=0,j=0;

        System.out.print("Enter array size : ");

        size=scan.nextInt();

        //creating the array of size

        int[] array=new int[size+1];

        array[size]=-1;

        //reading the elements from user

        System.out.print("Enter elements : ");

        //loop to read elements

        while(i<size)

        {

             array[i]=scan.nextInt();

             i++;

        }

        //printing the array

        System.out.print("Array before Filtering :\n\t");

        //loop to print array

        i=0;

        while(array[i]!=-1)

        {

            System.out.print(""+array[i]+", ");

             i++;

        }

        //filtering the duplicate elements

        i=0;j=0;

        while(array[i]!=-1)

        {

            j=0;

            while(array[j]!=-1)

                        {

                        //if duplicate found

                     if(array[i]==array[j] && i!=j)

                                        {

                              int k=j;

                                                        //deleting the duplicate

                                 while(array[k]!=-1)

                                            array[k]=array[++k];

                                                        //updating the end

                                             array[k-1]=-1;

                                        }

                                        j++;

                        }

                        i++;

        }

        //printing the array

        System.out.print("Array after Filtering :\n\t");

        //loop to print array

        i=0;

        while(array[i]!=-1)

        {

        System.out.print(""+array[i]+", ");

        i++;

        }

        //end of main function

}



	}


