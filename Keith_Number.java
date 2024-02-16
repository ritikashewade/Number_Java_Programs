package NUMBER_PROGRAMS;

public class Keith_Number {
	public static void main(String[] args) {
		int a=742;
		int a1=a;
		int a2=a;
		int a3=a;
		int sum=0;
		int count=0;
		
		while(a3>0)
		{
			count++;
			a3/=10;
		}
		int div=1;
		for(int i=1;i<count;i++)
		{
			div=div*10;
		}	
		while(a1>0 || sum!=a2)
		{
			if(a1==0)
			{
				a1=a2;
				a1=a1%div;
			}
			int rem=a1%10;
			sum=sum+rem;
			a1/=10;
		}
		if(a==sum)	
		{
		System.out.println(sum);
		}
		else
		{
			System.out.println("no");
		}
	}
}
