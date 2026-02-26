package part3.greedy.q1;

import java.util.*;

public class AdventurerGuild {
    private static int n, answer = 0, cnt = 0;
    private static int[] guild;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        guild = new int[n];
        for (int i = 0; i < n; i++) {
            guild[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(guild);

        for (int i = 0; i < n; i++) {
            cnt++;
            if (cnt >= guild[i]) {
                answer++;
                cnt = 0;
            }
        }
        System.out.println(answer);
    }
}