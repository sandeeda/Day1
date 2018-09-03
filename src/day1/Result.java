package day1;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[];
		m=new int[3];
		int flag=0;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the marks of three subjects");
		m[0]=in.nextInt();
		m[1]=in.nextInt();
		m[2]=in.nextInt();
		if(m[0]>=0 && m[1]>=0 && m[2]>=0 && m[0]<100 && m[1]<100 && m[2]<100)
		{
			for(int i=0;i<3;i++)
			{
				if(m[i]>60)
				{
					flag++;
				}
			}
			
			
			if(flag==3)
			{
				System.out.println("PASSED");
			}
			else if(flag==2)
			{
				System.out.println("PROMOTED");
			}
			else if(flag<=1) 
			{	
				System.out.println("FAILED");
			}
		}
			
		else			
		{
			System.out.println("Marks should be greater than or equal to zero and less than 100");
		}
		
		
		in.close();
			
	}

}
