package project1_8;


import java.util.Scanner;
public class project1_8 {



public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int height = scanner.nextInt(); // the height of the wall
int width = scanner.nextInt(); // the width of the wall
int nBricks = scanner.nextInt(); // the number of bricks in the pile
int bricks[] = new int[nBricks];
for(int i = 0; i < nBricks; i++)
bricks[i] = scanner.nextInt(); // take input the length of the brick
int i = 0; // index of the current brick in the pile
for(int h = 0; h < height; h++) // loop for each height level
{
int w = 0; // current width till which bricks are filled
while(w + bricks[i] <= width) // keep adding bricks till we can
w += bricks[i++]; // update current width and current index
if(w != width) // if current width is not the expected width
{
System.out.println("NO"); // print NO
scanner.close();
return;
}
}
System.out.println("YES"); // we can make the wall, print YES
scanner.close();
}
}


