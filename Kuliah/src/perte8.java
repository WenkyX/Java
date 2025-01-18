
import java.util.Scanner;

public class perte8 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Account myAccount = new Account("");

    System.out.printf("initial name is : %s%n%n",myAccount.getName());

    System.out.println("enter name : ");
    String theName = input.nextLine();
    myAccount.setName(theName);
    System.out.println("");

    System.out.printf("name in object myAccount is %n%s%n",myAccount.getName());


    }

}

// class Account {
//     private String name;
//     public Account(String ame){
//         this.name = name;
//     }
// }