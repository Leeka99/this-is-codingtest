package part2.binarysearch.binarysearchcode.q1;
import java.util.*;

// 부품 N 개, 각 부품은 고유 번호 있음
// 손님 M개 대량 구매
// 가게 안에 부품이 모두 있는지 확인하는 프로그램 작성하기
// 있으면 yes, 없으면 no 출력하라
public class FindPart {

    // 1 <= n <= 1000000
    // 1 <= m <= 100000
    private static int n, m;
    private static int[] nArr;
    private static int[] mArr;

    private static void nTest() {
        System.out.println("=================");
        for (int i = 0; i < n; i++) {
            System.out.print(nArr[i] + ", ");
        }
        System.out.println();
    }

    private static void mTest() {
        for (int i = 0; i < m; i++) {
            System.out.print(mArr[i] + ", ");
        }
    }

    private static boolean binarySearch(int target, int start, int end) {
        if (end < start) return false;

        int mid = (start + end) / 2;

        if (target == nArr[mid]) return true;

        else if (target < nArr[mid]) {
            end = mid - 1;
            return binarySearch(target, start, end);
        }

        else {
            start = mid + 1;
            return binarySearch(target, start, end);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        m = sc.nextInt();
        mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        sc.close();

        Arrays.sort(nArr);
        Arrays.sort(mArr);

        // nTest();
        // mTest();

        for (int i = 0; i < m; i++) {
            boolean bool = binarySearch(mArr[i], 0, n - 1);
            if (!bool) {
                System.out.print("no ");
            }

            else {
                System.out.print("yes ");
            }
        }
    }
}