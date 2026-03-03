# 무지의 먹방 라이브
### 난이도 : 하
### 제한 시간 : 30분
### 나의 풀이 시간 : 시간 초과

---
#### key point
- 우선순위 큐 활용
- 사용자 정의 클래스를 우선순위 큐에서 활용
- Comparator.comparingInt()를 활용하여 오름차순 정렬
- 시간을 1초씩 줄이지 않고 우선순위 큐를 사용하여 가장 작은 시간을 골라 한번에 시간을 빼주는 것이 포인트
    ```
        while (summary + ((pq.peek().getTime() - pre) * length) <= k) {
            int now = pq.poll().getTime();
            summary += (now - pre) * length;
            length--;
            pre = now;
        }
    ```