
import java.util.InputMismatchException;
import java.util.Scanner;

public class Perte11 {

    public static int quotient(int numerator, int denominator){
        return numerator / denominator;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        
        do {
            try {
                System.out.print("Please enter an integer numerator : ");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);
                System.out.println("Result: " + numerator + " / " + denominator + " = " + result);
                continueLoop = false;
            }
            catch (InputMismatchException e) {
                System.err.print("Exception : InputMismatchException");
                input.nextLine();
                System.out.println("Input Must Be An Integer Please Try Again");
            }
            catch (ArithmeticException e) {
                System.err.println("Exception: arithmeticExpresion ");
                input.nextLine();
                System.out.println("Zero in an invalid denominator, Please Try Again");
            }
        } while (continueLoop);
    }
}