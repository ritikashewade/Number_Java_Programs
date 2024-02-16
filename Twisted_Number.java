package NUMBER_PROGRAMS;

public class Twisted_Number {
	public static void main(String[] args) {
		int a=3;
		int rev=reverseNum(a);
		if(isPrime(a))
		{
			if(isPrime(rev))
			{
				System.out.println("Twisted");
			}
			else
			{
				System.out.println("It's rev is not prime");
			}
		}
		else
		{
			System.out.println("not prime");
		}
	}
	
	public static int reverseNum(int a)
	{
		int a1=a;
		int rev=0;
		while(a1>0)
		{
			int rem=a1%10;
			rev=rev*10+rem;
			a1/=10;
		}
		if(a==rev)
		{
			return rev;
		}
		else
			return 0;
	}
	
	public static boolean isPrime(int a)
	{
		int count=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
