package NUMBER_PROGRAMS;

public class Peterson_number {
	public static void main(String[] args) {
		int a=145;
		int b=a;
		int c=a;
		int sum=0;
		while(c>0)
		{
			int rem = c % 10;
			int pro=1;
			for(int i=1;i<=rem;i++)
			{
				pro=pro*i;
			}
			sum=sum+pro;
			c/=10;
		}
		if(a==sum)
		{
			System.out.println("Peterson number");
		}
		else
		{
			System.out.println("not Peterson number");
		}
	}
}
