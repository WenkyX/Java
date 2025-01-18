package PengenalanJava;

class Kendaraan {
    String brand;
    int roda;

    Kendaraan(String brand,int roda) {
        this.brand = brand;
        this.roda = roda;
    }
    void Jalan() {
        System.out.println(brand + " kendaraan berjalan...");
    }
    void Berhenti() {
        System.out.println(brand + " kendaraan berhenti...");
    }
    void InformasiKendaraan(){
        System.out.println("Brand: " + brand + ", Beroda: " + roda);
    }
}

class KendaraanListrik extends Kendaraan {
    KendaraanListrik(String brand, int roda) {
        super(brand, roda);
    }
    void Energi(){
        System.out.println(brand + " Menggunakan listrik");
    }
}

class KendaraanBBM extends Kendaraan {
    KendaraanBBM(String brand, int roda) {
        super(brand, roda);
    }
    void Energi(){
        System.out.println(brand + " Menggunakan listrik");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        KendaraanListrik Tesla = new KendaraanListrik("Tesla", 4);
        Tesla.Jalan();
        Tesla.Energi();
        Tesla.InformasiKendaraan();
        Tesla.Berhenti();
        System.out.print("\n");

        KendaraanBBM Honda = new KendaraanBBM("Beat", 2);
        Honda.Jalan();
        Honda.Energi();
        Honda.InformasiKendaraan();
        Honda.Berhenti();
    }
}
