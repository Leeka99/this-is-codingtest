package part3.greedy.q4;

import java.util.*;

public class ImpossibleAmount {
    private static int n;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);

        int target = 1;
        for (int i = 0; i < n; i++) {
            if (target < arr[i])
                break;
            target += arr[i];
        }
        System.out.println(target);
    }
}