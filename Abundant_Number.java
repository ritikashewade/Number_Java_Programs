package NUMBER_PROGRAMS;

public class Abundant_Number {
public static void main(String[] args) {
	int a=12;
	int a1=a;
	int sum=0;
	for(int i=1;i<a;i++)
	{
		if(a%i==0)
		{
			sum=sum+i;
		}
	}
	if(a1<sum)
	{
		System.out.println(a1+"<"+sum+" is a abundant number");
	}
	else
	{
		System.out.println(a1+">"+sum+" is not a abundant number");
	}
}
}
