package AzadJavaProg;

import java.util.Scanner;

public class PerfectNumberRange {

	public static boolean isPerfect(int number)
	{
		int i=1;
		int sum=0;
		while(i<=number/2)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum==number;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			boolean b=isPerfect(i);
			if(b)
				System.out.print(" "+i);
		}
		
	}
	
}
