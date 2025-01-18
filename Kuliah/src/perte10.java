public class perte10 {
    public static void main(String[] args) {
        System.out.println(maxNumber(1,2));
        System.out.println(maxNumber(1.4,5.7));
    }

    public static int maxNumber(int a, int b) {
        int result;
        System.out.print("this is int function");
        if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;
    };

    public static double maxNumber(double a, double b){
        double result;
        System.out.print("this is double");
        if (a > b){
            result = a;
        }else{
            result = b;
        }
        return result;
    };
}
