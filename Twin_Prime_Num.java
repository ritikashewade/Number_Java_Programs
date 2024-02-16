package NUMBER_PROGRAMS;

public class Twin_Prime_Num {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++)
		{
			int a=i;
			int b=a+2;
			if(isPrime(a) && isPrime(b))
			{
				System.out.println(a+" , "+b);
			}
		}
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
