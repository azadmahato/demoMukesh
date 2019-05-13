package mayJavaPractice;

import java.util.Scanner;

public class EvenOddWithoutIfCondition {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    String str[]={"even","odd"};
    System.out.println(num+" is "+str[num%2]+" number");
    sc.close();
	}

}
