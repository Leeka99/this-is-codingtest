package part3.implementation.q1;

import java.util.*;

public class LuckyStraight {
    private static String n;
    private static char[] arr;
    private static int sum1 = 0, sum2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        sc.close();
        arr = new char[n.length()];
        arr = n.toCharArray();
        int middleIndex = n.length() / 2;

        for (int i = 0; i < n.length(); i++) {
            if (i < middleIndex) {
                sum1 += arr[i] - '0';
            } else {
                sum2 += arr[i] - '0';
            }
        }

        if (sum1 == sum2) {
            System.out.println("LOCKY");
        } else {
            System.out.println("READY");
        }
    }
}
