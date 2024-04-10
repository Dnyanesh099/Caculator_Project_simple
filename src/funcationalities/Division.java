package funcationalities;

import java.util.Scanner;

import validitions.DataTypeChecker;

public class Division  {
	

   public static void division() {
	
	   

	   Scanner scanner = new Scanner(System.in);

       System.out.println("Enter first number>> ");
       double num1 = scanner.nextDouble();

       System.out.println("Enter second number>> ");
       double num2 = scanner.nextDouble();

       try {
           double result = divide(num1, num2);
           if (DataTypeChecker.numcheck(num1) && DataTypeChecker.numcheck(num2)) {
               System.out.println("Division is>> " + (int) result);
           } else {
               System.out.println("Division is>> " + result);
           }
       } catch (ArithmeticException e) {
           System.out.println("Error: Division by zero is not allowed.");
       }

       scanner.close();
   }


   public static double divide(double num1, double num2) {
       if (num2 == 0) {
           throw new ArithmeticException("Division by zero cannot possible....");
       }
       return num1/num2;
   }

				

	
	   
  
	}
   

   
	
	
	
	
	

