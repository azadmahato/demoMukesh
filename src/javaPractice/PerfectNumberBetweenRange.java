package javaPractice;

import java.util.Scanner;

public class PerfectNumberBetweenRange {
	
	public static boolean perfect(int n)
	{
		int i=1;
		int sum=0;
		
		while(i<=n/2)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
			i++;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			boolean b=perfect(i);
			if(b)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
