package Algorithm.Basic.CheckJavaSyntax;

import java.util.Arrays;

/**
 * <h1>나열된 수에서 최솟값과 최댓값 구하기</h1>
 * <h2>문제 정의</h2>
 * <li>여러개의 수가 배열에 있을 때 그 중 가장 큰 값과 가장 작은 값을 찾는다</li>
 * <li>배열의 몇 번째에 있는지 순서를 찾는다</li>
 * <li>반복문을 한 번만 사용하여 문제를 해결한다</li>
 * <li>수의 예: [10, 55, 23, 2, 79, 101, 16, 82, 30, 45]</li>
 *
 * <h1>해결하기</h1>
 * 배열에 있는 수 중 맨 처음에 있는 값을 max와 min으로 가정하고, 배열의 마지막 숫자까지 비교하면서 더 큰 수나 더 작은 수가 나올때 max와 min의 값을 바꾸도록 한다.<br>
 * 그때의 위치를 변수에 저장한다.<br>
 */

public class _01 {
    public static void main(String[] args) {
        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
//        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];

        int maxPos = 0;
        int minPos = 0;

        int curPos = 0;

        for (int number : numbers) {

            if (max < number) {
                max = number;
                maxPos = curPos;
            }


            if (min > number) {
                min = number;
                minPos = curPos;
            }

            curPos += 1;
        }
        System.out.print(max + "\t" + maxPos + "\n");
        System.out.print(min + "\t" + minPos);
    }
}

