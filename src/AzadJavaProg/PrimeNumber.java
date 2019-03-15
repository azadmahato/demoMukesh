package AzadJavaProg;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean prime(int num)
	{
		int i=2;
		
		while(i<=num/2)
		{
			if(num%i==0)
				return false;
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		boolean  b=prime(n);
		if(b)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		
	}

}
