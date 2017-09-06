/**
 * �Ž������� �ݺ����� ����Ͽ� �����ִ� Ŭ����
 * 
 * @author Android Hong
 *
 */
public class Change {
	int changeArray[] = {5000, 1000, 500, 100, 50, 10};
	
	/**
	 * �Ž����� ��� �޼ҵ�
	 * 
	 * @param pay : ���ұݾ�
	 * @param buy : ����
	 */
	public void calc(int pay, int buy) {
		int change = pay- buy;
		print("�ѰŽ���", change);
		//System.out.println("�� �Ž����� : " + change);
		
		for(int gross : changeArray) {
			int count = change/gross; 
			//System.out.println(gross+"�� : " + count);
			print(Integer.toString(gross), count);
			change %= gross;
			
			/*
			if( count == 0) {
				continue;
			}else {
				//System.out.println(gross+"�� : " + count);
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
		System.out.printf("%S��  = %d \n", flag, count);
	}
	
}
