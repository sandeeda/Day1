package day1;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int arr[]=new int [15];
		int size=15;
		System.out.println("Enter the elements");
		for(int i=0;i<15;i++)
		{
			arr[i]=in.nextInt();
			
		}
		
		for (int i = 0; i < size-1; i++)
            for (int j = 0; j < size-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		
		for(int i=0;i<15;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		in.close();

	}

}
