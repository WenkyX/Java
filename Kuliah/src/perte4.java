

import java.util.InputMismatchException;
import java.util.Scanner;

public class perte4 {

    public static void whilePrint() {
        int counter = 1;
        while (counter <= 10){
            System.out.printf("%d  ", counter);
            counter++;
        }
    }

    public static void forPrint() {
        for (int counter = 1; counter <= 10; counter++){
            System.out.printf("%d  ", counter);
        }
        System.out.println("");
        for (int counter1 = 100; counter1 >= 0; counter1--){
            System.out.printf("%d ", counter1);
        }
    }

    public static void forPrint1(){
        int total = 0;
        for (int i = 2; i <= 20; i += 2){
            total += i;
        }
        System.out.printf("Sum is %d",total);
    }

    public static void bunga(){
        double principal = 10000000;
        double interest = 0.05;
        int year = 10;
        System.out.printf("%s%20s%n","Year", "Amount on deposit");
        for (int i = 0 ;i <= year; i++){
            principal += (principal*interest);
            System.out.printf("%4d%,20.2f%n",i ,principal);
        }
        System.out.print(principal);
    }

    public static void switchCase(){
        int total = 0;
        int gradeCount = 0;
        int ACount = 0;
        int BCount = 0;
        int CCount = 0;
        int DCount = 0;
        int FCount = 0;
        int grade;

        Scanner scan = new Scanner(System.in);
        while (true){
            while (true) {
                System.out.printf("%s%n","Input grade from 0-100 : ");
                try {
                    grade = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    scan.next();
                }
            }
            if (grade < 0){
                break;
            }
            switch (grade / 10){
                case 9, 10 -> ++ACount;
                case 8 -> ++BCount;
                case 7 -> ++CCount;
                case 6 -> ++DCount;
                default -> ++FCount;
            }
            ++gradeCount;
            total += grade;

        }
        System.out.println("Grade Report");
        System.out.println("Grade Average :" + (total / gradeCount));
        System.out.println("Number of students who recieved each grade:");
        System.out.println("A : " + ACount);
        System.out.println("B : " + BCount);
        System.out.println("C : " + CCount);
        System.out.println("D : " + DCount);
        System.out.println("F : " + FCount);


    }

    public static void breakIns(){
        int count;

        for (count = 1 ; count <= 10 ; count++){
            if (count == 5){
                System.out.printf("%nBreak out of at : %d%n", count);
                break;
            }
            
            System.out.printf("%d  ", count);
        }
    }

    public static void continueIns(){
        int i;
        for (i = 1 ; i <= 10 ; i++){
            if (i == 5){
                continue;
                
            }
            
            System.out.printf("%d  ", i);
        }
    }

    public static void lampuLaluLintas(){
        String lampu;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("input nama warna : ");
            lampu = scan.nextLine();
        }

        switch (lampu) {
            case "merah" -> System.out.println("merah");
            case "kuning" -> System.out.println("kuning");
            case "hijau" -> System.out.println("hijau");
            default -> System.out.println("warna salah");
        }
    }
    
    public static void latihan(){
        int i = 0;
        while (i <= 20){
            System.out.print(i);

            if (i % 5 == 0 ){
                System.out.println();
            } else {
                System.out.print("\t");
            }
            i++;
        }
        
    }

    public static void kelulusan(){
        Scanner input = new Scanner(System.in);
        String nama, nim;
        char grade;
        int n_ts, n_uts, n_tm, n_uas, n_absen;
        double n_akhir;
        System.out.println("===== Menghitung Nilai Mahasiswa UPB =====");
        System.out.print("Masukan nama              :");
        nama = input.nextLine();
        System.out.print("Masukan NIM               :");
        nim = input.nextLine();
        // System.out.print("Nilai Kehadiran           :");
        // n_absen = input.nextInt();
        // System.out.print("Nilai Tugas Tersturktur   :");
        // n_ts = input.nextInt();
        // System.out.print("Nilai Tugas Mandiri       :");
        // n_tm = input.nextInt();
        // System.out.print("Nilai Uts                 :");
        // n_uts = input.nextInt();
        // System.out.print("Nilai Uas                 :");
        // n_uas = input.nextInt();

        String[] prompts = {
            "Nilai Kehadiran           : ",
            "Nilai Tugas Terstruktur   : ",
            "Nilai Tugas Mandiri       : ",
            "Nilai Uts                 : ",
            "Nilai Uas                 : "
        };
        
        int[] scores = new int[5];

        for (int i = 0; i < prompts.length; i++) {
            System.out.print(prompts[i]);
            scores[i] = input.nextInt();
        }

        n_absen = scores[0];
        n_ts = scores[1];
        n_tm = scores[2];
        n_uts = scores[3];
        n_uas = scores[4];

        n_akhir = (0.10 * n_absen + 0.10 * n_ts + 0.15 * n_tm + 0.30 * n_uts + 0.35 * n_uas);

        switch ((int)n_akhir / 10){
            case 8, 9, 10 -> grade = 'A';
            case 7 -> grade = 'B';
            case 6 -> grade = 'C';
            case 5 -> grade = 'D';
            default -> grade = 'E';
        }

        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println(
                "\n" + nama + " Dengan NIM " + nim + " Memiliki nilai akhir " + n_akhir + "= (" + grade + ")"
                + "\n Dan Dinyatakan Lulus"
                );
        } else {
            System.out.printf("%n%s Dengan NIM %s Memiliki nilai akhir %.2f = (%c)%nDan Dinyatakan Tidak Lulus%n", 
            nama, nim, n_akhir, grade);
        }

    }

    public static void main(String[] args) {
        // whilePrint();
        // forPrint();
        // forPrint1();
        // bunga();
        // breakIns();
        // continueIns();
        // lampuLaluLintas();
        // switchCase();
        // latihan();
        kelulusan();
        // whilePrint();
        
        
        
        // int test1;
        // double test = 79.999;
        // test1 = (int) test;
        // System.out.println(test1);

        }
}
