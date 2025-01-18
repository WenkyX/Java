import java.util.Scanner;

public class perte8part3 {
    public static void main(String[] args) {
        Bank account1 = new Bank("jane blue", 50.00);
        Bank account2 = new Bank("jane green", -7.53);

        System.out.printf("%s balance :%s%n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance :%s%n",
            account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("enter deposit amount for account1 :");
        double deposit1 = input.nextDouble();
        System.out.printf("%ndepositing %.2f to account1 balance%n%n",deposit1);
        account1.deposit(deposit1);

        System.out.print("enter deposit amount for account1 :");
        double deposit2 = input.nextDouble();
        System.out.printf("%ndepositing %.2f to account1 balance%n%n",deposit2);
        account1.deposit(deposit2);

        System.out.printf("%naccount1 balance is %f ",account1.getBalance());
        System.out.printf("%naccount2 balance is %f ",account2.getBalance());

    }
    
}
