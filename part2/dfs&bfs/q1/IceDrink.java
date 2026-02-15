package q1;
import java.util.*;
// n * m , 뚤림 : 0 , 칸막이 : 1
// 뚤려있는 부분끼리 연결됨

public class IceDrink {
    static int n, m, answer = 0;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static boolean canGo(int nx, int ny) {
        return 0 <= nx && 0 <= ny && nx < n && ny < m;
    }

    public static boolean dfs(int x, int y) {
        if (canGo(x, y) && !visited[x][y] && map[x][y] == 0) {
            visited[x][y] = true;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                dfs(nx, ny);
            }
            return true;
        }
        return false;
    }

    public static void test() {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                int number = s.charAt(j) - '0';
                map[i][j] = number;
            }
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j)) answer++;
            }
        }
        System.out.println(answer);
    }
}
