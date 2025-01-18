
import java.util.Scanner;
public class perte6 {

    public static void array(){
        int[] array = new int [10];

        array[3] = 1234;

        System.out.println("Index" + "\t" + "Value");
        for (int counter = 0;counter < array.length; counter++) {
            System.out.println(counter + "\t" + array[counter]);
        }
    }

    public static void array1(){
        final int arrLength = 10;
        int[] arr = new int [arrLength];
        
        for (int counter1 = 0; counter1 < arrLength; counter1++){
            arr[counter1] = 2 + 2 * counter1;
        }

        System.out.println("Index" + "\t" + "Value");
        for (int counter = 0;counter < arrLength; counter++) {
            System.out.println(counter + "\t" + arr[counter]);
        }
    }

    public static void arraySum(){
        final int arrLength = 10;
        int[] arr = new int [arrLength];
        int sum = 0;

        arr = new int[] {1,2,3,5,6,78,4,3,6,7};

        for (int counter = 0;counter < arrLength; counter++) {
            sum += arr[counter];
        }
        System.out.println("sum of array data is = " + sum);
    }

    public static void twoDArray(){
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}}; 
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Values in array1 by row are"); 
        outputArray (array1);
        System.out.printf("%nValues in array2 by row are%n"); 
        outputArray (array2);
        }

    public static void outputArray (int[][] array) { 
        for (int row= 0; row < array.length; row++) {
            for (int column = 0; column < array [row].length; column++) { 
                System.out.printf("%d ", array [row] [column]);
            }
        System.out.println();
        }
    }

    

    public static void twoDArrayAddition(){
        Scanner input = new Scanner(System.in);
        int R;
        int C;


        System.err.println("Jumlah Row = ");
        R = input.nextInt();
        System.err.println("Jumlah Collomn = ");
        C = input.nextInt();

        int[][] arr1 = new int[R][C];
        int[][] arr2 = new int[R][C];
        int[][] sum = new int [R][C];

        System.out.println("Enter First Array Data = ");
        for (int i = 0;i < R;i++){
            for (int ii = 0; ii < C;ii++){
                arr1[i][ii] = input.nextInt();
            }
        }

        System.out.println("Enter Second Array Data = ");
        for (int i = 0;i < R;i++){
            for (int ii = 0; ii < C;ii++){
                arr2[i][ii] = input.nextInt();
            }
        }

        for (int i = 0;i < R;i++){
            for (int ii = 0; ii < C;ii++){
                sum[i][ii] = arr2[i][ii] + arr1[i][ii];
            }
        }

        System.out.println("Jumlah kedua arrays adalah");
        for (int i = 0;i < R;i++){
            if (i != 0) {
                System.out.println("");
            }
            for (int ii = 0; ii < C;ii++){
                System.out.print(sum[i][ii] + "\t");
            }
        }

    }

    public static void main(String[] args) {
        // array1();
        // array();
        // arraySum();
        twoDArrayAddition();
        // twoDArray();
        
    }
    
}