import java.time.*;

class Student
{
	long prn; int age, rank;
	String name= ""; char grade;
	double sub1, sub2, sub3, sub4, sub5, sub6, totalMks, percentage;
	LocalDate dob;

	Student() {}

	Student(long prn, String name, double sub1, double sub2, double sub3,
		double sub4, double sub5, double sub6, int age, LocalDate dob)
	{
		this.prn= prn;
		this.name= this.name+name;
		this.sub1= sub1;
		this.sub2= sub2;
		this.sub3= sub3;
		this.sub4= sub4;
		this.sub5= sub5;
		this.sub6= sub6;
		totalMks= sub1+sub2+sub3+sub4+sub5+sub6;
		percentage= totalMks/6;
		this.age= age;
		this.dob= dob;
	}
}