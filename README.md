JAVA Programing
----------------------------------------------------
#### 2017.09.05 2일차

###### 예제
____________________________________________________

  - [잔돈 구하기](https://github.com/Hooooong/DAY2_Change/blob/master/src/Change.java)
  - [반복문과 조건문으로 다양한 문양 출력](https://github.com/Hooooong/DAY2_Change/tree/master/src/testContorlFlow)

###### 공부정리
____________________________________________________
  - 객체지향이란?

      >   [__객체 지향 프로그래밍__](https://ko.wikipedia.org/wiki/%EA%B0%9D%EC%B2%B4_%EC%A7%80%ED%96%A5_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)(영어: Object-Oriented Programming, OOP)은 컴퓨터 프로그래밍의 패러다임의 하나이다. 객체 지향 프로그래밍은 컴퓨터 프로그램을 명령어의 목록으로 보는 시각에서 벗어나 여러 개의 독립된 단위, 즉 "객체"들의 모임으로 파악하고자 하는 것이다. 각각의 객체는 메시지를 주고받고, 데이터를 처리할 수 있다.객체 지향 프로그래밍은 프로그램을 유연하고 변경이 용이하게 만들기 때문에 대규모 소프트웨어 개발에 많이 사용된다. 또한 프로그래밍을 더 배우기 쉽게 하고 소프트웨어 개발과 보수를 간편하게 하며, 보다 직관적인 코드 분석을 가능하게 하는 장점을 갖고 있다. 그러나 지나친 프로그램의 객체화 경향은 실제 세계의 모습을 그대로 반영하지 못한다는 비판을 받기도 한다.

      - 객체는 실행시킬 수 있는 코드의 최소단위<br>
      - 함수도 객체와 동일함(이름으로 표현할 수 있다)<br>
      - 함수를 최소단위로 나누는 것이 좋다.<br>
      - 퍼포먼스 경우에는 함수를 나누는 것이 더 늦어질 수 있지만(함수 pointer로 인해)<br>코드의 의미를 부여하기 때문에 나중에 해석하기 좋다. (유지보수 측면에서)

  - [조건문 및 반복문](https://github.com/Hooooong/DAY2_Change/blob/master/src/ControlFlow.java)

      - 조건문 (if, switch)
        ```java
        // if문
        if(조건식1){
         // 조건식1이 참이라면 if 블록을 실행하고
        }else if(조건식2){
         // 조건식1이 거짓이라면 else if 문의 조건식2을 탐색하고, 참이라면 else if 블록을 실행한다.
        }else{
          // 모든 조건식이 거짓이라면 else 블록을 실행한다.
        }

        // switch문
        switch(조건식){
        　// 조건식이 되는 문이 () 안에 들어가게 된다.
        　case a:
        　　// 조건식이 a 라면 이 블록을 실행한다.
        　　break;
        　　// break 가 없지 않으면 하위 case 도 모두 실행하기 때문에 case 와 break는 같이 써줘야 한다.
        　default:
        　　// 모든 조건이 거짓이라면 default 블록을 실행한다.
        　　break;
        }
        ```

      - 반복문(for, while)
        ```java
        //for문
        //형식 : for(시작값; 종료값; 증감값)
        for(int index = 0 ; index < 5; index = index+1){
        // index 의 시작값 0 을 시작으로 1, 2, 3, 4 까지 총 5번 loop 하는 for문
        }

        // 향상된 for문
        int array[] = {1,2,3,4,5};
        for(int number : array){
        // array 의 타입인 int 형을 작성하면 array 배열의 크기에 맞게
        // number 에 1, 2, 3, 4, 5 가 차례대로 들어간다.
        }

        //while문
        while(조건식){
        // 조건이 참이라면 이 블록을 실행한다.
        }

        //do-while문
        do{
        //조건을 비교하지 않고 do 블록을 무조건 한번 실행한 후 조건을 비교한다.
        }while(조건식);
        ```

  - 인터페이스 규칙

      - 인터페이스란?

        >Interface를 어원을 찾아보면 Inter(중간) + face(맞대고 있는)이다. 어느 중간 사이에서 맞대고 있는 부분을 의미한다. User Interface란 사용자와 컴퓨터 사이에서 일어나는 상호작용을 매개하는 것을 말한다. 객체 지향 언어에서도 인터페이스란 객체와 객체 사이에서 일어나는 사이에서 상호 작용의 매개로 쓰인다.
Java에서는 Interface라는 키워드를 통해서 Interface를 생성할 수 있다. Interface로 할 수 있는 일이 무엇이냐 하면 클래스의 기본 틀을 제공하면서 다른 객체 사이에서의 중간 매개 역할도 담당한다는 것이다.

        - 'code 가 없는 정의서' 라고 볼 수 있다.
        - 하나의 인터페이스에 여러개의 메소드를 정의하는 것보다는 하나의 인터페이스에 1~2개 메소드를 정의하는 것이 좋다.

      - [인터페이스 규칙](https://github.com/Hooooong/DAY2_Change/tree/master/src/design)

        ```java
        // 인터페이스를 설계하는 방법
        // 접근제한자 + interface + 이름
        public interface IChange {
        	public void calc(int pay, int buy);
        	public default void move() {
        		System.out.println("뿌잉");
        	}

        	public static void close() {
        		System.out.println("뿡");
        	}
        }

        interface INewChange {

        }

        // 현재 다른 파일....
        // 인터페이스를 구현하기
        // 접근제한자 + class + 이름 + implements + 인터페이스이름
        class ChangeImpl implements IChange, INewChange{

        	@Override
        	public void calc(int pay, int buy) {
        		// 구현단의 코드를 작성하는 방법

        	}
        }
        ```
