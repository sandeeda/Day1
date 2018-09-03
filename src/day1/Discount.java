package day1;
import java.util.*;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of item");
		int newItem;
		newItem=in.nextInt();
		float discount;
		discount=0.35f*newItem;
		float newItemPrice=newItem-discount;
		System.out.println("the final price is "+newItemPrice);
		in.close();
	}

}
