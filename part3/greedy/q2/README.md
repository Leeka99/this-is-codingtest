# 곱하기 혹은 더하기

### 난이도 : 하
### 제한 시간 : 30분
### 나의 풀이 시간 : 5분

---
#### key point
- 현재 상황에서 가장 큰 수를 선택하는 방식으로 해결했다.
```
    for (int i = 1; i < arr.length; i++) {
        int number = arr[i] - '0';
        answer = Math.max(answer + number, answer * number);
    }   
```