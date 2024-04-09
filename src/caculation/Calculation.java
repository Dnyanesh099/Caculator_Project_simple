package caculation;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("*************************Welcome to console based application********************************");
		System.out.println();
		System.out.println("1. Addition of two numbers\r\n" + 
				"2. Subtraction of two numbers\r\n" + 
				"3. Multiplication of two numbers\r\n" + 
				"4. Division of two numbers\r\n" + 
				"5. Modulus of two numbers\r\n" + 
				"6. Square of a number\r\n" + 
				"7. Cube of a number\r\n" + 
				"8. Average of numbers\r\n" + 
				"9. Factors of a number\r\n" + 
				"10.Find out even or odd number");
		System.out.println("---------------------------------Enter 0 to exit-------------------------------------------");
		System.out.println();
		
		while (true) {
		System.out.println("Enter your choice of operation>> ");
		int choice=sc.nextInt();
		
		

		switch (choice) {
		
		case 0:
            System.out.println("Exiting from application...");
            System.exit(0); 
		
//        case 1:
//        	Addition.addition();
//        	
//   	    break;
//   	    
//        case 2:
//        	
//        	Subtraction.subtraction();
//        	
//   	    break;
//   	    
//      case 3:
//
//      	Multiplication.multiplication();
// 	
//   	    break;
//        	
//        case 4:
//        
//        	Division.division();
//        	
//        	
//   	    break;
//   	    
//        case 5:
//        	
//        	Modulus.modulus();
//        	
//        	
//   	    break;
//   	    
//        case 6:
//        	
//    		Square.square();
//        
//   	    break;
//   	    
//        case 7:
//        	
//    		Cube.cube();
//        	
//        	
//   	    break;
//   	    
//        case 8:
//        	Average.average();
//        	  System.out.println("The sum of given numbers is >> "+Average.sum);
//              System.out.println("The Average of given numbers is>> "+Average.avg);
//        	
//   	    break;
//   	    
//        case 9:
//        	
//        	Factors.factors();
//        break;
//        
//        case 10:
//        	System.out.println("Enter the number>> ");
//        	Even_Odd.n=sc.nextInt();
//        	Even_Odd.numCheck();
//   	    break;
        default:
            System.out.println("Invalid operation");
            break;
		
		
     }

	}
}
	
}

