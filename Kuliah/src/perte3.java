
import java.util.Scanner;

public class perte3 {
    public static void main(String[] args) {

        Scanner de = new Scanner(System.in);
        System.out.printf("%s%n%s%n%s%n","weltome to" , "java programming", "UPB");

        int i = 0;
        int total = 0;
        int grade;
        boolean inv = false;
        boolean inv1 = false;
        int pass = 0;
        int fail = 0;

        while(i <= 4){
            System.out.print("Grade " + (i+1) + " = " );
            grade = de.nextInt();
            if(grade < 0){
                if(inv1){
                    break;
                } else {
                    inv = true;
                }
                break;
            } else {
                if (grade >= 50){
                    pass++;
                    System.out.println(" PASS");
                } else {
                    fail++;
                    System.out.println(" FAIL");
                }
                total += grade;
                i += 1;
                inv1 = true;
            }
        }

        if (inv){
            System.out.print("no grade were inputed");
        } else {
            System.out.println("Total grade = "+total+" ("+i+")");
            System.out.println("Total Pass = "+ pass);
            System.out.println("Total Fail = "+ fail);
            double average = (double)total / i;
            System.out.printf("Average is %.2f%n", average);
            if (average >= 90){
                System.out.println("Average grade is A, PASS");
            } else if (average >= 70) {
                System.out.println("Average grade is B, PASS");
            } else if (average >= 50) {
                System.out.println("Average grade is C, PASS");
            } else {
                System.out.println("Average grade is F, FAIL");
            }
        }
        }
    }