package day1;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		int arr[]=new int [15];
		int key;
		
		System.out.println("Enter the elements");
		for(int i=0;i<15;i++)
		{
			arr[i]=in.nextInt();
			
		}
		
		
		System.out.println("enter the number to be searched");
		key=in.nextInt();
		
		for(int i=0;i<15;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("FOUND!!HURRAY");
				in.close();
				return;
			}
			
			
			
		}
		
		
		System.out.println("NOT FOUND...");
		
		in.close();

	}

}
