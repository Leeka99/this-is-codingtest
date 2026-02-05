package q2;

import java.util.*;

// 정수 N 입력 시 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 
// 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램 작성하기
public class Time {
    static int n;
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        for (int h = 0; h <= n; h++) {
            String sh = Integer.toString(h);

            for (int m = 0; m < 60; m++) {
                String sm = Integer.toString(m);

                for (int s = 0; s < 60; s++) {
                    String ss = Integer.toString(s);

                    if (sh.contains("3") || sm.contains("3") || ss.contains("3"))
                        result++;
                }
            }
        }

        System.out.println(result);
    }
}
