package Algorithm.Basic;

import java.util.Scanner;

public class _18108 {
    public static void main(String[] args) {
        final int SHIFT = 2541 - 1998;

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        System.out.println(a-SHIFT);
    }
}
