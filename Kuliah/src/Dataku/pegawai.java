package Dataku;

public class pegawai {
    
    public String nama;
    public double total;
    public double gaji;
    public double tunjangan;
    public double pajak;
    public double gaji_bersih;

    public void getdescription(){
        total = gaji + tunjangan;
        pajak = total * 0.02;
        gaji_bersih = total - pajak;
        System.out.println("nama            :"+nama);
        System.out.println("total gaji bruto:"+total);
        System.out.println("pajak           :"+pajak);
        System.out.println("gaji bersih     :"+gaji_bersih);
    }
}
