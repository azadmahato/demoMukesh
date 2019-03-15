package AzadJavaProg;

import java.util.Scanner;

public class EvenOddWithoutIf {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=sc.nextInt();
      String str[]={"Even","Odd"};
      System.out.println(num+" is "+str[num%2]+" number");
      sc.close();
	}

}
