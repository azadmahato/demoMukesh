package AzadJavaProg;

import java.util.Scanner;

public class PrimeRangeSum {
 
	public static boolean PrimeSum(int num)
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
		System.out.println("Enter the range of number :");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			boolean b=PrimeSum(i);
			if(b)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
