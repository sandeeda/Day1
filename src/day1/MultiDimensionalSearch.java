package day1;
import java.util.*;
public class MultiDimensionalSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int row,col;
		System.out.println("enter rows and columns value");
		row=in.nextInt();
		col=in.nextInt();
		
		int multi[][]=new int[row][col];

	
	
		
		System.out.println("Enter the values");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				multi[i][j]=in.nextInt();
				
			}
		}
		
		System.out.println("the 2d array is ");


		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(multi[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		
		
		int key;
		System.out.println("Enter the number you want to search");
		key=in.nextInt();
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(multi[i][j]==key);
				{
					System.out.println("present");
					return;
				}
				
			}
			
		}
		
		
		System.out.println("NOT PRESENT");
		
	
	}

}
