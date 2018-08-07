import java.io.*;
import java.util.*;

public class Demo
{
	private static Scanner sc = new Scanner (System.in);
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	static void setEmployeeDetails(Employee e) throws IOException
	{
		System.out.println ("__________________________________________________________________________");
		System.out.print ("Employee name: ");
		e.setName(br.readLine());
		System.out.print ("Employee address: ");
		e.setAddress(br.readLine());
		System.out.print ("Basic yearly salary: ");
		e.setBasicSalary(Float.parseFloat(br.readLine()));
		System.out.println ("__________________________________________________________________________");
	}
	
	static void getEmployeeDetails(Employee e)
	{
		System.out.println ("__________________________________________________________________________");
		System.out.println ("Employee name: "+ e.getName());
		System.out.println ("Employee address: "+ e.getAddress());
		System.out.println ("Basic yearly salary: "+ e.getBasicSalary());
		System.out.println ("__________________________________________________________________________");
	}

	public static void main(String[] args) throws Exception
	{
		int choice= -1, c= -1;
		Employee e;
		
		do
		{
			System.out.println ("__________________________________________________________________________");
			System.out.println ("\t\t\tEMPLOYEES");
			System.out.println ("__________________________________________________________________________\n");
			System.out.println ("\t 1 -----> Normal Employee Monthly salary");
			System.out.println ("\t 2 -----> Bonus Employee Monthly salary");
			System.out.println ("\t 0 -----> EXIT");
			System.out.println ("__________________________________________________________________________");
			System.out.print ("Please enter your choice: ");
			choice= sc.nextInt();
			System.out.println ("__________________________________________________________________________");
			switch(choice)
			{
				case 0:
					break;
				case 1:
					e= new NormalEmployee();
					setEmployeeDetails(e);
					System.out.println("Monthly salary = "+ e.getMonthlySalary());
					getEmployeeDetails(e);
					break;
				case 2:
					e= new BonusEmployee();
					setEmployeeDetails(e);
					System.out.println("Monthly salary = "+ e.getMonthlySalary());
					getEmployeeDetails(e);
					break;
				default:
					System.out.println("Invalid choice !");
					choice= -1;
			}
			System.out.print ("Enter 1 to choose another option: ");
			c= sc.nextInt();
		} while(c==1);
		System.out.println ("EXITING ...");
	}
}