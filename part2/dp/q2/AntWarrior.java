package part2.dp.q2;

import java.util.*;

public class AntWarrior {
    private static int n;
    private static int[] food;
    private static int[] table;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        food = new int[n];
        table = new int[n];

        for (int i = 0; i < n; i++) {
            food[i] = sc.nextInt();
        }

        sc.close();

        table[0] = food[0];
        table[1] = Math.max(food[0], food[1]);
        for (int i = 2; i < n; i++) {
            table[i] = Math.max(table[i - 1], table[i - 2] + food[n - 1]);
        }

        System.out.println(table[n - 1]);
    }
}
