package Inheritance;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
                
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("input radius lingkaran");
        float r = input.nextFloat();
        lingkaran.r = r;
        
        // membuat objek Persegi Panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("input panjang persegi panjang : ");
        int panjangPersegiPanjang = input.nextInt();
        persegiPanjang.panjang = panjangPersegiPanjang;
        System.out.println("input lebar persegi panjang : ");
        int lebarPersegiPanjang = input.nextInt();
        persegiPanjang.lebar = lebarPersegiPanjang;
        
        // membuat objek Segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        System.out.println("input alas segitiga : ");
        int alasSegitiga = input.nextInt();
        mSegitiga.alas = alasSegitiga;
        System.out.println("input tinggi segitiga : ");
        int tinggiSegitiga = input.nextInt();
        mSegitiga.tinggi = tinggiSegitiga;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
