package lab4_6;

public class lab4_6 {

	//method to insert at end           

    public static void insert_at_end(int[] array,int value)

    {

                    //declaring the veriables

         int i=0;

                    

         while(array[i]!=-1)

                    {

                      i++;

                    }

                    //if array is full

                    if(i==99999)

                    {

                                    //printing the message

                    System.out.println("Array full.");

                    }

                    //if array is not full

                    else

                    {

                                    //inserting the values at the end

                    array[i]=value;

                                    //moving the end forward

                     array[i+1]=-1;   

                    }

                    //end of function

    }

    //method to insert a value at the specific index

    public static void insert_at_index(int[] array,int value,int position)

    {

                    //declaring the required variables

              int length=0,i=0;

                    //find in the end of the array

              while(array[length]!=-1)

                    {

                    length++;

                    }

                    //if array is full

                    if(length==99999)

                    {

                                    //printing the message

                     System.out.println("Array full.");

                    }

                    //if array is not full

                    else

                    {

                                    //moving end forward

                     array[length+1]=-1;

                                    //moving elements forward

             for(i=length;i>position;i--)

                                    {

                   array[i]=array[i-1];

                                    }

                                    //inserting the new element

                     array[i]=value;

                    }

                    //end of function

                   

    }

    //main method to run the program

    public static void main(String args[])

    {

                    //creating the array of size 99999

                    int[] array=new int[99999];

                    //updating the end

                    array[0]=-1;

                    //declaring the required variables

                    int i=0,temp;

                    //inserting the values using the insert_end function

                    insert_at_end(array,1);

                    insert_at_end(array,2);

                    insert_at_end(array,3);

                    insert_at_end(array,4);

                    insert_at_end(array,5);

                    insert_at_end(array,6);

                    insert_at_end(array,7);

                    insert_at_end(array,8);

                    insert_at_end(array,9);

                    insert_at_end(array,10);

                    //printing the array

                    System.out.print("Array after inserting 1 to 10 :\n\t");

                    //loop to print array

                    while(array[i]!=-1)

                    {

                     System.out.print(""+array[i]+", ");

                      i++;

                    }

                    //inserting the elements using the insert_at_index function

                    insert_at_index(array,10,3);

                    insert_at_index(array,100,7);

                    //printing the array

                    System.out.print("\nArray after inserting 10 at 3 and 100 at 7 :\n\t");

                    i=0;

                    //loop to print array

                    while(array[i]!=-1)

                    {

                     System.out.print(""+array[i]+", ");

                     i++;

                    }

                    //end of main function

    }


		

	}


