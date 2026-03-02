# 우선순위 큐

#### 우선순위 큐란?
- 우선순위가 가장 높은 데이터를 가장 먼저 삭제
- 계속해서 가장 우선순위가 높은 걸 빠르게 꺼내야 할 때 사용

#### Queue vs Priority Queue 비교하기
- Queue (큐)
    - FIFO 구조이다.
    - 먼저 들어온게 먼저 나감(순서 : 입력 순서)
    - 자료 구조 : 연결 리스트
    - 사용 이유 : 순서대로 처리해야 할 때 (BFS)

- Priority Queue (우선순위 큐)
    - 기본은 작은 값이 먼저 나감
    - 입력 순서 무시
    - 자료 구조 : 힙
    - 사용 이유 : 항상 최대/최소 가 필요할 때

    #### heap
    - 항상 부모가 자식보다 작거나(크거나) 하도록 유지하는 완전 이진 트리이다.
        - 완전 이진 트리 : 왼쪽부터 빈칸없이 채워지는 트리
    - heap은 배열로 구현한다. (기준 : 인덱스 0부터 시작)
        - 부모 인덱스 : (i - 1) / 2
        - 왼쪽 자식 : 2i + 1
        - 오른쪽 자식 : 2i + 2
    
    #### 우선순위 큐 정렬
    - 기본적으로 오름차순 정렬된다.
        - peek() 사용시 가장 작은 값 우선으로 꺼냄
        - 만약 사용자 정의 클래스를 사용하고 싶다면 반드시 비교 변수 명을 지정해줘야 함
            - 지정하지 않는다면 에러 발생
        - 우선순위 큐 기본 
        ```
            // 기본형
            PriorityQueue<Integer> pq = new PriorityQueue<>();

            // 사용자 정의 클래스를 만들었다면
            // 사용자 정의 클래스 명: Food
            // 비교 할 변수 명 : time
            PriorityQueue<Food> pq = new PriorityQueue<>(Comparator.comparingInt(Food::getTime));

            // 만약 여러 변수를 사용해서 우선순위를 결정하고 싶다면
            // 1. time으로 먼저 비교. 2. time이 같다면 index 크기로 비교
            Comparator.comparingInt(Food::getTime).thenComparingInt(Food::getIndex);
        ```
        - 내림차순 정렬하고 싶다면
        ```
            // 기본형
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            // 사용자 정의 클래스를 만들었다면
            // 사용자 정의 클래스 명: Food
            // 비교 할 변수 명 : time
            PriorityQueue<Food> pq = new PriorityQueue<>(Comparator.comparingInt(Food::getTime)reversed());

            // 만약 여러 변수를 사용해서 우선순위를 결정하고 싶다면
            // 1. time으로 먼저 비교(내림차순). 2. time이 같다면 index 크기로 비교(오름차순)
            Comparator.comparingInt(Food::getTime).reversed().thenComparingInt(Food::getIndex);
            // 둘 다 내림차순으로 비교
            Comparator.comparingInt(Food::getTime).thenComparingInt(Food::getIndex).reversed();
        ```