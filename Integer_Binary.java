package NUMBER_PROGRAMS;

public class Integer_Binary {
		public static void main(String[] args)   
		{ 
			int val=18;
			int num[] = new int[32];
			int pos=0;
			while(val>0)
			{
				num[pos++]=val%2;
				val=val/2;
			}
			System.out.print("Value in binary system is:");
			for(int i=pos-1; i>=0; i--)
			{
				System.out.print(num[i]);
			}
		} 
	
}
