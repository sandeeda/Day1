package day1;
import java.util.Scanner;
public class CUI_Lgin {

	public static void main(String[] args) {

		String uname="sandeeda";
		String password="password";

		String uname1="";
		String password1="";
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the username");
		uname1=in.nextLine();

		if(uname1.equals(uname))
		{



			for(int i=0;i<3;i++)
			{
				System.out.println("enter password");
				password1=in.nextLine();


				if(password.equals(password1))
				{
					System.out.println("WELCOME SANDEEP!!!");
					in.close();
					return;
				}
			}

			System.out.println("Sorry you are out of attempts");
			in.close();
			return;

		}

		else
		{
			System.out.println("user does not exists.PLEASE CONTACT YOUR N+1");
		}

		in.close();
	}

}
