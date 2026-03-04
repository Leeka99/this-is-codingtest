package part3.implementation.q2;

import java.util.*;

public class StringReordering {
    private static String s;
    private static int sum = 0;
    private static char[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        sc.close();

        arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 'A' < 0) {
                sum += arr[i] - '0';
            }
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println(sum);
    }
}
