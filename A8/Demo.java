import java.io.*;

class Demo {
	
	private static BufferedReader br= new BufferedReader(
		new InputStreamReader(System.in));
	
	public static void main(String args[]) throws IOException
	{
		boolean error= false;
		String str="";
		try
		{
			System.out.print("Enter the string: ");
			str+= br.readLine();
			if(!str.equals("India"))
				throw new NoMatchExcep(str);
		}
		catch(NoMatchExcep e)
		{
			error= true;
			StackTraceElement mSTrace[]= e.getStackTrace();
			int ln= mSTrace[mSTrace.length - 1].getLineNumber();
			System.out.println(e+" at line "+ln);
		}
		if(!error)
		{
			System.out.println("String matches with \"India\" !");
		}
	}
}