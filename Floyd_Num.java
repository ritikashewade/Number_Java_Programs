package NUMBER_PROGRAMS;

public class Floyd_Num {
	public static void main(String[] args) {
		int row=6;
		int k=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
	}
}
