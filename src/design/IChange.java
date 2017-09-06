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
