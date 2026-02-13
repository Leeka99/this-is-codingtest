package bfs;
import java.util.*;

public class q1 {
    static boolean[] visited = new boolean[9];
    static List<List<Integer>> graph = new ArrayList<>();

    public static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visited[x] = true;

        while (!queue.isEmpty()) {
            int q = queue.poll();
            System.out.print(q + " ");
            for (int i = 0; i < graph.get(q).size(); i++) {
                int number = graph.get(q).get(i);
                if (!visited[number]) {
                    queue.offer(number);
                    visited[number] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            graph.add(new LinkedList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        bfs(1);

    }
}
