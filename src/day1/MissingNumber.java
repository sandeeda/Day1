package day1;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=in.nextInt();
		int a[]=new int[n];
		
		
		System.out.println("enter the numbers");
		for(int i=0;i<n-1;i++)
		{
			a[i]=in.nextInt();
			
		}
		int flag=0;
		for(int i=0;i<n;i++)
		{
			flag=0;
			
			for(int j=0;j<n-1;j++)
			{
				if(a[j]==i)
				{
					flag=1;
				}
			}
			
			
			if(flag!=1)
			{
				System.out.println(i);
			}
		}
		
		in.close();
		
		
		

	}

}
