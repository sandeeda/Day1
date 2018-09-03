package day1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		String str,rev="";
		Scanner in=new Scanner(System.in);

		char space=' ';
		System.out.println("Enter the string");
		str=in.nextLine();
		str+=" ";
		int start=0;

		StringBuffer sentence=new StringBuffer(str);
		for(int i=0;i<sentence.length();i++)
			{
				char temp=sentence.charAt(i);
				if(temp==space)
				{
					rev=sentence.substring(start,i);
					start=i;
					StringBuffer reverse=new StringBuffer(rev);
					System.out.print(reverse.reverse()+" ");
				}
				
			}
		in.close();

	}

}
