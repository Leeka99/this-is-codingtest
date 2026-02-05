package q3;
import java.util.*;

// 8 * 8 좌표, 나이트는 특정한 한 칸에 서있다.
// 나이트는 L자 형태로만 이용할 수 있다. 정원 밖으로는 나갈 수 없다.
// 행은 숫자로, 열은 a ~ h로 표현

// 나이트 이동 규칙
// 1. 수평 두칸 이동 -> 수직 한 칸 이동
// 2. 수직 두칸 이동 -> 수평 한 칸 이동

// 나이트가 이동할 수 있는 경우의 수를 출력하라.

public class LoyalNight {
    static int x, y, result;
    static int[] dx = {-2, -2, 2, 2, -1, 1, -1, 1};
    static int[] dy = {-1, 1, -1, 1, 2, 2, -2, -2};

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sc.close();

        x = input.charAt(1) - '1';
        y = input.charAt(0) - 'a';

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || 8 <= nx || 8 <= ny) continue;

            result++;
            
        }
        System.out.println(result);
    }
}