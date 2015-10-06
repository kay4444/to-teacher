package HomeworkPackage;
import java.util.ArrayList;
import java.util.Scanner;

//Создайте программу, вычисляющую факториал числа n, которое пользователь введёт с клавиатуры

public class HomeworkClass1 
{
	Scanner scan = new Scanner (System.in);
	ArrayList mas = new ArrayList();
	
public void Factorial()
{
	System.out.println ("Enter a ditit to calculate factorial: ");
	int fac = scan.nextInt();
	int fc=1;
	for (int i=1; i<=fac; i++)
	{
		fc=fc*i;
	}
	System.out.println("Factoril of " + fac + " is: " + fc);
}

//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, 
//записанных в переменные m и n. 

public void NearTen()
	{
	System.out.println ("Enter first digit: ");
	int m = scan.nextInt();
	System.out.println ("Enter second digit: ");
	int n = scan.nextInt();
	if (10-m>10-n)
	{
		System.out.println("The nearest to 10 is the second entered digit: "+n);
	}
	else
	{
		System.out.println("The nearest to 10 is the first entered digit: "+m);
	}
	}

// В три переменные a, b и c записаны три вещественных числа. 
// Создать программу, которая будет находить и выводить на экран 
//вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.

public void Sqrt()
	{
	System.out.println ("Enter unknown variable \"a\" of \"ax^2 + bx + c = 0\" formula:");
	int a = scan.nextInt();
	System.out.println ("Enter unknown variable \"b\" of \"ax^2 + bx + c = 0\" formula:");
	int b = scan.nextInt();
	System.out.println ("Enter unknown variable \"c\" of \"ax^2 + bx + c = 0\" formula:");
	int c = scan.nextInt();
	
	double d = b*b-(4*a*c);
	if (d<0)
	{
		System.out.println("There are no radicals for current meaning of a, b and c ");
	}
	else
	{
		if (d==0)
		{
			double dd = Math.sqrt(d);
			double x = (-b+d)/2*a;
			System.out.println("There is one radical for current meaning of a, b and c. It is: " + x);
		}
		else
		{
			if (d>0)
			{
				double dd = Math.sqrt(d);

	            double x1 = (-b+dd)/2*a;
	                int i1 = (int) x1;
	            double x2 = (-b-dd)/2*a;
	                int i2 = (int) x2;
				System.out.println ("There are two radicals. They are: "+ x1 + " and " +x2);
			}
		}
	}
	}

/* Для введённого пользователем с клавиатуры натурального числа посчитайте 
 * сумму всех его цифр (заранее не известно сколько цифр будет в числе).
 */
public void SumMas()
	{
	System.out.println("Enter a massive of digits splitted by space:");
	String st = scan.nextLine();
	String[] ms = st.split(" ", -1);
	int mas[] = new int [ms.length];
	for (int i=0; i<ms.length; i++)
	{
		Integer x = Integer.valueOf(ms[i]);
		mas[i]=x;
	}
	int sum=0;
	for (int j=0; j<mas.length; j++)
	{
		sum=sum+mas[j];
	}
	
	/*mas.add(scan.nextLong());
	int mas2[] = new int [mas.size()];
	int sum=0;
	for (int index : mas2) sum=sum+index;*/
	System.out.println("The summ of all elements is: " + sum);
	}

/* 
 * В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. 
 * Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. 
 * «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, 
 * например, в билетах с номерами 003102 или 567576. 
 * Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает, 
 * как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 */
public void LuckyTicket()
	{
	int num=0;
	 for(int i=1001;i<1000000;i++)
	 {
         int i1=i/100000%10,
             i2=i/10000%10,
             i3=i/1000%10,
             i4=i/100%10,
             i5=i/10%10,
             i6=i%10;
         if (i1+i2+i3==i4+i5+i6)
         {
        	 num++;
         }
	 }
	 System.out.println("The number of lucky tickets is: "+num);
	}

}