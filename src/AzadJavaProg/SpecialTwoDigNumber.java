package AzadJavaProg;

import java.util.Scanner;

public class SpecialTwoDigNumber {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int d1=num/10;
		int d2=num%10;
		int sum=d1+d2+d1*d2;
		if(sum==num)
		{
			System.out.println("Special two digit number");
		}
		else
		{
			System.out.println("Not a special two digit number");
		}
		sc.close();
	}

}
