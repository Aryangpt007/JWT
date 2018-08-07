import java.io.*;
import java.util.*;

public class Stack
{
	int size, top, data[], count;
	
	Stack()
	{
		size=0; count=0;
		top=-1;
	}
	
	Stack(int s)
	{
		size= s;
		top= -1;
		count= 0;
		data= new int[size];
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	boolean isFull()
	{
		if(top==size-1)
			return true;
		return false;
	}
	
	void push(int n)
	{
		if(isFull())
		{
			System.out.println("Cannot push\nStack full !");
		}
		else
		{
			data[++top]= n;
			++count;
		}
	}
	
	int pop()
	{
		int temp= 404;
		if(isEmpty())
		{
			System.out.println("Cannot pop\nStack empty !");
		}
		else
		{
			temp= data[top];
			data[top--]= 0;
			--count;
		}
		return temp;
	}
	
	void disp()
	{
		if(isEmpty())
		{
			System.out.println("STACK EMPTY !");
		}
		else
		{
			for(int i= count-1; i>=0; --i)
				System.out.println("|  "+data[i]+"  |");
		}
	}
}