package funcationalities;

import java.util.Scanner;

public class Square {
	
	public static void square() {
		
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double num = scanner.nextDouble();
        System.out.println("Square is: " + (num * num));
		
	}

}
