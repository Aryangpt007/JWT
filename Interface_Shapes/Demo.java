import java.io.*;
import java.util.*;

public class Demo
{
	private static Scanner sc = new Scanner (System.in);
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception
	{
		Shape mShape= null;
		int choice= -1, c= -1;
		double dim1= 0.0, dim2= 0.0;

		do
		{
			System.out.println ("__________________________________________________________________________");
			System.out.println ("\t\t\tSHAPES");
			System.out.println ("__________________________________________________________________________\n");
			System.out.println ("\t 1 -----> Rectangle");
			System.out.println ("\t 2 -----> Right-angled Triangle");
			System.out.println ("\t 3 -----> Circle");
			System.out.println ("\t 0 -----> EXIT");
			System.out.println ("__________________________________________________________________________");
			System.out.print ("Please enter your choice: ");
			choice= sc.nextInt();
			if(choice!=3 && choice!=0)
			{
				System.out.println ("__________________________________________________________________________");
				System.out.print ("Enter dimension 1: ");
				dim1= sc.nextDouble();
				System.out.print ("Enter dimension 2: ");
				dim2= sc.nextDouble();
				System.out.println ("__________________________________________________________________________");
			}
			else if(choice == 3)
			{
				System.out.println ("__________________________________________________________________________");
				System.out.print ("Enter radius: ");
				dim1= sc.nextDouble();
			}
			switch(choice)
			{
				case 0:
					break;
				case 1:
					mShape= new Rectangle(dim1, dim2);
					break;
				case 2:
					mShape= new RtTriangle(dim1, dim2);
					break;
				case 3:
					mShape= new Circle(dim1);
					break;
				default:
					System.out.println("Invalid choice !");
					choice= -1;
			}
			if(choice != -1)
			{
				do
				{
					System.out.println ("__________________________________________________________________________");
					System.out.println ("\t\t\tOPERATIONS");
					System.out.println ("__________________________________________________________________________\n");
					System.out.println ("\t 1 -----> Area");
					System.out.println ("\t 2 -----> Perimeter");
					System.out.println ("\t 0 -----> MAIN MENU");
					System.out.println ("__________________________________________________________________________");
					System.out.print ("Please enter your choice: ");
					choice= sc.nextInt();
					switch(choice)
					{
						case 0:
							break;
						case 1:
							System.out.println("Area ---> "+mShape.getArea());
							break;
						case 2:
							System.out.println("Perimeter ---> "+mShape.getPerimeter());
							break;
						default:
							System.out.println("Invalid choice !");
							choice= -1;
					}
					System.out.print ("Enter 1 to choose another option: ");
					c= sc.nextInt();
				} while(c==1);
				System.out.println("Back to MAIN MENU");
			}
			System.out.print ("Enter 1 to choose another option: ");
			c= sc.nextInt();
		} while(c==1);
		System.out.println ("EXITING ...");
	}
}