# 떡볶이 떡 만들기

### 난이도 : 중
### 제한시간 : 40분
### 나의 풀이 시간 : 시간초과

#### key point
- 이진탐색 코드를 작성했지만 무한루프가 발생했고 calculateAmount()는 당연히 잘 작동되는 코드일 것이라는 생각으로 확인을 하지 않았던 것이 문제.
    - calculateAmount()는 남은 떡의 길이를 계산하는 메서드
    - 기존 코드는 무조건 높이만큼 빼주었기 때문에 음수가 더해짐
    - 개선된 코드에서는 h이상의 길이에 해당되는 떡만 계산해줌
    ```
        // 기존코드
        private static int calculateAmount(int h) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += arr[i] - h;
            }
            return sum;
        }

        // 개선 코드
        private static int calculateAmount(int h) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (arr[i] > h) {
                    sum += arr[i] - h;
                }
            }
            return sum;
        }
    ```