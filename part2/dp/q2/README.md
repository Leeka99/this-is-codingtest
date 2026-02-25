# 개미 전사
### 난이도 : 중
### 제한 풀이시간 : 30분
### 나의 풀이시간 : 시간초과

#### key point
- 바텀업 방식으로 풀이함
- table[i] = max(table[i - 1], table[i - 2] + food[i])
    - food는 식량창고
    - table은 이전 값을 저장해 둔 dp table
    - i - 2번째 식량창고를 공격하면 제일 마지막 식량창고도 공격할 수 있으므로 food[i]값을 더해줌