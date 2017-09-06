/**
 * 잔돈을 계산하는 클래스
 * 
 * @author Android Hong
 *
 */
public class Calc {
	
	public static void main(String[] args) {
		
		// 1. 클래스를 생성한 후 메소드를 실행하는 방법
		//Calc calc = new Calc();
		//Calc.calc(10000, 4120);
		
		// 2. 메소드 자체를 static 으로 호출하는 방법
		//calc(10000, 4120);
		
		Change change = new Change();
		change.calc(10000,9500);
	}

	/**
	 * 설명 : 잔돈을 계산하는 메소드 
	 *
	 * @param pay : 지불금액
	 * @param buy : 구입금액
	 */
	public static void calc(int pay, int buy) {
		
		int change = pay-buy;

		System.out.printf("거스름돈 : %d \n", change);
		System.out.printf("오천원 : %d \n", change/5000);
		change %= 5000;
		System.out.printf("천원 : %d \n", change/1000);
		change %= 1000;
		System.out.printf("오백원 : %d \n", change/500);
		change %= 500;
		System.out.printf("백원 : %d \n", change/100);
		change %= 100;
		System.out.printf("오천원 : %d \n", change/50);
		change %= 50;
		System.out.printf("오천원 : %d \n", change/10);
		
	}
}
