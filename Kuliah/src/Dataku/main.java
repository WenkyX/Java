package Dataku;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("enter jumah gaji       Rp: ");
        double gaji = input.nextDouble();

        System.out.print("enter jumlah tunjangan Rp: ");
        double tunjangan = input.nextDouble();

        System.out.print("enter nama pegawai       : ");
        String nama = input.next();

    }
}
