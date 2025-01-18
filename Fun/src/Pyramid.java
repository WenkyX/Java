package Fun;


public class Pyramid {
    public static void main(String[] args) {
        int a, b;
        a = 1;
        b = 10;
        while (a < 20){
            System.out.print(" ".repeat(b));
            System.out.print("*".repeat(a));
            System.out.println("");
            a += 2;
            b--;
            
        }
    }
}