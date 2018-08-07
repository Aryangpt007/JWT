import java.io.*;
import java.util.*;
import java.time.*;

public class Student_DB_Driver
{
	private static Scanner sc = new Scanner (System.in);
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	public Student getStuData() throws IOException
	{
		String str[] = {"day", "month", "year" };
		int dt[] = new int[3];
	    String date = "", name="";
	    long prn; int age;
	    double sub1, sub2, sub3, sub4, sub5, sub6;
	    LocalDate dob = null;

		System.out.print("Name: ");
		name= name+br.readLine();
		System.out.print("PRN: ");
		prn= sc.nextLong();
		System.out.print("Age: ");
		age= sc.nextInt();
		System.out.print("Subject 1 marks: ");
		sub1= sc.nextDouble();
		System.out.print("Subject 2 marks: ");
		sub2= sc.nextDouble();
		System.out.print("Subject 3 marks: ");
		sub3= sc.nextDouble();
		System.out.print("Subject 4 marks: ");
		sub4= sc.nextDouble();
		System.out.print("Subject 5 marks: ");
		sub5= sc.nextDouble();
		System.out.print("Subject 6 marks: ");
		sub6= sc.nextDouble();
	    for(int i=0; i<3; i++)
	    {
	        System.out.print("Enter " + str[i] + " : ");
	        dt[i]= sc.nextInt();
	    }
	    LocalDate ld = LocalDate.of( dt[2] , dt[1] , dt[0] );
	    dob= ld;
	    Student temp= new Student(prn, name, sub1, sub2,
	    	sub3, sub4, sub5, sub6, age, dob);
	    return temp;
	}

	public static void main(String[] args) throws IOException
	{
		StudentDatabase mSdb= new StudentDatabase();
		long prn; String name="";
		int ans=-1, pos= -1;
		Student_DB_Driver myDriver= new Student_DB_Driver();
		int choice= -1, c= -1;

		do
		{
			System.out.println ("__________________________________________________________________________");
			System.out.println ("\t\t\tSTUDENT DATABASE OPERATIONS");
			System.out.println ("__________________________________________________________________________\n");
			System.out.println ("\t 1 -----> Add student record");
			System.out.println ("\t 2 -----> Edit student record");
			System.out.println ("\t 3 -----> Delete student record");
			System.out.println ("\t 4 -----> Search record by PRN");
			System.out.println ("\t 5 -----> Search record by position");
			System.out.println ("\t 6 -----> Search record by name");
			System.out.println ("\t 7 -----> Display student record by PRN");
			System.out.println ("\t 8 -----> Display student record by position");
			System.out.println ("\t 9 -----> Display student record by name");
			System.out.println ("\t10 -----> Display database");
			System.out.println ("\t11 -----> Get Rank-list");
			System.out.println ("\t12 -----> Analyze performance by grades");
			System.out.println ("\t13 -----> Sort database by PRN");
			System.out.println ("\t14 -----> Sort database by name");
			System.out.println ("\t 0 -----> EXIT");
			System.out.println ("__________________________________________________________________________");
			System.out.print ("Please enter your choice: ");
			choice= sc.nextInt();
			switch(choice)
			{
				case 0:
					break;
				case 1:
					mSdb.addStu(myDriver.getStuData());
					System.out.println("Student record added !");
					break;
				case 2:
					System.out.println("Enter PRN: ");
					prn= sc.nextLong();
					ans= mSdb.searchByPrn(prn);
					if(ans== -404)
						System.out.println("No student with this PRN !");
					else	{
						mSdb.editStu(myDriver.getStuData(), ans);
						System.out.println("Student record updated !");	}
					break;
				case 3:
					System.out.println("Enter PRN: ");
					prn= sc.nextLong();
					ans= mSdb.deleteStu(prn);
					if(ans== -404)
						System.out.println("No student with this PRN !");
					else
						System.out.println("Deleted !");
					break;
				case 4:
				case 7:
					System.out.println("Enter PRN: ");
					prn= sc.nextLong();
					ans= mSdb.searchByPrn(prn);
					if(ans== -404)
						System.out.println("No student with this PRN !");
					else
						mSdb.display(mSdb.s.get(ans));
					break;
				case 5:
				case 8:
					System.out.println("Enter position: ");
					pos= sc.nextInt();
					ans= mSdb.searchByPosition(pos);
					if(ans== -404)
						System.out.println("Invalid position !");
					else
						mSdb.display(mSdb.s.get(ans));
					break;
				case 6:
				case 9:
					System.out.println("Enter name: ");
					name= name+sc.next();
					ans= mSdb.searchByName(name);
					if(ans== -404)
						System.out.println("No student with this Name !");
					else
						mSdb.display(mSdb.s.get(ans));
					break;
				case 10:
					mSdb.display();
					break;
				case 11:
					mSdb.sortByMarks();
					mSdb.display();
					break;
				case 12:
					System.out.println("--------------- GRADE A ---------------");
					mSdb.displayGradeCategory('A');
					System.out.println("---------------------------------------\n\n");
					System.out.println("--------------- GRADE B ---------------");
					mSdb.displayGradeCategory('B');
					System.out.println("---------------------------------------\n\n");
					System.out.println("--------------- GRADE C ---------------");
					mSdb.displayGradeCategory('C');
					System.out.println("---------------------------------------\n\n");
					System.out.println("--------------- GRADE F ---------------");
					mSdb.displayGradeCategory('F');
					System.out.println("---------------------------------------\n\n");
					break;
				case 13:
					mSdb.sortByPrn();
					mSdb.display();
					break;
				case 14:
					mSdb.sortByName();
					mSdb.display();
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