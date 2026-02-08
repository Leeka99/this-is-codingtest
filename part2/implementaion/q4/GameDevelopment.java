package q4;

import java.util.*;

// N * M 크기 맵, 각 칸은 육지 또는 바다이다.
// 캐릭터 움직임
// 1. 현재 위치에서 현재 방향 기준 왼쪽 방향부터 차례대로 갈 곳 정한다.
// 2. 캐릭터 바로 왼쪽 방향
public class GameDevelopment {
    static int[][] map; // 0 : 육지, 1 : 바다
    static boolean[][] visited;
    static int x, y, dir;
    static int cnt = 0, answer = 1;
    static int n, m; // 세로, 가로
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        map = new int[n][m];
        visited = new boolean[n][m];

        x = sc.nextInt();
        y = sc.nextInt();
        dir = sc.nextInt();
        visited[x][y] = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        sc.close();

        while (true) {
            // 왼쪽 회전
            turnLeft();

            // 돌린 후 좌표
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 왼쪽 칸 확인 후 가보지 않은 칸이면 이동
            if (canGo(nx, ny) && map[nx][ny] == 0 && !visited[nx][ny]) {
                x = nx;
                y = ny;
                visited[nx][ny] = true;
                answer++;
                cnt = 0;
                continue;
            }

            // 이미 가봤으므로 증가
            else
                cnt++;

            // 4 방향 모두 가봤다면
            if (cnt == 4) {
                nx = x - dx[dir];
                ny = y - dy[dir];
                if (canGo(nx, ny) && map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }

                else
                    break;
                cnt = 0;
            }
        }

        System.out.println(answer);
    }

    private static void turnLeft() {
        dir -= 1;

        if (dir < 0)
            dir = 3;
    }

    private static boolean canGo(int nx, int ny) {
        return 0 <= nx && 0 <= ny && nx < n && ny < m;
    }
}
