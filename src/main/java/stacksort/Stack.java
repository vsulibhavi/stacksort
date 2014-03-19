package stacksort;

import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

public class Stack {

	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	int top = -1;
	
	public void push(int i)
	{
		top++;
		arrayList.add(i);
		
	}
	public int pop() throws OperationNotSupportedException
	{
		
		
		if(top == -1)
		{
			throw new OperationNotSupportedException("Stack empty");
		}
		int x = arrayList.remove(top);
		top--;
		return x;
	}
	
	public int peek()
	{
		return arrayList.get(top);
		
	}
	
	public boolean isEmpty()
	{
		return top == -1;
	}
	
	public int size()
	{
		return arrayList.size();
	}
	
	
	
}
