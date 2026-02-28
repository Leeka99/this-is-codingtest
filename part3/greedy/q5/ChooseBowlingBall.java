package part3.greedy.q5;

import java.util.*;

public class ChooseBowlingBall {
    private static int n, m, answer = 0;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            arr[number]++;
        }

        sc.close();

        for (int i = 1; i <= m; i++) {
            n -= arr[i];
            answer += arr[i] * n;
        }

        System.out.println(answer);
    }
}
