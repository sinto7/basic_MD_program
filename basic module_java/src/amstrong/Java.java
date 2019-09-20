package amstrong;
import java.util.Scanner;

public class Java {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int sum=0,count=0,m,j;
		int k=n;
		int 
		temp=n;
		int s = 0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		
			
			
			while(k>0)
			{
				m=k%10;
                s= s+(int) Math.pow(m,count);
				k=k/10;
			
			}
			//System.out.println(s);

			if(s==temp)
			System.out.println("amstrong");
			else
			{
				
				System.out.println("not amstrong");
	}
	}
}

	
	
			
		
		
			
		
	


