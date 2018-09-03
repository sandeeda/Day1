package day1;
import java.util.*;
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ctc=0,tax=0;
		
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter your CTC");
		ctc=in.nextDouble();
		if(ctc>=0 && ctc<=1000000)
		{
			

			if(ctc>=0 && ctc<=180000)
			{
				System.out.println("The income tax is Rs "+tax);
			}


			else if(ctc>=180001 && ctc<=300000)
			{
				tax=0.1*ctc;
				System.out.println("The income tax is Rs "+tax);
			}


			else if(ctc>=300001 && ctc<=500000)
			{
				tax=0.2*ctc;
				System.out.println("The income tax is Rs "+tax);
			}


			else if(ctc>=500001 && ctc<=1000000)
			{
				tax=0.3*ctc;
				System.out.println("The income tax is Rs "+tax);
			}
				
				
		}
		
		else
		{
			System.out.println("CTC cannot be negative or greater than 1000000");
		}
		
		
		
		in.close();
		
	}

}
