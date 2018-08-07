import java.util.*;

class BonusEmployee extends Employee {
	private static Scanner sc= new Scanner(System.in);
	
	public float getMonthlySalary()
	{
		float mSalary, base, brate;
		
		base= getBasicSalary()/12;
		System.out.print("Enter bonus percentage rate: ");
		brate= sc.nextFloat()/100;
		mSalary= base+base*brate;
		return (mSalary);
	}
}