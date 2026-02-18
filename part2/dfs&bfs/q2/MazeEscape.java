package q2;
import java.util.*;

// 미로 : N * M
// 처음 위치 : 1,1 
// 출구 : N, M
// 괴물 : 0 , 괴물 x : 1
// 탈출 위해 움직여야 하는 최소 칸의 개수는?

public class MazeEscape {
    private static int[][] graph;
    private static int n, m;

    private static int[] dx = { -1, 0, 1, 0 };
    private static int[] dy = { 0, 1, 0, -1 };

    private static void test() {
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static class Node {
        private int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean canGo(int nx, int ny) {
        return 0 <= nx && 0 <= ny && nx < n && ny < m;
    }

    private static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.x;
            y = node.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx == 1 && ny == 1) continue;

                if (!canGo(nx, ny))
                    continue;
                if (graph[nx][ny] == 0)
                    continue;

                if (graph[nx][ny] == 1) {
                    queue.offer(new Node(nx, ny));
                    graph[nx][ny] = graph[x][y] + 1;
                }
            }

        }
        return graph[n - 1][m - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        sc.close();
        System.out.println(bfs(0, 0));
        test();
    }
}