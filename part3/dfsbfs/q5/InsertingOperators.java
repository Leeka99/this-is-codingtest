package part3.dfsbfs.q5;

import java.util.*;

public class InsertingOperators {
    private static int n, maxAnswer = Integer.MIN_VALUE, minAnswer = Integer.MAX_VALUE;
    private static int[] numbers, operators;

    private static void dfs(int num, int cnt) {

        if (cnt == n) {
            maxAnswer = Math.max(maxAnswer, num);
            minAnswer = Math.min(minAnswer, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;

                if (i == 0)
                    dfs(num + numbers[cnt], cnt + 1);
                if (i == 1)
                    dfs(num - numbers[cnt], cnt + 1);
                if (i == 2)
                    dfs(num * numbers[cnt], cnt + 1);
                if (i == 3)
                    dfs(num / numbers[cnt], cnt + 1);

                operators[i]++;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        operators = new int[4];
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }
        sc.close();

        dfs(numbers[0], 1);
        System.out.println(maxAnswer);
        System.out.println(minAnswer);

    }
}
