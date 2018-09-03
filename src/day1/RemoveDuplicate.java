package day1;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in=new Scanner(System.in);
		String inp="";
		int reg[]=new int [122];
	
		for(int i=0;i<52;i++)
		{
			reg[i]=0;
		}
		
		
		
		System.out.println("enter the word");
		inp=in.nextLine();
		
		
		
		int len;
		len=inp.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=65;j<122;j++)
			{
				if(inp.charAt(i)==j)
				{
					if(reg[j]==0)
					{
						System.out.println(inp.charAt(i));
					}
					reg[j]=1;
					
				}
			}
		}
		
		
		
		in.close();
		
	}

}
