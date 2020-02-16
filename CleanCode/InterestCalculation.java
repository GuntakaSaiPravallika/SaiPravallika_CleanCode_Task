package CleanCode;
import java.util.*;
public class InterestCalculation implements Interest
{
	double rate,amount,time;
	InterestCalculation(double r,double a,double t)
	{
		rate=r;
		amount=a;
		time=t;
	}
	public double simpleInterest()
	{
		double s;
		s=(amount * time * rate)/100;
		return s;
	}
	public double compoundInterest()
	{
		double c;
		c=amount * Math.pow(1.0+rate/100.0,time) - amount;
		return c;
	}
}