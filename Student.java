/**
   Mohammed Raza
   CSC 236 - Lab3 #2 (class 2)
*/

import java.util.*;

public class Student
{

	private studentNode firstNode;
	String coid;
	String sec;
	String cred;

	public Student()
	{
		firstNode = null;

	}

	public Student(String coid, String sec, String cred)
	{
		firstNode = null;

	}

	public void setStudent(String co, String ss, String cr)
	{
		coid = co;
		sec = ss;
		cred = cr;
	}

	public boolean isEmpty()
	{
		return firstNode == null;
	}

	public studentNode getFirstNode()
	{
		return firstNode;
	}

	public void setFirstNode(studentNode node)
	{
		firstNode = node;
	}

	//Method to add courses:
	public void add(Object coid, Object sec, Object cred)
	{
		if (isEmpty())
			firstNode = new studentNode(coid, sec, cred, null);
		else
		{
			studentNode current = firstNode;
			while (current.getNext() != null)
				current = current.getNext();

			current.setNext(new studentNode(coid, sec, cred, null));

		}

	}

	// Method to drop course:
	public Object drop()
	{
		if (isEmpty())
			throw new NoSuchElementException("Can't remove from empty list");
		studentNode current = firstNode;
		studentNode follow = null;
		while (current.getNext() != null)
		{
			follow = current;
			current = current.getNext();
		}

		if (follow == null)
			firstNode = null;
		else
			follow.setNext(null);

		return current.getValue3();

	}

	public String toString()
	{
		if(isEmpty())
			return "empty";
		else
		{
			String s = "";
			studentNode current = firstNode;
			while(current != null)
			{
				s = s + current.getValue1() + " | " + current.getValue2() + " | " + current.getValue3() + "\n";
				current = current.getNext();
			}
			return s;
		}

	}

}

