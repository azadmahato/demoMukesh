package AzadJavaProg;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number:");
			int num2 = sc.nextInt();
			System.out.println("Select the symbol(+,-,*,/)");
			String sym = sc.next();
			int res;
			switch (sym) {
			case "+":
				res = num1 + num2;
				System.out.println("Addition is= " + res);
				break;
			case "-":
				res = num1 - num2;
				System.out.println("subtraction is=" + res);
				break;
			case "*":
				res = num1 * num2;
				System.out.println("Multiplication is= " + res);
				break;
			case "/":
				res = num1 / num2;
				System.out.println("Division is= " + res);
				break;
			default:
				System.out.println("Invalid Symbol");
				break;
			}
			System.out.println("Do you want to continue(y for yes and n for no)");
			yn = sc.next();
		} while (yn.equals("y") || yn.equals("Y"));

	}

}