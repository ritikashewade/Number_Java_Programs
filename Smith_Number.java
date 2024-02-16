package NUMBER_PROGRAMS;

public class Smith_Number {

public static void main(String[] args) 
{
	int a=265;
	int check=2;
	int sum=sumOf(a);
	int sumf=0;

	while(a>0)
	{
		if(a%check==0)
		{
			a=a/check;
			sumf=sumf+sumOf(check);
		}
		else if(check>a)
		{
			break;
		}
		else
		{
			check++;
		}
	}
	if(sum==sumf)
	{
		System.out.println(sum+" = "+sumf);
	}
	else
	{
		System.out.println(sum+" != "+sumf);
	}
	
}

public static int sumOf(int num)
{
		int a=num;
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
			
		}
		return sum;
}
	
}