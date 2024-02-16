package NUMBER_PROGRAMS;
import java.util.Scanner;
public class Integer_Biniary {
	public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number:");
        int n = sc.nextInt();
        String str = "";
        
        while(n > 0)
        {
            int a = n % 2;
            str =str+a;
            n = n / 2;
        }
        System.out.println(str);
    }
}
