package part2.dp.q1;

import java.util.*;

// X가 주어질 때
// 5로 나누어 떨어지는 경우 : 5로 나누기
// 3으로 나누어 떨어지는 경우 : 3으로 나누기
// 2로 나누어 떨어지는 경우 : 2로 나누기
// X에서 1 빼기
// 연산 4개를 적절히 사용해서 1을 만들기.
// 연산 횟수 최소값 구하기
public class MakeOne {

    public static int[] table;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        table = new int[x + 1];
        sc.close();

        for (int i = 2; i <= x; i++) {
            table[i] = table[i - 1] + 1;
            if (i % 2 == 0)
                table[i] = Math.min(table[i], table[i / 2] + 1);
            if (i % 3 == 0)
                table[i] = Math.min(table[i], table[i / 3] + 1);
            if (i % 5 == 0)
                table[i] = Math.min(table[i], table[i / 5] + 1);
        }

        System.out.println(table[x]);
    }
}
