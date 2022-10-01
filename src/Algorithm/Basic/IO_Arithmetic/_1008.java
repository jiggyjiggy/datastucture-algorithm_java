package Algorithm.Basic.IO_Arithmetic;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextFloat();
        double b = scanner.nextFloat();
        scanner.close();

        System.out.println(a / b);
    }
}
