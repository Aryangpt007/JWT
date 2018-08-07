import java.io.*;
import java.util.*;

public class Demo
{
	private static Scanner sc = new Scanner (System.in);
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{
		ToDoList myList= new ToDoList();
		int choice= -1, c= -1;
		int ans= -1;

		do
		{
			System.out.println ("__________________________________________________________________________");
			System.out.println ("\t\t\tTO-DO LIST OPERATIONS");
			System.out.println ("__________________________________________________________________________\n");
			System.out.println ("\t 1 -----> Add item");
			System.out.println ("\t 2 -----> Edit item");
			System.out.println ("\t 3 -----> Delete item");
			System.out.println ("\t 4 -----> Display list");
			System.out.println ("\t 0 -----> EXIT");
			System.out.println ("__________________________________________________________________________");
			System.out.print ("Please enter your choice: ");
			choice= sc.nextInt();
			switch(choice)
			{
				case 0:
					break;
				case 1:
					System.out.println ("Enter item to add: ");
					String s1= br.readLine();
					myList.add(s1);
					break;
				case 2:
					System.out.println ("Enter item to edit: ");
					String s2= br.readLine();
					ans= myList.search(s2);
					if(ans==-404)
						System.out.println ("Sorry, not found!");
					else
					{
						System.out.println ("Enter new item: ");
						Object s3= br.readLine();
						myList.edit(s3, ans);
					}
					break;
				case 3:
					System.out.println ("Enter item to delete: ");
					String s4= br.readLine();
					ans= myList.search(s4);
					Object obj= new String(s4);
					if(ans==-404)
						System.out.println ("Sorry, not found!");
					else
						myList.delete(obj);
					break;
				case 4:
					myList.display();
					break;
				default:
					System.out.println("Invalid choice !");
					choice= -1;
			}
			System.out.print ("Enter 1 to choose another option: ");
			c= sc.nextInt();
		} while(c==1);
	}
}