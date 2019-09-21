package fibnocci;
import java.util.Scanner;


public class Java 
{
	public static void main(String[]args)
	{
	 int n,i=0,j=1,k;
    Scanner s = new Scanner(System.in);
    System.out.println(i+ " "+j);
    
    n = s.nextInt();
    for(i=2;i<n;i++);
    {
    	k=i+j;
    	System.out.println(" "+k);
    	i=j;
    	j=k;
    }
    
    
    
	}
}
	
    
    
    
   
 

    
    	
    
    		
    		