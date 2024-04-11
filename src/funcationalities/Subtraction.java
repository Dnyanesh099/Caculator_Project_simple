package funcationalities;

import java.util.Scanner;

import validitions.DataTypeChecker;

public class Subtraction {

	public static void subtraction() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		double result = num1 - num2;

		if (DataTypeChecker.numcheck(num1) && DataTypeChecker.numcheck(num2)) {

			System.out.println("Subtraction of " + num1 + " and" + num2 + " is>> " + (int) result);
		} else {
			System.out.println("Subtraction is: " + result);
		}

	}

}
