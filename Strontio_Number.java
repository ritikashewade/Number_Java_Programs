package NUMBER_PROGRAMS;

public class Strontio_Number {
	public static void main(String[] args) {
		int a=3003;
		int a1=a;
		int a2=a;
		int count=0;
		while(a2>0)
		{
			count++;
			a2/=10;
		}
		if(count==4)
		{
			int b=a*2;
			int div=1;
			for(int i=1;i<count;i++)
			{
				div=div*10;
			}
		
			int r = b % div;
			
			b = r / 10;
			
			int rem = b % 10;
			
			b /= 10;
			
			if(rem==b)
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		else
		{
			System.out.println("It cannot be a Strontio number");
		}
	}
	
}
