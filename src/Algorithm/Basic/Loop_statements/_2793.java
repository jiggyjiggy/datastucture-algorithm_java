package Algorithm.Basic.Loop_statements;

import java.util.Scanner;

public class _2793 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 9; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + (n * (i + 1)));
        }
    }
}
