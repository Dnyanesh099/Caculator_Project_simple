package funcationalities;

import java.util.Scanner;

import validitions.DataTypeChecker;

public class Cube {
	public static void cube() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number>> ");
		double num = scanner.nextDouble();

		double result = num * num * num;

		if (DataTypeChecker.numcheck(num)) {

			System.out.println("Cube is>> " + (int) result);
		} else {
			System.out.println("Cube is>> " + result);
		}
	}

}
