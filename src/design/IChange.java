package design;
/**
 * Interface : 'code 가 없는 정의서' 라고 볼 수 있다. 
 * 하나의 인터페이스에 여러개의 메소드를 정의하는 것보다는 하나의 인터페이스에 1~2개 메소드를 정의하는 것이 좋다.
 * @author Android Hong
 *
 */

// 인터페이스를 설계하는 방법
// 접근제한자 + interface + 이름
public interface IChange {
	
	// 상수 선언
	public int MAX_PAY = 10000;
	public int MIN_PAY = 0;

	// 추상 메소드 선언
	public void calc(int pay, int buy);
	
	/*
	 * JAVA 8 버전에 생긴 default 메소드
	 * 기존 인터페이스를 확장해서 새로운 기능을 추가하기 위해서 만들어졌다. 
	 */
	public default void move() {
		System.out.println("뿌잉");
	}
	
	/*
	 * JAVA 8버전에 생긴 static 메소드
	 * default 메소드와는 다르게  객체가 없이 인터페이스만으로도 호출이 가능하다.
	 */
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
	
	/*
	 * 인터페이스를 구현하는 클래스는 인터페이스가 가지고 있는 
	 * 모든 추상 메소드를에 대한 실체 메소드를 가지고 잇어야 한다.
	 * 이러한 실체 메소드를 정의하지 않으면 자동으로 '추상 클래스'가 된다. 
	 */
	@Override
	public void calc(int pay, int buy) {
		// 구현단의 코드를 작성하는 방법
		
	}
	
}
