package part2.dp.pibonacci.memoization;

// int보다 long이 더 큰 값을 저장할 수 있기 때문에 long 사용
public class Fibonacci {
    private static long[] memo = new long[100];
    
    private static long fibo(int n) {
        if (n == 1 || n == 2) return 1;

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibo(n - 1) + fibo(n - 2);
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fibo(50));
    }
}
