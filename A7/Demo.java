class Demo {
	
	static int factorial(int n)
	{
		if(n==0 || n==1)
			return n;
		else
		{
			return (n*factorial(n-1));
		}
	}
	
	public static void main(String args[])
	{
		int n=args.length, ll=0, ul=12;
		int nums[]= new int[n];
		int factos[]= new int[n];
		boolean error= false;
		
		try
		{
			for(int i=0; i<n; ++i)
			{
				nums[i]= Integer.parseInt(args[i]);
				if(nums[i]<ll || nums[i]>ul)
					throw new MyNumRangeExcep(""+nums[i]);
			}
		}
		catch(MyNumRangeExcep e)
		{
			error= true;
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			error= true;
			System.out.println("Please enter a valid integer");
		}
		if(!error)
		{
			System.out.println("Number\t\tFactorial");
			for(int i=0; i<n; ++i)
			{
				factos[i]= factorial(nums[i]);
				System.out.println(nums[i]+"\t\t"+factos[i]);
			}
		}
	}
}