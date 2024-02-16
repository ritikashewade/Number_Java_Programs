package NUMBER_PROGRAMS;

public class Unique_Digit_Number {
	
	public static void main(String[] args) {
		int a=12345;
		int a1=a;
		int a2=a;
		int count=0;
		while(a1>0)
		{
			int rem=a1%10;
			while(a2>0)
			{
				int rem1=a2%10;
			
				if(rem==rem1)
				{
					count++;
				}
			}
			a1=a1/10;
		}
		if(count==1)
		{
			System.out.println("Unique");
		}
		else
		{
			System.out.println("not");
		}
		
	}
}

//not done yet