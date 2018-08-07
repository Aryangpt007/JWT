abstract class Employee {
	
	private String name, address;
	protected float basicSalary;
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public float getBasicSalary(){
		return basicSalary;
	}
	public void setAddress(String add){
		address = add;
	}
	public void setName(String nm){
		name = nm;
	}
	public void setBasicSalary(float sal){
		basicSalary = sal;
	}
	public abstract float getMonthlySalary();
}