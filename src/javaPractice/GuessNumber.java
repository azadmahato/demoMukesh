package javaPractice;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Guess number :");
		int guessNumber=sc.nextInt();
		Random r=new Random();
		int num=r.nextInt(3);
		System.out.println("Random number is ="+num);
		if(guessNumber==num)
		{
			System.out.println("Correct guess number");
		}
		else
		{
			System.out.println("Incorrect guess number");
		}
		sc.close();
	}

}
