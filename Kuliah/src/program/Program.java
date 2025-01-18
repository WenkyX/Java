package program;
public class Program {
    public static void main(String[] args) {
        int[] array = {82,95,28,39,57,49,57,81,74,37};

        System.out.printf("%s%8s%n", "Index" , "Value");

        for (int i = 0; i < 10; i++){
            System.out.printf("%5d%8d%n", i , array[i]);
        }
    }
}








