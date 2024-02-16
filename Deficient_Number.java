package NUMBER_PROGRAMS;

public class Deficient_Number {
	public static void main(String[] args) {
		int a=14;
		int a1=a;
		int sum=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if(a1>sum)
		{
			System.out.println(a1+">"+sum+" is a deficient number");
		}
		else
		{
			System.out.println(a1+"<"+sum+" is not a deficient number");
		}
	}
}
