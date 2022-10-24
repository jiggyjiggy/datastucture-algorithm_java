package Algorithm.Basic.CheckJavaSyntax;

/**
 * <h1>정렬 알고리즘</h1>
 *
 * <h2>평균 수행 시간이 O(n^2)인 알고리즘</h2>
 * <li>버블 정렬(Bubble Sort), 삽입 정렬(Insertion Sort), 선택 정렬(Selection Sort)</li>
 * <li>각 요소가 다른 요소와 평균 한번 이상씩 비교를 하여 정렬 됨</li>
 *
 * <h2>Insertion Sort 구현해보기</h2>
 * <li>Insertion Sort의 기본 개념은 이미 정렬된 상태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념이다.(손안의 카드)</li>
 * <li>두 번째 요소 부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘</li>
 */

public class _03 {
    public static void main(String[] args) {
        int[] arr = {80, 50, 70, 10, 60, 20, 40, 30};

        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int i = 0, j = 0;
        int temp = 0;

        for (i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while ((j>0) && (arr[j-1] > temp)) {
                arr[j] = arr[j-1];
                j = j - 1;
            }
            arr[j] = temp;

            System.out.println("반복 " + i);
            printSort(arr);
        }
    }

    private static void printSort(int[] arr) {
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
