

import java.security.SecureRandom;
import java.util.Scanner;

public class perte5_method {
    public static double maximum(double x, double y, double z){
        double maximumvalue = x;

        if (y > maximumvalue){
            maximumvalue = y;
        }

        if (z > maximumvalue){
            maximumvalue = z;
        }

        return maximumvalue;

    }

    public static void maxCal(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter 3 floating point number number");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = maximum(number1,number2,number3);
        System.out.println(result);

    }

    public static double minimum(double x, double y, double z){
        double maximumvalue = x;

        if (y < maximumvalue){
            maximumvalue = y;
        }

        if (z < maximumvalue){
            maximumvalue = z;
        }

        return maximumvalue;

    }

    public static void minCal(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter 3 floating point number number");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double result = minimum(number1,number2,number3);
        System.out.println(result);

    }

    public static void mathCalculation(){
        Scanner input = new Scanner(System.in);
        double number1 = input.nextDouble();
        System.out.println("absolute dari " + number1 + " adalah : " + Math.abs(number1));
        System.out.println("ceiling dari " + number1 + " adalah : " + Math.ceil(number1));
        System.out.println("floor dari " + number1 + " adalah : " + Math.floor(number1));
        System.out.println("cos dari " + number1 + " adalah : " + Math.cos(number1));
        System.out.println("sin dari " + number1 + " adalah : " + Math.sin(number1));
        System.out.println("tan dari " + number1 + " adalah : " + Math.tan(number1));
        System.out.println("exponent dari " + number1 + " adalah : " + Math.exp(number1));
        System.out.println("power 2 dari " + number1 + " adalah : " + Math.pow(number1,2));
        System.out.println("square root 2 dari " + number1 + " adalah : " + Math.sqrt(number1));
        System.out.println("log dari " + number1 + " adalah : " + Math.log(number1));


    }

    public static void Dice(){
        SecureRandom randomNumbers = new SecureRandom();

        for (int i = 1 ; i <= 20 ; i++){
            int face = 1 + randomNumbers.nextInt(6);

            System.out.print("  " + face);
            
            if (i % 5 == 0){
                System.out.println();
            }
        }
    }

    private static int[] sharedSum = new int[6];
    public static void DiceFrequency(){
        SecureRandom randomNumbers = new SecureRandom();

        long time = System.nanoTime();



        int[] counts = new int[6];
        int face;
        for (int i = 1; i <= 60_000; i++) {
            face = randomNumbers.nextInt(6);
            counts[face]++;
        }
        
        System.out.println("face\tfrequency");
        System.out.println("1\t" + counts[0]);
        System.out.println("2\t" + counts[1]);
        System.out.println("3\t" + counts[2]);
        System.out.println("4\t" + counts[3]);
        System.out.println("5\t" + counts[4]);
        System.out.println("6\t" + counts[5]);

        

        System.out.println("time taken = " + (System.nanoTime() - time) / 1_000_000 + " Milisecond");



        

    }

    public static void squareCal(){
        System.out.println("square of integer 7 is " + square(7));
        System.out.println("square of integer 7.5 is " + square(7.5));
    }

    public static int square (int intValue) {
        System.out.println("called square int with " + intValue);
        return intValue * intValue;
    }

    public static double square (double doubleValue) {
        System.out.println("called square double with " + doubleValue);
        return doubleValue * doubleValue;

    }



    public static void main(String[] args){
        // maxCal();
        // minCal();
        // mathCalculation();
        // Dice();
        DiceFrequency();
        // squareCal();
        
    }

}

        // int f1 = 0;
        // int f2 = 0;
        // int f3 = 0;
        // int f4 = 0;
        // int f5 = 0;
        // int f6 = 0;
        // int face = 0;

        //         for (int i = 1 ; i <= 12_000_000 ; i++){
        //     face = 1 + randomNumbers.nextInt(6);
        //     switch(face) {
        //         case 1 -> f1++;
        //         case 2 -> f2++;
        //         case 3 -> f3++;
        //         case 4 -> f4++;
        //         case 5 -> f5++;
        //         case 6 -> f6++;
        //     }
        // }
        // System.out.println("face\tfrequency");
        // System.out.println("1\t" + f1);
        // System.out.println("2\t" + f2);
        // System.out.println("3\t" + f3);
        // System.out.println("4\t" + f4);
        // System.out.println("5\t" + f5);
        // System.out.println("6\t" + f6);



        
    //     int[] counts = new int[6];
    //     int face;
    //     for (int i = 1; i <= 12_000_000; i++) {
    //         face = randomNumbers.nextInt(6);
    //         counts[face]++;
    //     }
    
    // System.out.println("face\tfrequency");
    // System.out.println("1\t" + counts[0]);
    // System.out.println("2\t" + counts[1]);
    // System.out.println("3\t" + counts[2]);
    // System.out.println("4\t" + counts[3]);
    // System.out.println("5\t" + counts[4]);
    // System.out.println("6\t" + counts[5]);




    // int threads = 8;
    // ExecutorService executor = Executors.newFixedThreadPool(threads);

    // Runnable task1 = () -> {
    //     int[] counts = new int[6];
    //     int face;
    //     for (int i = 1; i <= 1_000_000; i++) {
    //         face = randomNumbers.nextInt(6);
    //         counts[face]++;
    //     }
    //     sharedSum[0] += counts[0];
    //     sharedSum[1] += counts[1];
    //     sharedSum[2] += counts[2];
    //     sharedSum[3] += counts[3];
    //     sharedSum[4] += counts[4];
    //     sharedSum[5] += counts[5];


    // };


    // try {
    //     Future<?>[] futures = new Future[threads];
    //     for (int i = 0; i < threads; i++) {
    //         futures[i] = executor.submit(task1);
    //     }
    //     for (Future<?> isdone : futures) {
    //         isdone.get();
    //     }
        
    //     System.out.println("All tasks are done");

    //     System.out.println("face\tfrequency");
    //     System.out.println("1\t" + sharedSum[0]); 
    //     System.out.println("2\t" + sharedSum[1]);
    //     System.out.println("3\t" + sharedSum[2]);
    //     System.out.println("4\t" + sharedSum[3]);
    //     System.out.println("5\t" + sharedSum[4]);
    //     System.out.println("6\t" + sharedSum[5]);
    //     int DiceThrows = sharedSum[0] + sharedSum[1] + sharedSum[2] + sharedSum[3] + sharedSum[4] + sharedSum[5];
    //     System.out.println("Total Dice Throws = " + DiceThrows);

    // } catch (Exception e) {
    //     e.printStackTrace();
    // } finally {
    //     executor.shutdown(); // Shut down the executor
    // }