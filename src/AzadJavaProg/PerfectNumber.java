package AzadJavaProg;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfect(int num)
	{
		int i=1;
		int sum=0;
		while(i<=num/2)
		{
			if(num%i==0)
			{
				
				sum=sum+i;
					
				System.out.print(" "+i);
			}
			
			i++;
			
			
		}
		return sum==num;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int number=sc.nextInt();
		boolean b=PerfectNumber.isPerfect(number);
		if(b)
		{
			System.out.println(" perfect");
		}
		else
		{
			System.out.println(" not perfect");
		}
		sc.close();
	}

}
