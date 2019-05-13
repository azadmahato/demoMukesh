package AzadJavaProg;

import java.util.Scanner;

public class FactRec {
	static int fact=1;
	public int calFact(int n)
	{
		if(n>=1)
		{
			fact=fact*n;
			calFact(n-1);
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		FactRec fr=new FactRec();
		int number=fr.calFact(num);
		System.out.println(number);
		sc.close();
	}

}
