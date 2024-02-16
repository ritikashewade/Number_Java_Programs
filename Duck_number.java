package NUMBER_PROGRAMS;
import java.util.Scanner;
public class Duck_number {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number=");
		int a=sc.nextInt();		
		int a1=a;
		int a2=a;
		int count=0;
		int c=0;
		while(a1>0)
		{
			count++;
			a1/=10;
		}

		int div=1;
		for(int d=1;d<=count;d++)
		{
			div=div*10;
		}
	
		while(a2>0)
		{
			int rem=a2%10;		
			if(rem==0)
			{
				c++;
			}
			a2/=10;
		}
		
		if(c!=0)
		{
			System.out.println("Duck number "+ a);
		}
		else
		{
			System.out.println("not duck number");
		}
		
	}
}
