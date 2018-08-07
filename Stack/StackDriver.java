import java.io.*;
import java.util.*;

public class StackDriver
{

	public static void main(String args[]) throws IOException
	{
		int size, c=1, choice= -1;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("GENERATE STACK");
		System.out.print("Enter stack size: ");
		size= sc.nextInt();
		Stack s= new Stack(size);
		do
		{
			System.out.println("________________STACK OPERATIONS________________");
			System.out.println("1 -----> Push");
			System.out.println("2 -----> Pop");
			System.out.println("3 -----> Display");
			System.out.println("________________________________________________");
			System.out.print("Enter your choice: ");
			choice= sc.nextInt();
			System.out.println("________________________________________________");
			switch(choice)
			{
				case 1:
					System.out.print("Enter value: ");
					s.push(sc.nextInt());
					break;
				case 2:
					if(! s.isEmpty())
						System.out.println("POPPED "+ s.pop());
					else
						System.out.println("Cannot pop\nStack empty !");
					break;
				case 3:
					s.disp();
					break;
				default:
					System.out.println("INVALID CHOICE !");
					choice= -1;
					break;
			}
			System.out.println("________________________________________________");
			System.out.println("Enter 1 to choose another option");
			c= sc.nextInt();
		} while(c==1);
	}
}