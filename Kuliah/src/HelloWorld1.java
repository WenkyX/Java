
import java.util.Scanner;

public class HelloWorld1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("number 0 = ");
        int number0 = input.nextInt();

        System.out.print("number 1 = ");
        int number1 = input.nextInt();

        int sum = number0 + number1;

        System.out.print("sum is " + sum);
            
        }
    }