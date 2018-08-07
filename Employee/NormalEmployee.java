class NormalEmployee extends Employee {
	
	public float getMonthlySalary()
	{
		return (getBasicSalary()/12);
	}
}