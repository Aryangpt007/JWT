class ZeroException extends Exception {
	String msg="";
	
	ZeroException() { msg+=""; }

	ZeroException(String msg)
	{
		this.msg= msg;
	}
	
	public String toString()
	{
		return msg;
	}
}