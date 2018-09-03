package day1;
import java.util.*;
public class SpotPalindrome {

	public static void main(String[] args) {


		String [] words;
		words=new String[10];
		
		String [] wordsrev;
		wordsrev=new String[10];
		
		String [] sort;
		sort=new String[10];
		int k=0;
		for(int i=0;i<=9;i++)
		{
			wordsrev[i]="";
			words[i]="";
		}
		

		int flag[];
		flag=new int[10];
		Scanner in=new Scanner(System.in);

		System.out.println("Enter 10 strings");
		for(int i=0;i<=9;i++)
		{
			words[i]=in.nextLine();
			flag[i]=0;
		}

		
		

		for(int i=0;i<10;i++)
		{

			for(int j=words[i].length()-1;j>=0;j--)
			{
				wordsrev[i]=wordsrev[i]+words[i].charAt(j);
			}

		}

		for(int i=0;i<10;i++)
		{
			
			if(wordsrev[i].equals(words[i]))
			{
				sort[k]=wordsrev[i];
				k++;
			}
		}
		
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k-i-1;j++)
			{
				if(sort[j].length()>sort[j+1].length())
				{
					String tempstr="";
					tempstr=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=tempstr;
				}
			}
		}
		
		for(int i=0;i<k;i++)
		{
			System.out.println(sort[i]);
		}
		
		in.close();




	}

}
