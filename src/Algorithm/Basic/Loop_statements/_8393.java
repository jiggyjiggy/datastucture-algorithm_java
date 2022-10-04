package Algorithm.Basic.Loop_statements;

import java.util.Scanner;

public class _8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += i + 1;
        }
        System.out.println(ans);
    }
}
