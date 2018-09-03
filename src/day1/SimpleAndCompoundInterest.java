package day1;

import java.util.Scanner;
import java.lang.Math;
public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		
		
		double pri,rate,time,choice;
		double compint=0,factor;
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter principal, rate, time");
		pri=inp.nextDouble();
		rate=inp.nextDouble();
		time=inp.nextDouble();
		
		
		if(pri>0 && rate>0 && time>0)
		{
						
						//SIMPLE INTERST 
						System.out.println("Simple Interest : Rs "+ (pri*rate*time)/100);
						
						
						//COMPOUND INTEREST
						
						
						System.out.println("CALCULATING COMPOUND INTEREST\nenter 1 if compound interest is compounded anually \n2 for half yearly \n4 for quarterly");
						choice=inp.nextDouble();
						
						if(choice==1 ||choice==2  ||choice==4)
						{
								factor=Math.pow(((100+rate)/100),(choice*time));
								compint=(pri*factor)-pri;
						
							
						}
						
						System.out.println("Compound Interest : Rs "+ compint);
		}
		else
		{
			System.out.println("Inputs need to be greater than zero");
		}
		inp.close();
		
		
		
	}

}
