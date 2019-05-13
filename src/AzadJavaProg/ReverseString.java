package AzadJavaProg;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String name=sc.nextLine();
		int leng=name.length();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println("reverse of the nume :"+name+" is ="+rev);
		sc.close();
	}

}
