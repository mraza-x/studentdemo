/**
   Mohammed Raza
   CSC 236 - Lab3 #2 (class 1)
*/

public class studentNode
{
	private Object value1;
	private Object value2;
	private Object value3;
	private studentNode next;


	public studentNode(Object initValue1, Object initValue2, Object initValue3, studentNode initNext)
	{
		value1 = initValue1;
		value2 = initValue2;
		value3 = initValue3;
		next = initNext;
	}

	public Object getValue1()
	{
		return value1;
	}

	public Object getValue2()
	{
		return value2;
	}

	public Object getValue3()
	{
		return value3;
	}

	public studentNode getNext()
	{
		return next;
	}

	public void setValue1(Object theNewValue1)
	{
		value1 = theNewValue1;
	}

	public void setValue2(Object theNewValue2)
	{
		value2 = theNewValue2;
	}

	public void setValue3(Object theNewValue3)
	{
		value3 = theNewValue3;
	}

	public void setNext(studentNode theNewNext)
	{
		next = theNewNext;
	}
}