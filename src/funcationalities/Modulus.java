package funcationalities;
import java.util.Scanner;

import validitions.DataTypeChecker;
public class Modulus {
	
	public static void modulus() {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number>>");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number>>");
        double num2 = scanner.nextDouble();

        double result = num1 % num2;

        if (DataTypeChecker.numcheck(num1) && DataTypeChecker.numcheck(num2)) {
            try {
        	
            System.out.println("Modulus is>> " + (int)result);}
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Modulus is >> " + result);
        }}
	

	
    

}
	
	
	


