package NUMBER_PROGRAMS;

public class Neon_Number {
	public static void main(String[] args) {
		int a=45;
		int a1=a;
		int s=a*a;
		int sum=0;
		while(s>0)
		{
			int rem=s%10;
			sum=sum+rem;
			s/=10;
		}
		if(a1==sum)
		{
			System.out.println("neon");
		}
		else
		{
			System.out.println("not");
		}
		
		
	}
}
