package javaPractice;

import java.util.Scanner;

public class SpecialTwoDigitNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int d1=num/10;
		int d2=num%10;
		int sum=d1+d2+d1*d2;

		if(sum==num)
		{
			System.out.println(num+" Is special 2 digit number");
		}
		else
		{
			System.out.println(num+" Is not a Special 2 digit number");
		}
		sc.close();
	}

}
