/**
 * 거스름돈을 반복문을 사용하여 보여주는 클래스
 * 
 * @author Android Hong
 *
 */
public class Change {
	int changeArray[] = {5000, 1000, 500, 100, 50, 10};
	
	/**
	 * 거스름돈 계산 메소드
	 * 
	 * @param pay : 지불금액
	 * @param buy : 가격
	 */
	public void calc(int pay, int buy) {
		int change = pay- buy;
		print("총거스름", change);
		//System.out.println("총 거스름돈 : " + change);
		
		for(int gross : changeArray) {
			int count = change/gross; 
			//System.out.println(gross+"원 : " + count);
			print(Integer.toString(gross), count);
			change %= gross;
			
			/*
			if( count == 0) {
				continue;
			}else {
				//System.out.println(gross+"원 : " + count);
				print(Integer.toString(gross),count);
				change %= gross;
				
				if(change == 0) {
					break;
				}
			}
			*/
			
		}	
	}
	
	public void print(String flag, int count) {
		System.out.printf("%S원  = %d \n", flag, count);
	}
	
}
