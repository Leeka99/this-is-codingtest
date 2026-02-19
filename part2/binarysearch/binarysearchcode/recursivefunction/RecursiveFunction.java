package part2.binarysearch.binarysearchcode.recursivefunction;

import java.util.*;

// 정렬된 정수들이 입력된다.
public class RecursiveFunction {

    private static int n, target, start, end;
    private static int[] arr;

    private static int binarySearch() {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (arr[mid] == target)
            return mid;

        else if (arr[mid] < target) {
            start = mid + 1;
            return binarySearch();
        }

        else {
            end = mid - 1;
            return binarySearch();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        target = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        start = 0;
        end = n - 1;

        int answer = binarySearch();

        if (answer == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(answer + 1);
        }
    }
}
