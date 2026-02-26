package part3.greedy.q3;
import java.util.*;
public class FlipString {
    private static char[] arr;
    private static int p1 = 0, p2 = 0, point;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.nextLine().toCharArray();
        sc.close();
        point = arr[0] - '0';
        if (point == 0) {
            p1++;
        }
        else {
            p2++;
        }

        for (int i = 1; i < arr.length; i++) {
            int number = arr[i] - '0';
            if (point != number && point == 0) {
                point = number;
                p1++;
            }
            if (point != number && point == 1){
                point = number;
                p2++;
            }
        }


        System.out.println(Math.min(p1, p2));
        System.out.println(p1 +", "+ p2);
    }
}
