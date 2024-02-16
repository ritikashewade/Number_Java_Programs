package NUMBER_PROGRAMS;

public class PrimeFactor {
	public static void main(String[] args) {
		int a=72;
		int a1=a;
		int sum=0;
		for(int i=2;i<a1;i++)
		{
			while(a1%i==0)
			{
				System.out.println(i);
				a1/=i;
			}
		}
				
		
	}

}
