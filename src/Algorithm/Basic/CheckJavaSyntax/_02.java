package Algorithm.Basic.CheckJavaSyntax;

/**
 * <h1>정렬된 수에서 하나의 수의 위치 찾기</h1>
 *
 * <h2>문제 정의</h2>
 * <li>여러 개의 수가 정렬된 순서로 있을 때 특정한 수를 찾는 방법</li>
 * <li>단순 반복문을 이용하면 수의 개수에 따라 비교 횟수가 증가하는 O(n)의 수행이 이루어짐</li>
 * <li>수가 정렬된 상태에서는 이진 탐색(binary search)을 활용하면 매번 비교되는 요소의 수가 절반으로 감소될 수 있으므로 O(logN)의 수행으로 원하는 수를 찾을 수 있음</li>
 * <li>수의 예: [12, 25, 31, 48, 54, 66, 70, 83, 95, 108]</li>
 * <li>83의 위치 찾기</li>
 * <li>88의 위치 찾기 (배열에 없는 수)</li>
 *
 * <h2>해결 방법</h2>
 * <li>수가 정렬된 상태이므로 중간의 값을 하나 선택한다. 찾으려는 값이 그보다 크면 범위를 오른쪽으로, 그보다 작으면 범위를 왼쪽으로 좁힐수 있다.</li>
 * <li>한 번 비교 할때 마다 1/2씩 범위가 좁혀진다.</li>
 */

public class _02 {
    public static void main(String[] args) {
        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = 85;

        int leftIdx = 0;
        int rightIdx = numbers.length-1;
        int midIdx = (leftIdx + rightIdx) / 2;

        int temp = numbers[midIdx];
        boolean isFind = false;

        while (leftIdx < rightIdx) {

            if (target == temp) {
                isFind = true;
                break;

            } else if (target < temp) {
                rightIdx = midIdx - 1;

            } else {
                leftIdx = midIdx + 1;
            }

            midIdx = (leftIdx + rightIdx) / 2;
            temp = numbers[midIdx];

        }

        if (isFind) {
            midIdx++;
            System.out.println("find " + target + " " + midIdx);
        } else {
            midIdx = -1;
            System.out.println("not find " + target + " " + midIdx);
        }

    }
}
