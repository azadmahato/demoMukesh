package AzadJavaProg;

import java.util.Scanner;

public class Primerange {

	public static boolean isPrime(int num) {
		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0)

				return false;
			i++;

		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range :");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			boolean b=isPrime(i);
			if(b)
			{
				count++;
				System.out.print(" "+i);
				
			}	
			
		}
		System.out.println();
		System.out.println(" total prime number ="+count);
		sc.close();

	}
}
