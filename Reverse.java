package digits;

import java.util.Scanner;

public class reverse {
	public static void main(String args[])
	{
//Scanner sc=new Scanner(System.in);
String str="NandhIni";
for(int i=str.length()-1;i>=0;i--)
{
		System.out.print(str.charAt(i));
		
}
//String str1; 
//str1=new StringBuffer(str).reverse().toString();
	str=str.replaceAll("[AEIOU]","");
		
	str=str.replaceAll("[aeious]","");
		
		System.out.println(""+str);
		


}}