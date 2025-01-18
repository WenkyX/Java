import java.util.Scanner;

public class perte11a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("input angka 1 = ");
            int angka1 = input.nextInt();
            System.out.print("Input Angka 2 = ");
            int angka2 = input.nextInt();
            int hasil = angka1/angka2;
            System.out.println(" hasil pembagian = " + angka1 + " / " + angka2 + " = " + hasil);
        } catch(ArithmeticException ex){
            System.out.println("Tidak Boleh Menggunakan Pembagian Dengan 0 (nol)");
        }
    }    
}
