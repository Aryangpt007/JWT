class NoMatchExcep extends Exception {
	String str="";
	
	NoMatchExcep()
	{
		
	}
	
	NoMatchExcep(String str)
	{
		this.str+=str;
	}
	
	public String toString()
	{
		return ("Mismatching string \""+str+"\"");
	}
}