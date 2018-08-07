import java.io.*;
import java.util.*;

public class Demo
{
	private static Scanner sc = new Scanner (System.in);
	private static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	static void dispNum(Rational n)
	{
		System.out.println(n.num+"/"+n.den);
	}
	
	public static void main(String[] args) throws Exception
	{
		int n1= -1, n2= -1, d1= -1, d2= -1, cmp= -1; double fp= -1;
		int choice= -1, c= -1, flag= 0;
		Rational rn1= null, rn2= null, ans= null;
		RationalCalci mCalci= new RationalCalci();
		try {
			n1= Integer.parseInt(args[0]);
			d1= Integer.parseInt(args[1]);
			if(d1==0)
				throw new ZeroException("number 1");
			n2= Integer.parseInt(args[2]);
			d2= Integer.parseInt(args[3]);
			if(d2==0)
				throw new ZeroException("number 2");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter a valid integer");
			System.out.println(e);
			flag= 1;
		}
		catch(ZeroException e)
		{
			System.out.print("Denominator cannot be 0 in ");
			System.out.println(e);
			flag= 1;
		}
		if(flag!=1)
		{
			rn1= new Rational(n1, d1);
			rn2= new Rational(n2, d2);
			do
			{
				System.out.println ("__________________________________________________________________________");
				System.out.println ("\t\t\tRATIONAL CALCULATOR");
				System.out.println ("__________________________________________________________________________\n");
				System.out.println ("\t 1 -----> Add");
				System.out.println ("\t 2 -----> Subtract");
				System.out.println ("\t 3 -----> Multiply");
				System.out.println ("\t 4 -----> Divide");
				System.out.println ("\t 5 -----> Convert to floating point");
				System.out.println ("\t 6 -----> Reduce");
				System.out.println ("\t 7 -----> Compare");
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
						ans= mCalci.add(rn1, rn2);
						System.out.print("Sum ---> ");
						dispNum(ans);
						break;
					case 2:
						ans= mCalci.subtract(rn1, rn2);
						System.out.print("Difference ---> ");
						dispNum(ans);
						break;
					case 3:
						ans= mCalci.multiply(rn1, rn2);
						System.out.print("Product ---> ");
						dispNum(ans);
						break;
					case 4:
						ans= mCalci.divide(rn1, rn2);
						System.out.print("Quotient ---> ");
						dispNum(ans);
						break;
					case 5:
						fp= mCalci.convert(rn1);
						System.out.println ("Floating point conversion ---> "+fp);
						break;
					case 6:
						rn1= mCalci.reduce(rn1);
						System.out.print("Reduced 1st number ---> ");
						dispNum(rn1);
						break;
					case 7:
						cmp= mCalci.compare(rn1, rn2);
						if(cmp==1)
							System.out.println("First number is greater");
						else if(cmp==-1)
							System.out.println("Second number is greater");
						if(cmp==0)
							System.out.println("Both numbers equal");
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
		else
			System.out.println ("Try again with correct values");
	}
}