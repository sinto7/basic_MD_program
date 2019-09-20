package average;
import java.util.Scanner;


public class Java 
{
	public static void main(String[]args)
	{
	 int n, average=0,sum=0;
    Scanner s = new Scanner(System.in);
    
    n = s.nextInt();
    
    int a[] = new int[n];
   
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
        sum=sum+a[i];
    }
    
    average=sum/n;
    
    
    System.out.println(average);
    }
}
   