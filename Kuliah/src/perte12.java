

import java.util.Scanner;

public class perte12 {
    
    public static void main(String[] args){
        qwe();
    }
    
    public static void qwe(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0);
    
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first character in a java identifier: %b%n", Character.isJavaIdentifierStart(c));
        System.out.printf("is part of a java identifier: %b%n", Character.isJavaIdentifierPart(c));
        System.out.printf("is Letter: %b%n", Character.isLetter(c));
        System.out.printf("is letter or digit: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("is lower case: %b%n", Character.isLowerCase(c));
        System.out.printf("is upper case: %b%n", Character.isUpperCase(c));
        System.out.printf("to upper case: %b%n", Character.toUpperCase(c));
        System.out.printf("to lower case: %b%n", Character.isLowerCase(c));    
    }

    public static void adf(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a radix:");
        int radix = scanner.nextInt();


        System.out.printf("please choose one: %n1 -- %s%n2 -- %s%n",
        "conver digit to character","conver character to digit");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("enter a digit:");
                int digit = scanner.nextInt();
                System.out.printf("conver digit to character: %s%n",
                    Character.forDigit(digit, radix)
                    );
                break;
            case 2:
                System.out.println("Enter a character");
                char character = scanner.next().charAt(0);
                System.out.printf("convert character to digit: %s%n",
                Character.digit(character, radix));
            break;
        }
    }
}
