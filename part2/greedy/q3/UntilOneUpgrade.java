package part2.greedy.q3;
import java.util.*;
public class UntilOneUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;

        while (true) {
            int number = (n / k) * k;
            cnt += n - number;
            
            n = number;

            if (n < k) break;

            n /= k;
            cnt++;
        }

        cnt += (n - 1);
        System.out.println(cnt);
    }
}
