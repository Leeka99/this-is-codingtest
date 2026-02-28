# 볼링공 고르기

### 난이도 : 하
### 제한 시간 : 30분
### 나의 풀이 시간 : 20분

---
#### key point
- 초기에는 2중 for문을 이용해서 서로 다른 조합을 찾았다. 
- O(n**2)
```
    for (int i = 0; i < m; i++) {
        for (int j = i + 1; j < m; j++) {
            answer++;
        }
    }
```
- 이후 개선된 방식을 사용했다.
    - 앞에서부터 무게별 개수를 빼면서 (현재 무게의 개수 * 남은 공 개수)를 계산했다. 
    - O(n + m) n은 입력받을 때, m은 계산할 때 소요
```
    for (int i = 0; i < n; i++) {
        int number = sc.nextInt();
        arr[number]++;
    }

    for (int i = 1; i <= m; i++) {
        n -= arr[i];
        answer += arr[i] * n;
    }
```