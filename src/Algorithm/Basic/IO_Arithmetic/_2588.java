package Algorithm.Basic.IO_Arithmetic;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int b1 = ((b / 100) % 10);
        int b10 = ((b / 10) % 10);
        int b100 = (b % 10);

        System.out.println(a * b100);
        System.out.println(a * b10);
        System.out.println(a * b1);
        System.out.println(a * b);
    }
}
