package arranging;
import java.util.Scanner;


public class Java 
{
	public static void main(String[]args)
	{
	 int n, temp;
    Scanner s = new Scanner(System.in);
    
    n = s.nextInt();
    int a[] = new int[n];
   
    for (int i = 0; i < n; i++) 
    {
        a[i] = s.nextInt();
    }
    for (int i=0;i<n;i++) {
    	for (int j=i;j<n;j++) {
    		if(a[i]>a[j]) {
    			 temp=a[i];
    			a[i]=a[j];
    			 a[j]=temp;
    		}
    	}
    }
    for (int k=0;k<n;k++)
    System.out.println(a[k]);
    }
    
}
