package Algorithm.Basic.IO_Arithmetic;

import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {
        int[] target = {1, 1, 2, 2, 2, 8};
        int[] arr = new int[target.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < target.length; i++) {
            int a = scanner.nextInt();
            arr[i] = target[i] - a;
        }

        for (int i = 0; i < target.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
