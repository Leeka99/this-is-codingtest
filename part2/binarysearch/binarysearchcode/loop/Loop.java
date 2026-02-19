package part2.binarysearch.binarysearchcode.loop;

import java.util.Scanner;

public class Loop {
    private static int n, target, start, end;
    private static int[] arr;

    private static void test() {
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int binarySearch() {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) return mid;

            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else if (target < arr[mid]){
                end = mid - 1;
            }
        }

        return -1;
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

        // test();

        int answer = binarySearch();
        if (answer == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }

        else {
            System.out.println(answer + 1);
        }

    }
}
