# 게임 게발

### 난이도 : 중
### 제한 풀이시간 : 40분
### 나의 풀이시간 : 시간초과

---
#### key point
- 문제점 발견
    - while문에서 무한loop에 빠져서 더 이상 진행하지 못함.
    - 코드가 길어져서 어떤 기능을 담당하고 있는 코드인지 판별이 안되서 기능 테스트 오래 걸림 또는 불가
    - 결론: 지역변수와 전역변수를 구분하지 않아서 출력 오류 발생. -> 불필요한 변수 사용
        ```
        // 잘못 작성한 메서드
        // 전역변수 값을 변경하기 위한 메서드이지만 지역변수 값만 바뀌게 되도록 구현함
            static int dir;
            main {
                while(true) {
                    turnLeft(dir);
                    ...
                }
            }
            private static void turnLeft(int dir) {
                dir -= 1;
                if (dir < 0) dir = 3;
            }
        ```

        ```
        // 올바른 메서드
        // 의도대로 전역 변수 값만 변경
            static int dir;
            main {
                while(true) {
                    turnLeft();
                    ...
                }
            }
            private static void turnLeft() {
                dir -= 1;
                if (dir < 0) dir = 3;
            }
        ``` 

