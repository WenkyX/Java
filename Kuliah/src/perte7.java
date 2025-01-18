import java.util.Scanner;
public class perte7 {

    public static void kuis2(){
        double I,II;
        double Diskon;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Harga : Rp");
        I = input.nextInt();
        System.out.print("Jumlah barang : ");
        II = input.nextInt();
        I = I * II;
        System.out.printf("Total harga sebelum diskon : Rp%.0f\n",I);
        if (I >= 500_000 && I < 1_000_000){
            Diskon = I - (I*0.1);
        } else if (I >= 1_000_000){
            Diskon = I - (I*0.2);
        } else {
            Diskon = I;
        }
        System.out.printf("Total harga setelah diskon : Rp%.0f%n\"", Diskon);


    }

    public static void kuis1(){
        int I,II;
        Scanner input = new Scanner(System.in);
        System.out.print("Nomor perulangan pertama : ");
        I = input.nextInt();
        System.out.print("Nomor perulangan pertama : ");
        II = input.nextInt();
        for (;I <= II;I++){
            System.out.printf("%d Deir\n",I);
        }
    }
    public static void main(String[] args) {
        kuis1();
        // kuis2();
    }
}