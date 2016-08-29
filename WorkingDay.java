package digits;

import java.util.Scanner;

public class workingDay {
	public static void main(String args[])
	{
		String str;
		System.out.println("Enter the String: ");
		Scanner in=new Scanner(System.in);
	str=in.next();
		if(str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||str.equalsIgnoreCase("thrusday")||str.equalsIgnoreCase("friday"))
		{
			System.out.println( "true");
		}
		else
		{
			System.out.println("flase");
		}
	}

}
