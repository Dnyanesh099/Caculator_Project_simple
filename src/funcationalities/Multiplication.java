package funcationalities;

import java.util.Scanner;

import javax.xml.crypto.Data;

import validitions.DataTypeChecker;

public class Multiplication {
	
public static void multiplication() {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter first number>> ");
    double num1 = scanner.nextDouble();

    System.out.println("Enter second number>> ");
    double num2 = scanner.nextDouble();

    double result = num1 * num2;

    if (DataTypeChecker.numcheck(num1) && DataTypeChecker.numcheck(num2)) {
        
        System.out.println("Multiplication is>> " + (int)result);
    } else {
        System.out.println("Multiplication is>> " + result);
    }}




    
			
	}
	
   
	
	
