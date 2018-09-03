package day1;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str,rev="";
		int i;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number");
		str=in.nextLine();
		String copy=str;
		
		
		
		for(i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		
		if(rev.equals(str))
		{
			System.out.println("true");
		}
		
		
		else
		{
			System.out.println("False\nFrom left to right, it reads "+copy+". From right to left, it becomes "+rev+". Therefore it is not a palindrome.");
		}
		
		in.close();
		
	}

}
