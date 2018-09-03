package day1;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		
		
		int num,copy,digit,sum=0;
		
		
		
		
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter a number");
		num=inp.nextInt();
		copy=num;
		if(num>=0)
		{
			while(num>0)
			{
				digit=num%10;
				sum+=(digit*digit*digit);
				num/=10;
				
			}
			
			
			
			if(sum==copy)
			{
				System.out.println(sum+" is an armstrong number");
			}
			else
			{
				System.out.println(copy+" is not an armstrong number");
			}
		}
		else
		{
			System.out.println("Please enter a number greater than 0");
		}

		inp.close();
		
	}
	
}
