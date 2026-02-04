// N이 1이 될 때까지 아래 과정 중 하나를 반복적으로 선택
// 2번은 N이 K로 나누어떨어질 때 선택할 수 있다.
/**
 * 1. N에서 1을 뺀다.
 * 2. N을 K로 나눈다.
 */

package part2.greedy.q3;

import java.util.*;

public class UntilOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.close();

        int cnt = 0;

        while (n > 1) {

            while (n % k == 0) {
                n /= k;
                cnt++;
            }

            if (n > 1) {
                n -= 1;
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
