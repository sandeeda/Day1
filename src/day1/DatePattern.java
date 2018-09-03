package day1;

import java.util.Scanner;

public class DatePattern {

	public static void main(String[] args) {
		
		
		String date="";	
		String month="";
		String monthInString="";
		int monthInInteger;
		Scanner in = new Scanner (System.in);
		System.out.println("enter the date in form DD,MM,YYYY ");
		
		
		date=in.nextLine();
		
		
		month=date.substring(3, 5);

		monthInInteger=Integer.parseInt(month);
		
		
		switch(monthInInteger)
		{
		
		case 1:
			monthInString+="January";
			break;
		case 2:
			monthInString+="February";
			break;
		case 3:
			monthInString+="March";
			break;
		case 4:
			monthInString+="April";
			break;
		case 5:
			monthInString+="May";
			break;
		case 6:
			monthInString+="June";
			break;
		case 7:
			monthInString+="July";
			break;
		case 8:
			monthInString+="August";
			break;
		case 9:
			monthInString+="September";
			//hello world
			break;
		case 10:
			monthInString+="October";
			break;
		case 11:
			monthInString+="November";
			break;
		case 12:
			monthInString+="December";
			break;
		default:
			System.out.println("Please enter month correctly");
			in.close();
			return;
			
		
		}
		
		
		
		
		System.out.println(date.substring(0,2)+"/"+monthInString+"/"+date.substring(6,10));
		
		
		in.close();
		
		
	}

}
