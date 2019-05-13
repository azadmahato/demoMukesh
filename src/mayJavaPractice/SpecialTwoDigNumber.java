package mayJavaPractice;

import java.util.Scanner;

public class SpecialTwoDigNumber {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    int d1=num/2;
    int d2=num%2;
    int sum=d1+d2+d1*d2;
    if(sum==num)
    {
    	System.out.println(num+" is special 2dig number");
    }
    else
    {
    	System.out.println(num+" is not special 2dig number");
    }
    sc.close();
	}

}
