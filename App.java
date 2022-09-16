// import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    // Method call
    double quotient = divide();
    System.out.println(" The Quotient is: " + quotient);

    double product = multiply();
    System.out.println( " The Product is: " + product);

    // Close scanner
    scan.close();

    }

    static double divide() {
    System.out.println(" Please enter three numbers to divide ");
    System.out.print(" Enter first number: ");
    double x = scan.nextInt();
    
    System.out.print(" Enter second number: ");
    double y = scan.nextInt();

    System.out.print(" Enter third number: ");
    double z = scan.nextInt();
    return x / y / z ;
    
    }

    static double multiply() {
    System.out.print(" Please enter three numbers to multiply ");
    System.out.print( " Enter first number ");
    double x = scan.nextInt();

    System.out.print( " Enter second number ");
    double y = scan.nextInt();

    System.out.print( " Enter third number ");
    double z = scan.nextInt();
    return x * y * z ;

    }
}
   
