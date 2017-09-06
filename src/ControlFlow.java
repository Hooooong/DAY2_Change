/**
 * 조건문 관련 Class 
 * 
 * @author Android Hong
 *
 */
public class ControlFlow {
	// 조건문
	// if, switch
	
	// if문
	public void checkIf() {
		int a = 10;
		int b = 5;
		
		if(a>b) {
			// a가 b보다 크면 실행되는 영역
			
		}else if(a == b){
			// a와 b가 같으면 실행되는 영역
			
		}else {
			// a가 b보다 작으면 실행되는 영역
		}
	}
	
	//switch 문
	public void checkSwitch() {
		int a = 10;

		// 조건이 되는 문이 () 안에 들어가게 된다.
		switch (a) {
		case 5:
			System.out.println("a는 5 입니다.");
			// break 가 없지 않으면 하위 case 도 모두 실행하기 때문에 case 와 break 는 같이 써줘야 한다.
			break;
		case 10:
			System.out.println("a는 10 입니다.");
			break;
		}
	}
	
	// 반복문
	// for, while

	// for문
	public void checkFor() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		
		// 일반적인 for문
		// 시작값; 종료값; 증감값;
		for( int  i = 0 ; i<array.length; i=i+1) {
			System.out.println( i + " 번쨰 : "+array[i]);
		}
		
		// 향상된 for문
		for(int number : array) {
			System.out.println(number);
		}
	}
	
	// while 문
	public void checkWhile() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		
		// 반복이 가능한 if문
		int count = 0;	//시작값
		while(count < array.length) {	// 종료값
			System.out.println(array[count]); 
			
			//count = count + 1;
			count++; // 증감값
		}
	}
	
	// do-while 문
	public void checkDoWhile() {
		int array[] = {1, 2, 3, 4, 5, 6, 7};
		int count = 0 ;
	
		// 무조건 한번 실행시키는 do-while문 (조건이 밑에 있기 때문에 처음에는 do를 실행한다.)
		do {
			
			System.out.println(array[count]); 
			//count = count + 1;
			count++; 
			
		}while(count < array.length);
	}
}
