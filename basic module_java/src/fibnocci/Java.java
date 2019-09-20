package fibnocci;
import java.util.Scanner;


public class Java 
{
	public static void main(String[]args)
	{
	 int n,a,b,sum=0;
    Scanner s = new Scanner(System.in);
    
    n = s.nextInt();
    a=s.nextInt();
    b=s.nextInt();
    
    
    
   
    for (int i = 0; i <= n; i++) 
    {
    	
    		a=i;
    
    for(int j=1;j<=n;j++)
    {
    	b=j;
    
    sum=a+b;
    System.out.println(sum);
	}

    
    	
    
    		
    		