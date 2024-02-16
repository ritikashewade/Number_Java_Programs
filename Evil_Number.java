package NUMBER_PROGRAMS;
import java.util.*; 
public class Evil_Number {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int x=sc.nextInt();
		convert(x);
	}
	
	public static void convert(int x1)
	{
		int a=x1;
		int a1=a;
		int sum=0;
		int count=0;
		while(a1>0)
		{
			int rem=a1%2;
			if(rem==1)
			{
				count++;
			}
			a1/=2;
		}
		if(count%2==0)
		{
			System.out.println("Evil number as it's binary number has even number of counts of 1's i.e., "+count);
		}
		else
		{
			System.out.println("Odious number because the number of counts of 1's is odd in it's binary number i.e., "+count);
		}
	}
}



