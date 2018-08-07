class MyNumRangeExcep extends Exception {
	String num="";
	
	MyNumRangeExcep()
	{
		
	}
	
	MyNumRangeExcep(String num)
	{
		this.num= num;
	}
	
	public String toString()
	{
		return ("Number "+num+" is outside range 0 to 12");
	}
}