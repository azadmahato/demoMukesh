package AzadJavaProg;

import java.util.Scanner;

public class FibbonocciSeries {

	public static void main(String[] args) {
  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=3;i<=num;i++)
		{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}
		sc.close();
		
		
	}

}
