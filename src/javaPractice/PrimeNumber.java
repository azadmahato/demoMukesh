package javaPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0)

				return false;
			i++;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		boolean b = isPrime(num);
		if (b) {
			System.out.println("Prime");
		} else {
			System.out.println("not a prime");
		}
		sc.close();

	}
}
