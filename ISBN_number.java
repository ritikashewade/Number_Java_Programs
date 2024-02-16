package NUMBER_PROGRAMS;

public class ISBN_number {
	public static void main(String[] args) {
		long a=8147852369l;
		long b=a;
		long c=a;
		int count=0;
		long sum=0;
	
		
		while(c>0)
		{
			count++;
			c/=10;
		}
		if(count==10)
		{
			for(int i=10;i>=1;i--)
			{
				while(b>0)
				{
					long rem=b%10;
					rem=i*rem;
					
				}
			}
		}
	
		else
		{
			System.out.println("number is invalid");
		}
	}
}

