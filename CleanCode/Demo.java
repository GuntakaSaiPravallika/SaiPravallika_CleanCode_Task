package CleanCode;
import java.util.*;
public class Demo
{
	public static void main(String[] args) 
	{
		double rate,time,amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount ");
		amount=sc.nextDouble();
		System.out.println("Enter the number of years ");
		time=sc.nextDouble();
		System.out.println("Enter the rate ");
		rate=sc.nextDouble();
		InterestCalculation i=new InterestCalculation(rate,time,amount);
		System.out.println("Simple interest is "+i.simpleInterest());
		System.out.println("Compound interest is "+i.compoundInterest());


	}
}