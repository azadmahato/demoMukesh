package mayJavaPractice;

import java.util.Random;
import java.util.Scanner;

public class FingGuessNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		Random r = new Random();
		int guess = r.nextInt(3);
		if (num == guess) {
			System.out.println("your guess number is "+guess+" correct");
		} else {
			System.out.println("your guess number is incorrect "+guess);
		}
		sc.close();

	}

}
