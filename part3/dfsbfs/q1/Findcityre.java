package part3.dfsbfs.q1;

import java.util.*;

public class Findcityre {
    
    // 인접 리스트 생성방법 숙지하기. 그래프 표현
    private static ArrayList<Integer>[] map;

    private static boolean[] visited;
    private static int n, m, k, x;
    private static ArrayList<Integer> answer = new ArrayList<>();

    private static void test() {
        for (int i = 1; i < map.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < map[i].size(); j++) {
                System.out.print(map[i].get(j) + ", ");
            }
            System.out.println();
        }
    }

    private static void bfs() {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] { x, 0 });
        visited[x] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int num = curr[0];
            int dist = curr[1];

            // dist가 기준 거리보다 초과되면 무시한다.
            // 바로 break하지 않는다.
            if (dist > k)
                continue;
            if (dist == k) {
                answer.add(num);
                continue;
            }

            // 안전한 처리
            // 1. visited 먼저 확인 후 삽입한다.
            // 2. 삽입 후 방문처리한다.
            for (int currNum : map[num]) {
                if (!visited[currNum]) {
                    queue.offer(new int[] { currNum, dist + 1 });
                    visited[currNum] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();

        map = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            map[num1].add(num2);
        }
        sc.close();
        bfs();
        Collections.sort(answer);
        if (answer.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < answer.size(); i++) {
                System.out.println(answer.get(i));
            }
        }
    }
}