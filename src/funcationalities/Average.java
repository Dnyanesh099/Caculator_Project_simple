package funcationalities;

import java.util.Scanner;

public class Average {
	static double sum = 0, a, avg;

	public static void average() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit>>");

		int n = sc.nextInt();

		if (n != 0) {

			for (int i = 1; i <= n; i++) {
				System.out.println("Enter the Number " + i + ">> ");
				a = sc.nextInt();
				sum = sum + a;
				avg = sum / n;
			}

		} else {
			System.out.println("Please enter the valid limit....");
		}

	}
}
