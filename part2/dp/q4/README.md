# 효율적인 화폐 구성
### 난이도 : 중
### 제한 시간 : 30분
### 나의 풀이 시간 : 시간 초과

#### key point
- 바텀업 방식을 이용해서 풀이함
- 초기 풀이방식으로 입력 예시에 대한 출력은 잘 나왔지만 이외 케이스에서 정답이 나오지 않을 것으로 판단함
```
    // 초기 코드
    // 화폐들의 조합에 대해서는 고려하지 못한 코드이다.
    // 한 종류의 동전만 사용해서 money를 만들 수 있는 경우만 계산한다.
    // ex) 2,3 으로 7을 만들 수 없다고 판단하는 코드이다.
    private static void dp(int money) {
        for (int i = 0; i < arr.length; i++) {
            if (money % arr[i] == 0) {
                table[money] = Math.min(money / arr[i], table[money]);
            }
        }
    }
```
- 이전 금액을 이용해서 현재 금액을 만든다. 라는 누적 조합 개념이 들어가야 한다.
```
    // 개선된 코드
    // table[j - arr[i]] + 1로 누적 조합을 고려함
    for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m; j++) {
                if (table[j - arr[i]] != 100) {
                    table[j] = Math.min(table[j], table[j - arr[i]] + 1);
                }
            }
        }
```