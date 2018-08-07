import java.io.*;
import java.util.*;

class ToDoList
{
	Vector listItems;
	
	ToDoList()
	{
		listItems= new Vector();
	}
	
	void add(String str)
	{
		listItems.add(str);
	}
	
	void edit(Object str, int i)
	{
		listItems.setElementAt(str, i);
	}
	
	void delete(Object str)
	{
		listItems.remove(str);
	}
	
	void display()
	{
		System.out.println("_________________________________________________");
		System.out.println("\t\t TO DO LIST");
		System.out.println("_________________________________________________\n");
		for( Object x: listItems )
			System.out.println(x.toString()+"\n");
		System.out.println("_________________________________________________");
	}
	
	int search(String s)
	{
		for( Object x: listItems )
		{
			if((x.toString()).equalsIgnoreCase(s) || (x.toString()).contains(s.toLowerCase()))
				return listItems.indexOf(x);
		}
		
		return -404;
	}
}