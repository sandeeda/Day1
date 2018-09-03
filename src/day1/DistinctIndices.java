package day1;
import java.util.*;
public class DistinctIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int size;
		size=in.nextInt();

		int diff,key;


		int a[];
		a=new int[size];

		
		int ind[];
		ind=new int[20];
		
		int k=0;
		System.out.println("Enter the elements of array");

		for(int i=0;i<size;i++)
		{
			a[i]=in.nextInt();
		}



		System.out.println("Enter the key and acceptable difference and key should be twice in array");
		
		key=in.nextInt();
		
		diff=in.nextInt();
		
		
		for(int i=0;i<size;i++)
		{
			if(a[i]==key)
			{
				ind[k]=i;
				k++;
			}
		}

		int i1=ind[0];
		int i2=ind[1];

		if(diff>=0)
		{
			int differ;
			differ=i1-i2;
			if(Math.abs(differ)<=diff)
			{
				System.out.println("OK");
			}
			
			else
			{
				System.out.println("NOT OK");
			}
						
		}
		
		else
		{
			System.out.println("diff should be positive and key must be present at least twice");
		}
	




		in.close();


	}

}
