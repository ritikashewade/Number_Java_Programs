package NUMBER_PROGRAMS;

public class Composite_number {
	public static void main(String[] args)
	{
		int a=18;
		int count=0;
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println("composite number");
		}
		else
		{
			System.out.println("not a composite number");
		}
	}
}
