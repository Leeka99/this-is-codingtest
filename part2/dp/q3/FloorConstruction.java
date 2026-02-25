package part2.dp.q3;

import java.util.*;

// 가로 길이 : n , 세로 길이 : 2 일때 바닥을 채우는 모든 경우의 수를 구하라.
// 덮개는 1*2 , 2*1 , 2*2가 있다. (세로, 가로)
// 최종 답: 방법의 수 % 796796
public class FloorConstruction {
    private static int n;
    private static int[] table;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        table = new int[n + 1];
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                table[i] = table[i - 1] + 3;
            } else {
                table[i] = table[i - 1] + 1;
            }
        }

        System.out.println(table[n] % 796796);
    }
}