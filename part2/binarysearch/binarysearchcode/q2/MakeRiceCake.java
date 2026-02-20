package part2.binarysearch.binarysearchcode.q2;

import java.util.*;

// 길이가 일정하지 않은 떡을 H의 높이로 자른다.
// H보다 짧은 떡은 잘리지 않는다.
// 잘린 길이만큼 손님이 가져간다.
// 손님이 M을 요청할 때 길이 최소 M만큼 떡을 얻기 위한 절단기의 길이를 구하라
public class MakeRiceCake {
    // n:떡의 개수, m : 손님 요청 길이
    private static int n, m;
    private static int[] arr;

    private static int binarySearch(int start, int end) {
        int amount = 0;
        int h = 0;

        while (true) {
            h = (start + end) / 2;
            amount = calculateAmount(h);

            if (m == amount)
                break;

            else if (m < amount) {
                start = h + 1;
            }

            else if (m > amount) {
                end = h - 1;
            }
        }

        return h;
    }

    private static int calculateAmount(int h) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > h) {
                sum += arr[i] - h;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(arr);

        System.out.println(binarySearch(0, arr[n - 1]));
    }
}
