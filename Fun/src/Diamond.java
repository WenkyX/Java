package Fun;


public class Diamond {
    public static void main(String[] args) {
    int diamond = 30;
    int increment = 2;
    int count;
    int invert = 1;
    
    for (int i = 0; i > -1; i += invert) {
        if (i == (diamond / 2)){
            invert *= -1;
        };
        count = i*increment;
        // System.out.print("debug : ");
        // System.out.print(count + " ");
        // System.out.print(i + " ");
        // System.out.print(increment + " ");
        System.out.print(" ".repeat(diamond * increment / 4 - count / 2));
        System.out.print("*".repeat(count + 1));
        System.out.println("");
        
    }


    }
}