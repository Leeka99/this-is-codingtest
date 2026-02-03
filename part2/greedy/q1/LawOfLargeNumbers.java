// 다양한 수로 이루어진 배열이 있을 때, 주어진 수들을 m번 더하여 가장 큰 수를 만들자
// 연속해서 k번 초과하여 더해질 수는 없다.
// 같은 숫자지만 다른 인덱스에 있다면 다른 수로 간주한다. 
import java.util.*;
public class LawOfLargeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[n - 1];
        int second = arr[n - 2];

        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);


        int answer = 0;
        answer += cnt * first;
        answer += second * (m - cnt);

        System.out.println(answer);

    }    
}