package part3.greedy.q2;
import java.util.*;
public class MulOrAdd {
    private static char[] arr;
    private static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.nextLine().toCharArray();
        sc.close();
        answer += arr[0] - '0';
        for (int i = 1; i < arr.length; i++) {
            int number = arr[i] - '0';
            answer = Math.max(answer + number, answer * number);
        }
        System.out.println(answer);
    }
}
