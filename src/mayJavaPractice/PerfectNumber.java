package mayJavaPractice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		boolean b = isPerfect(num);
		if (b) {
			System.out.println("perfect number");
		} else {
			System.out.println("not a perfect number");
		}
        sc.close();
	}

	public static boolean isPerfect(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n / 2) {
			if (n % i == 0) {

				sum = sum + i;
			}
			i++;
		}
		return sum == n;
	}
}
