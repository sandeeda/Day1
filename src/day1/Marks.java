package day1;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[][]=new int[3][3];
		Scanner in=new Scanner(System.in);

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter marks for student "+i+1+" SUBJECT: "+j+1);
				data[i][j]=in.nextInt();
			}
		}

		int totalsub[]=new int[3];
		
		for(int i=0;i<3;i++)
		{
			int total=0;
			
			for(int j=0;j<3;j++)
			{
				total+=data[i][j];
				totalsub[i]+=data[j][i];
				
			}
			
			System.out.println("The total scored by student "+i+1+" is:"+total+" and average is :"+(float)total/3);
		}
		
		for(int i=0;i<3;i++)
		{
			System.out.println("total marks of students in subject "+i+" is "+ totalsub[i]+" and average is "+(float)totalsub[i]/3);
		}
		
		
		in.close();
	}

}
