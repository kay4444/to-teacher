package HomeworkPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static Scanner sc = new Scanner(System.in);
	ArrayList mas = new ArrayList();
	public static void main (String [] args)
	{
		HomeworkClass1 c = new HomeworkClass1();
		System.out.println("Please choose the action to perform:");
		System.out.println("Enter digit 1 if you would like to calculate a factorial of a digit");
		System.out.println("Enter digit 2 if you would like to determine the nearest to 10 digit");
		System.out.println("Enter digit 3 if you would like to calculate the formula: ax^2 + bx + c = 0");
		System.out.println("Enter digit 4 if you would like to calculate the summ of entered massive of digits");
		System.out.println("Enter digit 5 if you would like to determane the number of lucky tickets");
		String in = sc.nextLine();
		Integer inn = Integer.valueOf(in);
		if (inn==1) c.Factorial();
		if (inn==2) c.NearTen();
		if (inn==3) c.Sqrt();
		if (inn==4) c.SumMas();
		if (inn==5) c.LuckyTicket();
	}

}
