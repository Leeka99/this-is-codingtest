package part2.greedy.q2;
import java.util.*;
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for(int i = 0; i < n; i++) {
            int number = 10001;
            for (int j = 0; j < m; j++) {
                number = Math.min(number, arr[i][j]);
            }
            result = Math.max(result, number);
        }

        System.out.println(result);
    }
}
