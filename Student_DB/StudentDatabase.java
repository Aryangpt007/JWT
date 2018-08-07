import java.io.*;
import java.util.*;

class StudentDatabase
{
	ArrayList<Student>  s, A, B, C, F;

	StudentDatabase()
	{
		s= new ArrayList<Student>();
		A= new ArrayList<Student>();
		B= new ArrayList<Student>();
		C= new ArrayList<Student>();
		F= new ArrayList<Student>();
	}

	void addStu(Student newStu)
	{	
		s.add(newStu);
		assignGrades();
	}

	void editStu(Student newStu, int pos)
	{	s.set(pos, newStu);	}

	int deleteStu(long prn)
	{
		int ans= searchByPrn(prn);
		if(ans==-404)
			return -404;
		else
			s.remove(ans);
			return 1;
	}

	void sortByPrn()
	{
		Student temp;
		for(int i=0; i<s.size(); ++i)
		{
			for(int j=0; j<s.size()-1-i; ++j)
			{
				if(s.get(j).prn>s.get(j+1).prn)
				{
					temp = s.get(j);
					s.set(j, s.get(j+1));
					s.set(j+1, temp);
				}
			}
		}
	}

	void sortByMarks()
	{
		Student temp;
		for(int i=0; i<s.size(); ++i)
		{
			for(int j=0; j<s.size()-1-i; ++j)
			{
				if(s.get(j).totalMks<s.get(j+1).totalMks)
				{
					temp = s.get(j);
					s.set(j, s.get(j+1));
					s.set(j+1, temp);
				}
			}
		}
	}

	void sortByName()
	{
		Student temp;
		for(int i=0; i<s.size(); ++i)
		{
			for(int j=0; j<s.size()-1-i; ++j)
			{
				if(((s.get(j).name).compareTo(s.get(j+1).name)>0))
				{
					temp = s.get(j);
					s.set(j, s.get(j+1));
					s.set(j+1, temp);
				}
			}
		}
	}

	void assignGrades()
	{
		for(Student x: s)
		{
			if(x.percentage<40)
				x.grade= 'F';
			else if(x.percentage<60)
				x.grade= 'C';
			else if(x.percentage<80)
				x.grade= 'B';
			else
				x.grade= 'A';
		}
	}

	void classify()
	{
		for(Student x: s)
		{
			switch(x.grade)
			{
				case 'A':
					A.add(x);
					break;
				case 'B':
					B.add(x);
					break;
				case 'C':
					C.add(x);
					break;
				case 'F':
					F.add(x);
					break;
			}
		}
	}

	void displayGradeCategory(char grade)
	{
		assignGrades();
		classify();
		for(Student x: s)
		{
			if(x.grade==grade)
				display(x);
		}
	}

	int searchByPrn(long prn)
	{
		boolean found= false;
		int position= -1;

		for(Student x: s)
		{
			if(x.prn==prn)
			{
				found= true;
				position= s.indexOf(x);
			}
			if(found)
				break;
		}
		if(found)
			return position;
		return -404;
	}

	int searchByPosition(int pos)
	{
		if (pos>=0 && pos<s.size())
			return pos;
		else
			return -404;
	}

	int searchByName(String name)
	{
		boolean found= false;
		int position= -1;

		for(Student x: s)
		{
			if((x.name).equalsIgnoreCase(name))
			{
				found= true;
				position= s.indexOf(x);
			}
			if(found)
				break;
		}
		if(found)
			return position;
		return -404;
	}

	void display(Student s)
	{
		System.out.println("________________________________________________");
		System.out.print("NAME: "+s.name+"\t");
		System.out.println("PRN: "+s.prn);
		System.out.print("AGE: "+s.age+"\t");
		System.out.println("DATE OF BIRTH: "+s.dob);
		System.out.println("................................................");
		System.out.println("\t\tMARKS");
		System.out.println("................................................");
		System.out.println("Subject 1\t\t"+s.sub1);
		System.out.println("Subject 2\t\t"+s.sub2);
		System.out.println("Subject 3\t\t"+s.sub3);
		System.out.println("Subject 4\t\t"+s.sub4);
		System.out.println("Subject 5\t\t"+s.sub5);
		System.out.println("Subject 6\t\t"+s.sub6);
		System.out.println("................................................");
		System.out.println("PERCENTAGE: "+s.percentage+"\tGRADE: "+s.grade);
		System.out.println("................................................");
	}

	void display(long prn)
	{
		int found= searchByPrn(prn);
		if(found== -404)
			System.out.println("Sorry! No student with this PRN");
		else
			display(s.get(found));
	}

	void display(int pos)
	{
		if(pos>=0 && pos<s.size())
			display(s.get(pos));
		else
			System.out.println("Wrong position entered!");
	}

	void display(String name)
	{
		int found= searchByName(name);
		if(found== -404)
			System.out.println("Sorry! No student with this PRN");
		else
			display(s.get(found));
	}

	void display()
	{
		for(Student x: s)
		{
			display(x);
			System.out.println();
		}
	}
}