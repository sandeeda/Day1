package day1;
import java.util.*;
public class CheckOccurence {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		
		int size;
		int count=0,flag=0;
		System.out.println("Enter size");
		size=in.nextInt();
		String name[]=new String[size+1];
		String key="";
		
		
		
		System.out.println("Enter the names");
		for(int i=0;i<=size;i++)
		{
			name[i]=in.nextLine();
		}
		
		
		System.out.println("Enter the name to be searched");
		key=in.nextLine();
		
		for(int i=0;i<=size;i++)
		{
			if(name[i].equalsIgnoreCase(key))
			{
				count++;
				flag=1;
			}
		}
		
		
		if(flag==0)
		{
			System.out.println("NOT FOUND!!OOPSIIiiii DupSiiii");
		}
		else
		{
			
			System.out.println("FOUND "+count+" TIMES!HURRAY");;
		}
		
		in.close();
	}

}
