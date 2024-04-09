package funcationalities;
import java.util.Scanner;

import validitions.DataTypeChecker;
public class Addition{
public static void addition() {

	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter first number>>");
    double num1 = scanner.nextDouble();

    System.out.println("Enter second number>>");
    double num2 = scanner.nextDouble();

    double result = num1 + num2;

    if (DataTypeChecker.numcheck(num1) && DataTypeChecker.numcheck(num2)) {
        
        System.out.println("Addition is>> " + (int)result);
    } else {
        System.out.println("Addition is>> " + result);
    }

}
				
}
