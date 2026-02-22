package part2.dp.pibonacci.dptable;

public class Fibonacci {
    private static long[] table = new long[100];
    public static void main(String[] args) {
        table[0] = 1;
        table[1] = 1;
        int n = 50;

        for (int i = 3; i < n + 1; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }

        System.out.println(table[n]);
    }
}
