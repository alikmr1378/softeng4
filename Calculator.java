import java.util.Scanner;

public class Calculator {
    public static double ma(int a) {
        double output = 1;
//        for(int i = 0; i < 10000; i++){
//            for(int j = 0; j < 100000; j++)
//                output = output * a;
//        }
        output = Math.pow(a, 1000000000);
        return output;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double output;
        int input;
        input = Integer.parseInt(scanner.nextLine());
        output = ma(input);
        System.out.println(output);
    }
}