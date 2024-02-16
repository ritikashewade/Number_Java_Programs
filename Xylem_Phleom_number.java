package NUMBER_PROGRAMS;

public class Xylem_Phleom_number {
	public static void main(String[] args) {
		int a = 34326;
		int b=a;
		int c=a;
		int sumM=0;
		int count=0;
		
		while(c>0)
		{
			count++;
			c/=10;
		}
		
		int div=1;
		for(int d=1;d<count;d++)
		{
			div=div*10;
		}
		
		int quo = b/div;	//3
		int r1=b%10;		//6
	
		int sumE=quo+r1;	//3+6
	
		b=b%div;			//4326
		b=b/10;				//432
		
		while(b>0)
		{
			int rem= b%10;
			sumM=sumM+rem;
			b/=10;
		}
		
		if(sumE==sumM)
		{
			System.out.println(sumE+" = "+sumM+" Xylem");
		}
		else
		{
			System.out.println(sumE+" != "+sumM+" Phleom");
		}
		
		
		
		
		
	}
}
