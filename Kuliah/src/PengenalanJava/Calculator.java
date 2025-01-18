package PengenalanJava;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // akan memanggil method pertama
        System.out.println("Sum dari dua integer: " + calc.add(5, 10));

        // akan memanggil method kedua
        System.out.println("Sum dari tiga integer: " + calc.add(5, 10, 15));

        // akan memanggil method ketiga
        System.out.println("Sum dari dua double: " + calc.add(5.5, 10.5));
    }
}
