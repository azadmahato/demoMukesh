package AzadJavaProg;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int gnum=sc.nextInt();
		Random rn=new Random();
		int rnum=rn.nextInt(3);
		if(gnum==rnum)
		{
			System.out.println(gnum+" correc guess " +rnum);
		}
		else
		{
			System.out.println(gnum+" incorrect guess "+rnum);
		}
		sc.close();
	}

}
