
import java.util.Scanner;

public class perte2 {
    public static void main(String[] args) {

        Scanner de = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n","weltome to" , "java programming", "UPB");
        
        System.out.print("number 0 = ");
        int number0 = de.nextInt();

        System.out.print("number 1 = ");
        int number1 = de.nextInt();

        int add = number0 + number1;
        int sub = number0 - number1;
        int mul = number0 * number1;
        double div = (double) number0 / number1;
        int idiv = number0 / number1;
        int mod = number0 % number1;

        System.out.print("sum is " + add);


        if( number0 == number1){
            System.out.println("\n" + number0 + "==" + number1);

        }
        System.out.printf("%n%s%d", "hasil add : ", add);
        System.out.printf("%n%s%d", "hasil subtraction : ", sub);
        System.out.printf("%n%s%d", "hasil multiplication : ", mul);
        System.out.printf("%n%s%f", "hasil division : ", div);
        System.out.printf("%n%s%d", "hasil integer division : ", idiv);
        System.out.printf("%n%s%d%n", "hasil modulo : ", mod);

        System.out.println("\nformula diameter = 2r");
        System.out.println("formula circumference = 2\u03C0r");
        System.out.println("formula area = \u03C0r\u00B2");
        System.out.println("r = 5");
        
        
        int r = 5;
        double pi = Math.PI;
        double diameter = 2 * r;
        double circumference = 2 * pi * r;
        double area = pi * Math.pow(r, 2);
        System.out.println("diameter = " + diameter);
        System.out.println("circumference = " + circumference);
        System.out.println("area = " + area);


            
        }
    }