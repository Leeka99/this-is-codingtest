package part2.dp.q4;

import java.util.*;

// n가지 화폐 개수가 있다.
// 최소한으로 이용해서 합이 m원이 되도록 해라. (화폐는 몇 개라도 사용할 수 있다.)
// 최종으로 최소 이용 개수를 출력하라. (불가능하다면 -1을 출력)
public class EfficientMoney {
    private static int n, m;
    private static int[] arr;
    private static int[] table;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        table = new int[m + 1];
        Arrays.fill(table, 100);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        table[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                if (table[j - arr[i]] != 100) {
                    table[j] = Math.min(table[j], table[j - arr[i]] + 1);
                }
            }
        }

        if (table[m] == 100) {
            System.out.println(-1);
        }

        else {
            System.out.println(table[m]);
        }
    }
}
