package marks;
import java.util.Scanner;


public class Java 
{
	public static void main(String[]args)
	{
	 int n,count=0;
    Scanner s = new Scanner(System.in);
    
    n = s.nextInt();
    
    int a[] = new int[n];
   
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
        
    }
    for(int i=0;i<n;i++)
    {
    	if(a[i]<50)
    		count++;
    	
    		
    		
    }
System.out.println(count);
	}
}

   