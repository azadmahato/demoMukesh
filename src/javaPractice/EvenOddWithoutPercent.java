package javaPractice;

import java.util.Scanner;

public class EvenOddWithoutPercent {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		if(num/2*2==num)
		{
			System.out.println(num+" =Even number");
		}
		else
		{
			System.out.println(num+" =Odd number");
		}
		sc.close();
	}

}
