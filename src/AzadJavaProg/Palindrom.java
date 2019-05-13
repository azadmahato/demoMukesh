package AzadJavaProg;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number  :");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
		sc.close();
	}

}
