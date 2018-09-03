package day1;
import java.util.*;
public class ArmstrongRange {

	public static void main(String[] args) {
	
		int i,start,end,digit,copy1,copy2,sum=0;
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("Enter the start of range");
		start=in.nextInt();
		
		System.out.println("Enter the end of range");
		end=in.nextInt();
		if(start<end && start>0)
		{		
				for(i=start;i<end;i++)
				{
					copy1=i;
					copy2=i;
					sum=0;
					while(copy1>0)
					{
						digit=copy1%10;
						sum+=(digit*digit*digit);
						copy1/=10;
						
					}
					
					
					
					if(sum==copy2)
					{
						System.out.println(sum+" is an armstrong number");
					}
					
					
				}
				
		}	
		
		
		else
		{
			System.out.println("RULES: 1>start of range can not be less than or equal to 0        2>End of range can not be less than start of range"); 
		}
		in.close();
	}

}
