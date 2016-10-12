/**
   Mohammed Raza
   CSC 236 - Lab3 #2 (main)
*/

import java.util.*;

public class StudentDemo
{
	static Scanner keyboard = new Scanner(System.in);

	public static Student getList1()
	{

		String coid;
		String sec;
		String cred;

		Student value1 = new Student();

			System.out.println("Enter the Course Id, Section #, and Number of Credits for student 1 (-999 to end):");
			coid = keyboard.next();
			sec = keyboard.next();
			cred = keyboard.next();

			while (!(coid.equals("-999")) || !(sec.equals("-999")) || !(cred.equals("-999")))
			{
				value1.add(coid,sec,cred);
				coid = keyboard.next();
				sec = keyboard.next();
				cred = keyboard.next();
			}

			return value1;
		}

	public static Student getList2()
	{

		String coid;
		String sec;
		String cred;

		Student value2 = new Student();


			System.out.println("Enter the Course Id, Section #, and Number of Credits for student 2 (-999 to end):");
			coid = keyboard.next();
			sec = keyboard.next();
			cred = keyboard.next();

			while (!(coid.equals("-999")) || !(sec.equals("-999")) || !(cred.equals("-999")))
			{
				value2.add(coid,sec,cred);
				coid = keyboard.next();
				sec = keyboard.next();
				cred = keyboard.next();
			}

			return value2;
		}

	public static Student getList3()
	{

		String coid;
		String sec;
		String cred;

		Student value3 = new Student();


			System.out.println("Enter the Course Id, Section #, and Number of Credits for student 3 (-999 to end):");
			coid = keyboard.next();
			sec = keyboard.next();
			cred = keyboard.next();

			while (!(coid.equals("-999")) || !(sec.equals("-999")) || !(cred.equals("-999")))
			{
				value3.add(coid,sec,cred);
				coid = keyboard.next();
				sec = keyboard.next();
				cred = keyboard.next();
			}



			return value3;
		}


	public static void main(String[] args)
	{
		int input;
		String ad;
		String course;
		String section;
		String credits;

		System.out.println("::: Student Schedule as Linked List :::\n");

		Student value1 = getList1();

		System.out.print("The 1st student's schedule is: ");
		System.out.println("\n"+value1);

		System.out.println("");

		Student value2 = getList2();

		System.out.print("The 2nd student's schedule is: ");
		System.out.println("\n"+value2);

		System.out.println("");

		Student value3 = getList3();

		System.out.print("The 3rd student's schedule is: ");
		System.out.println("\n"+value3);

		System.out.println("\nEnter which student's schedule to add/drop course form: ");
		input = keyboard.nextInt();

		System.out.println("Enter which to execute (add or drop)");
		ad = keyboard.next();

		if (input == 1 && ad == "add")
		{
			System.out.println("Enter the Course Id, Section #, and Number of Credits:");
			course = keyboard.next();
			section = keyboard.next();
			credits = keyboard.next();

			value1.add(course,section,credits);

			System.out.println("Course added - Now student1's schedule is: ");
			System.out.println("\n"+value1);
		}

		else if (input == 2 && ad == "add")
		{
			System.out.println("Enter the Course Id, Section #, and Number of Credits:");
			course = keyboard.next();
			section = keyboard.next();
			credits = keyboard.next();

			value2.add(course,section,credits);

			System.out.println("Course added - Now student2's schedule is: ");
			System.out.println("\n"+value2);
		}

		else if (input == 3 && ad == "add")
		{
			System.out.println("Enter the Course Id, Section #, and Number of Credits:");
			course = keyboard.next();
			section = keyboard.next();
			credits = keyboard.next();

			value3.add(course,section,credits);

			System.out.println("Course added - Now student3's schedule is: ");
			System.out.println("\n"+value3);
		}

		else if (input == 1 && ad == "drop")
		{
			String last1 = (String) value1.drop();
			System.out.println("Last course dropped - Now student1's schedule is: ");
			System.out.println("\n"+value1);
		}

		else if (input == 2 && ad == "drop")
		{
			String last2 = (String) value2.drop();
			System.out.println("Last course dropped - Now student2's schedule is: ");
			System.out.println("\n"+value2);
		}

		else if (input == 3 && ad == "drop")
		{
			String last3 = (String) value3.drop();
			System.out.println("Last course dropped - Now student3's schedule is: ");
			System.out.println("\n"+value3);
		}

		else

			System.out.print("error");

	}




}