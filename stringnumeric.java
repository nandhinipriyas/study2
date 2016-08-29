package digits;

import java.util.Scanner;

public class Stringnumeric {
	public static void main(String args[])
	{
		String str;
		System.out.println("Enter the String: ");
		Scanner in=new Scanner(System.in);
	        str = in.nextLine();

	    if (Check(str)) {
	        System.out.println(str + " is not  numeric");
	    } else {
	        System.out.println(str +" is  numeric");
	    }
	}

	public static boolean Check(String str) {
	    for (char c : str.toCharArray()) {
	        if (!Character.isLetter(c))
	            return false;
	    }        
	    
	    return true;	
	    
	   
	}
		
}
	

