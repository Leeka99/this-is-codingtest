# 상하좌우

### 난이도 : 하
### 제한 풀이시간 : 15분
### 나의 풀이시간 : 시간초과

---
#### key Point
- 일련의 명령에 따라서 개체를 차례대로 이동시킨다는 점에서 시뮬레이션 유형으로 분류되는 문제다.
- 구현 문제답게 어떻게 풀어야할지는 떠오르지만 코드로 풀어내지 못했다.<br>
- 무작정 코드를 작성했던 것이 문제이다.<br>
- 상하좌우 방향에 따라 위치를 계산하는 배열을 사용하자.

    ```
    // L, R, U, D에 따른 이동방향

    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]
    move_types = ['L', 'R', 'U', 'D']

    ```

- Scanner 입력 문제 발생
    ```
    // 아래 입력을 올바르게 받기 못하는 코드이다. 

    (입력)
    5
    R R R U D D

    // 잘못된 코드  
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    trip = sc.nextLine().split(" "); // \n 제거되지 않은 상태
    sc.close();

    // 올바른 코드
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.nextLine(); // 엔터 제거
    trip = sc.nextLine().split(" ");
    sc.close();
    ```
- sc.nextInt()는 정수만 읽고 /n은 읽어들이지 않는다.
- 5를 입력 받은 뒤 \n R R R U D D \n 상태가 된다.
- 따라서 nextLine()을 읽어들이는 순간 /n만 읽어들인다.
- BufferedReader의 ReadLine()의 개념과 혼동해서 발생한 문제이다.
    - BufferedReader의 ReadLine()은 항상 한 줄 전체(엔터까지) 읽음
    - Scanner의 nextLine()은 현재위치부터 개행문자(\n)를 만날 때까지 문자열을 읽음
    - Scanner의 nextInt()는 토큰(정수)만 읽고 엔터는 남김