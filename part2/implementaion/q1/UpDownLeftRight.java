package q1;

import java.util.*;

// 1,1 시작, n,n 끝, 시작좌표 : 1,1
// 지도 범위 벗어나면 무시

public class UpDownLeftRight {

    static int n;
    static int x = 1, y = 1;
    static String[] trip;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static String[] dir = {"L", "R", "U", "D"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        trip = sc.nextLine().split(" ");
        sc.close();

        for (int i = 0; i < trip.length; i++) {
            for (int j = 0; j < dir.length; j++) {
                if (trip[i].equals(dir[j])) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if (nx < 1 || ny < 1 || n < nx || n < ny) continue;
                    x = nx;
                    y = ny;
                }
            }
        }

        System.out.println(x + " " + y);

    }
}
